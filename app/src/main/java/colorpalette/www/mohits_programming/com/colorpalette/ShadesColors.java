package colorpalette.www.mohits_programming.com.colorpalette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.BlueColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.DeepPurpleColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.IndigoColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.OrangeColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.PinkColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.PurpleColorShade;
import colorpalette.www.mohits_programming.com.colorpalette.ShadesColor.RedColorShade;

public class ShadesColors extends AppCompatActivity {

    private CardView red_color_card_view,blue_color_card_view,orange_color_card_view,pink_color_card_view,purple_color_card_view;
    private CardView deep_purple_color_card_view,indigo_color_card_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shades_colors);
        red_color_card_view = (CardView) findViewById(R.id.red_color_card_view);
        red_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, RedColorShade.class);
                startActivity(intent);
            }
        });
        blue_color_card_view = (CardView) findViewById(R.id.blue_color_card_view);
        blue_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, BlueColorShade.class);
                startActivity(intent);
            }
        });
        orange_color_card_view = (CardView) findViewById(R.id.orange_color_card_view);
        orange_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, OrangeColorShade.class);
                startActivity(intent);
            }
        });
        pink_color_card_view = (CardView) findViewById(R.id.pink_color_card_view);
        pink_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, PinkColorShade.class);
                startActivity(intent);
            }
        });
        purple_color_card_view = (CardView) findViewById(R.id.purple_color_card_view);
        purple_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, PurpleColorShade.class);
                startActivity(intent);
            }
        });
        deep_purple_color_card_view = (CardView) findViewById(R.id.deep_purple_color_card_view);
        deep_purple_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, DeepPurpleColorShade.class);
                startActivity(intent);
            }
        });
        indigo_color_card_view = (CardView) findViewById(R.id.indigo_color_card_view);
        indigo_color_card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShadesColors.this, IndigoColorShade.class);
                startActivity(intent);
            }
        });
    }
}