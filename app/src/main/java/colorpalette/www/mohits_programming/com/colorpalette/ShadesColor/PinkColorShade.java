package colorpalette.www.mohits_programming.com.colorpalette.ShadesColor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import colorpalette.www.mohits_programming.com.colorpalette.R;

public class PinkColorShade extends AppCompatActivity {


    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;
    private String[] strings = new String[]{
            "#f44336",
            "#ffebee",
            "#ef9a9a",
            "#e57373",
            "#ef5350",
            "#e53935",
            "#d32f2f",
            "#c62828",
            "#b71c1c",
            "#ff8a80",
            "#ff5252",
            "#ff1744"
         };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pink_color_shade);
        imageView = (ImageView) findViewById(R.id.copy_image_1);
        imageView1 = (ImageView) findViewById(R.id.copy_image_2);
        imageView2 = (ImageView) findViewById(R.id.copy_image_3);
        imageView3 = (ImageView) findViewById(R.id.copy_image_4);
        imageView4 = (ImageView) findViewById(R.id.copy_image_5);
        imageView5 = (ImageView) findViewById(R.id.copy_image_7);
        imageView6 = (ImageView) findViewById(R.id.copy_image_8);
        imageView7 = (ImageView) findViewById(R.id.copy_image_9);
        imageView8 = (ImageView) findViewById(R.id.copy_image_10);
        imageView9 = (ImageView) findViewById(R.id.copy_image_11);
        imageView10 = (ImageView) findViewById(R.id.copy_image_12);
        imageView11= (ImageView) findViewById(R.id.copy_image_13);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[0])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[0]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[1])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[1]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[2])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[2]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[3])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[3]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[4])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[4]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[5])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[5]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[6])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[6]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[7])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[7]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[8])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[8]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[9])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[9]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[10])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[10]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ((ClipboardManager) getApplicationContext().getSystemService(CLIPBOARD_SERVICE)).setPrimaryClip((ClipData.newPlainText("h1",strings[11])));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Color ");
                stringBuilder.append(strings[11]);
                stringBuilder.append(" Copied");
                Toast.makeText(PinkColorShade.this, stringBuilder.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
