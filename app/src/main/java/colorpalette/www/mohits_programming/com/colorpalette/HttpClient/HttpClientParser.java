package colorpalette.www.mohits_programming.com.colorpalette.HttpClient;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpClientParser{

    private String BASE_URL = "http://www.thecolorapi.com/id?hex=";

    public String getJsondata(String color_Value){

        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;

        try {

            httpURLConnection = (HttpURLConnection)(new URL (BASE_URL + color_Value)).openConnection ();
            httpURLConnection.setRequestMethod ("GET");
            httpURLConnection.setDoInput (true);
            httpURLConnection.connect ();

            StringBuffer stringBuffer = new StringBuffer ();
            inputStream = httpURLConnection.getInputStream ();
            BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (inputStream));
            String line = "";
            while ( (line = bufferedReader.readLine ()) !=null ){
                stringBuffer.append (line+"\n");
            }
            inputStream.close ();
            httpURLConnection.disconnect ();

            return stringBuffer.toString ();

        }catch (Exception e){
            e.printStackTrace ();
        }

        finally {
            try {
                inputStream.close ();
                httpURLConnection.disconnect ();
            }catch (Exception e){

            }
        }

        return null;

    }


}
