package colorpalette.www.mohits_programming.com.colorpalette;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import colorpalette.www.mohits_programming.com.colorpalette.HttpClient.HttpClientParser;
import colorpalette.www.mohits_programming.com.colorpalette.JsonParser.JsonParser;
import colorpalette.www.mohits_programming.com.colorpalette.Model.ColorsValues;

public class ColorByHexaDecimal extends AppCompatActivity implements View.OnClickListener{

    private EditText edit_color;
    private Button button_get;
    private TextView show_color;

    private TextView ColorName;
    private TextView ColorValue;
    private TextView RGBValue;
    private TextView HSLValue;
    private TextView HSVValue;

    private CardView cardView;

    private String color;
    private String GET_JSON_DATA;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_color_by_hexa_decimal);

        edit_color =(EditText) findViewById (R.id.color_edit_value);
        button_get = (Button) findViewById (R.id.load_information);
        show_color = (TextView) findViewById (R.id.text_color_value);

        ColorName = (TextView) findViewById (R.id.color_txt_name);
        ColorValue = (TextView) findViewById (R.id.color_txt_value);
        RGBValue = (TextView) findViewById (R.id.r_g_b_txt_color_value);
        HSLValue = (TextView) findViewById (R.id.h_s_l_color_value);
        HSVValue = (TextView) findViewById (R.id.h_s_v_color_value);


        cardView = (CardView) findViewById (R.id.cardbackgroundcolorset);
        button_get.setOnClickListener (ColorByHexaDecimal.this);
    }

    @Override
    public void onClick (View v) {
        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService (INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow (button_get.getWindowToken (),0);


        if(haveNetworkConnection()){

            if(edit_color.getText ().toString ().isEmpty ()){
                Toast.makeText (ColorByHexaDecimal.this, "Enter hexValue (#123456)", Toast.LENGTH_SHORT).show ();
            }else if(edit_color.getText ().toString ().startsWith ("#")){
                Toast.makeText (ColorByHexaDecimal.this, "Please Remove #", Toast.LENGTH_SHORT).show ();
            }
            else if(edit_color.getText().length()==1||edit_color.getText().length()==2||edit_color.getText().length()==4||edit_color.getText().length()==5){
                Toast.makeText(this, "Please Inter 6 Digit Hexa Value.", Toast.LENGTH_SHORT).show();
            }
            else {
                ColorBackTask colorBackTask = new ColorBackTask (ColorByHexaDecimal.this);
                color = edit_color.getText ().toString ();
                edit_color.setText ("");
                colorBackTask.execute ();
            }


        }else{
            Toast.makeText(this, "Please Check Your Internet Connection.", Toast.LENGTH_SHORT).show();
        }

    }


    class ColorBackTask extends AsyncTask<String,Void,ColorsValues> {

        private Context context;
        private ProgressDialog progressDialog;

        public ColorBackTask (Context context) {
            this.context = context;
            progressDialog = new ProgressDialog (context);
        }

        @Override
        protected void onPreExecute () {
            progressDialog.setTitle ("Getting information");
            progressDialog.show ();
        }

        @Override
        protected ColorsValues doInBackground (String... strings) {

            ColorsValues colorsValues = new ColorsValues ();
            HttpClientParser httpClientParser =new HttpClientParser ();
            GET_JSON_DATA = httpClientParser.getJsondata (color);
            colorsValues = JsonParser.getColorInformation (GET_JSON_DATA);


            return  colorsValues;
        }

        @Override
        protected void onPostExecute (ColorsValues colorsValues) {
            super.onPostExecute (colorsValues);

            ColorName.setText (colorsValues.getColor_name ());
            ColorValue.setText (colorsValues.getHex_value_color ());
            RGBValue.setText (colorsValues.getR_g_b_color_value ());
            HSLValue.setText (colorsValues.getH_s_l_color_value ());
            HSVValue.setText (colorsValues.getH_s_v_color_value ());
            final String[] strings = {colorsValues.getHex_value_color ()};
            cardView.setCardBackgroundColor (Color.parseColor (strings[0]));
            if ( progressDialog.isShowing () ){
                progressDialog.dismiss ();
            }
        }
    }

    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }


}
