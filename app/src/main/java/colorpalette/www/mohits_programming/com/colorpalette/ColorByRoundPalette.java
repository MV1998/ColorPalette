package colorpalette.www.mohits_programming.com.colorpalette;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.osama.gentlepalette.GentlePalette;
import com.osama.gentlepalette.Palettes;

public class ColorByRoundPalette extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_by_round_palette);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ((EditText) findViewById(R.id.in_color))
                .addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        try {
                            findViewById(R.id.c1).setBackgroundColor(Color.parseColor(charSequence.toString()));
                            GentlePalette.generate(Color.parseColor(((EditText) findViewById(R.id.in_color)).getText().toString()), Palettes.MATERIAL_COLORS, color -> setColor(color));
                        } catch (Exception ignored) {}
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {}
                });
    }

    public void round(View view) {
        try {
            findViewById(R.id.c1).setBackgroundColor(Color.parseColor(((EditText) findViewById(R.id.in_color)).getText().toString()));
            GentlePalette.generate(Color.parseColor(((EditText) findViewById(R.id.in_color)).getText().toString()), Palettes.MATERIAL_COLORS,this::setColor);
        } catch (Exception e) {
            Toast.makeText(this, "please insert a color in #XXXXXX format", Toast.LENGTH_LONG).show();
        }
    }

    public void setColor(int color) {
        findViewById(R.id.c2).setBackgroundColor(color);
        ((TextView) findViewById(R.id.out_color)).setText(String.format("#%06X", (0xFFFFFF & color)));
    }

}
