package colorpalette.www.mohits_programming.com.colorpalette;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ColorByColorPickerDialog extends AppCompatActivity {


    private Button color_picker_button;
    private TextView ShowColor;
    

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_color_by_color_picker_dialog);


        ShowColor=(TextView)findViewById(R.id.textView);
        color_picker_button = (Button) findViewById (R.id.ButtonA);
        color_picker_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {


                if (ShowColor.getBackground() instanceof ColorDrawable) {
                    ColorDrawable cd = (ColorDrawable) ShowColor.getBackground();
                    int colorCode = cd.getColor();
                    //pick a color (changed in the UpdateColor listener)
                    new ColorPickerDialog(ColorByColorPickerDialog.this, new UpdateColor(), colorCode).show();
                }


            }
        });
    }


    public class UpdateColor implements ColorPickerDialog.OnColorChangedListener {
        public void colorChanged(int color) {
            ShowColor.setBackgroundColor(color);
            //show the color value
            ShowColor.setText("0x"+String.format("%08x", color));
        }
    }

}
