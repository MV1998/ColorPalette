package colorpalette.www.mohits_programming.com.colorpalette;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.internal.Util;

public class ColorByImage extends AppCompatActivity {

    private TextView vibrantView;
    private TextView vibrantLightView;
    private TextView vibrantDarkView;
    private TextView mutedView;
    private TextView mutedLightView;
    private TextView mutedDarkView;
    private ImageView imageView;
    private Button button;
    private static int RESULT = 1;
    Bitmap bitmap;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_by_image);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        initViews();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,RESULT);
            }
        });

    }


    private void initViews() {
        vibrantView = (TextView) findViewById(R.id.vibrantView);
        vibrantLightView = (TextView) findViewById(R.id.vibrantLightView);
        vibrantDarkView = (TextView) findViewById(R.id.vibrantDarkView);
        mutedView = (TextView) findViewById(R.id.mutedView);
        mutedLightView = (TextView) findViewById(R.id.mutedLightView);
        mutedDarkView = (TextView) findViewById(R.id.mutedDarkView);
        button = (Button) findViewById(R.id.button);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT && resultCode == RESULT_OK && null != data) {

            Uri selectedImage = data.getData();


            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),selectedImage);
            } catch (IOException e) {
                e.printStackTrace();
            }

//            String[] filePathColumn = { MediaStore.Images.Media.DATA };
//            Cursor cursor = getContentResolver().query(selectedImage,filePathColumn, null, null, null);
//            cursor.moveToFirst();
//            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
//            String picturePath = cursor.getString(columnIndex);
//            cursor.close();
            ImageView imageView = (ImageView) findViewById(R.id.imageWallpaper);
            imageView.setImageBitmap(bitmap);

//            Bitmap bitmap = BitmapFactory.decodeFile(picturePath);

            Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
                @Override
                public void onGenerated(Palette palette) {
                    //work with the palette here
                    int defaultValue = 1;



                    int vibrant = palette.getVibrantColor(defaultValue);

                   Palette.Swatch ps = palette.getVibrantSwatch();

                    int vibrantLight = palette.getLightVibrantColor(defaultValue);
                    int vibrantDark = palette.getDarkVibrantColor(defaultValue);
                    int muted = palette.getMutedColor(defaultValue);
                    int mutedLight = palette.getLightMutedColor(defaultValue);
                    int mutedDark = palette.getDarkMutedColor(defaultValue);

                    vibrantView.setBackgroundColor(vibrant);
                    vibrantLightView.setBackgroundColor(vibrantLight);
                    vibrantDarkView.setBackgroundColor(vibrantDark);
                    mutedView.setBackgroundColor(muted);
                    mutedLightView.setBackgroundColor(mutedLight);
                    mutedDarkView.setBackgroundColor(mutedDark);
//
//                    vibrantView.setText(Integer.toHexString(bitmap.getPixel(0,0))+"");
//                    vibrantLightView.setText(Integer.toHexString(bitmap.getPixel(31,0)));
//                    vibrantDarkView.setText(Integer.toHexString(bitmap.getPixel(0,31)));
                }
            });
        }
    }


}
