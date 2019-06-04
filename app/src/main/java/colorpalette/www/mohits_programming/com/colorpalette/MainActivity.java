package colorpalette.www.mohits_programming.com.colorpalette;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.FileProvider;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private android.support.v7.widget.Toolbar toolbar;
    private TextView header_title_text;
    private Typeface typeface;

    private String finalValue;

    private CardView get_color_by_hexa;
    private CardView get_color_by_seekbar;
    private CardView get_color_by_color_picker_dialog;
    private CardView get_color_by_image;
    private CardView get_color_by_round_palette;

    private LinearLayout linearLayout;




    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);



        get_color_by_hexa = (CardView) findViewById (R.id.get_color_by_hexa);
        get_color_by_hexa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                    Intent intent = new Intent (MainActivity.this,ColorByHexaDecimal.class);
                    startActivity (intent);

            }
        });

        get_color_by_seekbar = (CardView) findViewById (R.id.get_color_by_seekbar);
        get_color_by_seekbar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent (MainActivity.this,ColorBySeekbar.class);
                startActivity (intent);
            }
        });

        get_color_by_color_picker_dialog = (CardView) findViewById (R.id.get_color_by_color_picker_dialog);
        get_color_by_color_picker_dialog.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent (MainActivity.this,ColorByColorPickerDialog.class);
                startActivity (intent);
            }
        });
        get_color_by_image = (CardView) findViewById(R.id.get_color_by_image);
        get_color_by_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ColorByImage.class);
                startActivity(intent);
            }
        });
        get_color_by_round_palette = (CardView) findViewById(R.id.get_color_by_round_palette);
        get_color_by_round_palette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ColorByRoundPalette.class);
                startActivity(intent);
            }
        });

        drawerLayout = (DrawerLayout) findViewById (R.id.drawer_layout);
        navigationView = (NavigationView) findViewById (R.id.navigation_view);
        toolbar = (android.support.v7.widget.Toolbar)findViewById (R.id.toolbar);



        linearLayout = (LinearLayout) findViewById (R.id.linearLayoutBackground);


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle (this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerClosed (View drawerView) {
                super.onDrawerClosed (drawerView);

                InputMethodManager  inputMethodManager = (InputMethodManager)getSystemService (INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow (getCurrentFocus ().getWindowToken (),0);
            }

            @Override
            public void onDrawerOpened (View drawerView) {
                super.onDrawerOpened (drawerView);
                InputMethodManager  inputMethodManager = (InputMethodManager)getSystemService (INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow (getCurrentFocus ().getWindowToken (),0);

            }
        };




        drawerLayout.addDrawerListener (actionBarDrawerToggle);
        actionBarDrawerToggle.syncState ();



        navigationView.setNavigationItemSelectedListener (new NavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected (@NonNull MenuItem item) {
               int itemid = item.getItemId ();

               switch ( itemid ){
                   case R.id.colors:
                       Intent intent = new Intent (MainActivity.this,ColorsActivity.class);
                       startActivity (intent);
                       hideDrawer ();
                       return true;
                   case R.id.shadecolors:
                       Intent mshade_color_intent = new Intent(MainActivity.this,ShadesColors.class);
                       startActivity(mshade_color_intent);
                       hideDrawer();
                       return true;
                   case R.id.shareit:
                       ApplicationInfo api = getApplicationContext().getApplicationInfo();
                       String apkpath = api.sourceDir;
                       Intent iintent = new Intent(Intent.ACTION_SEND);
                       iintent.setType("application/vnd.android.package-archive");
                       //Uri uri = FileProvider.getUriForFile(MainActivity.this, BuildConfig.APPLICATION_ID + ".provider",new File(apkpath));
                       iintent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(new File(apkpath)));
                       iintent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                       startActivity(Intent.createChooser(iintent,"Share App Using"));
                       return  true;
                   case R.id.aboutus:
                       Intent intent1 = new Intent(MainActivity.this,Developers.class);
                       startActivity(intent1);
                       hideDrawer();
                       return true;
                   case R.id.exit:
                     showAlertDialogue ();
                     hideDrawer ();
                       return true;
               }

               return true;
            }
        });
    }






    @Override
    public void onBackPressed () {
        showAlertDialogue ();
        if(drawerLayout.isDrawerOpen (GravityCompat.START)){
hideDrawer ();
        }
    }

    public void showAlertDialogue(){
        AlertDialog.Builder alertdialog = new AlertDialog.Builder (MainActivity.this);
        alertdialog.setTitle ("Are you sure to Exit?");
        alertdialog.setPositiveButton (R.string.yes, new DialogInterface.OnClickListener () {
            @Override
            public void onClick (DialogInterface dialog, int which) {
                finish ();
            }
        });
        alertdialog.setNegativeButton (R.string.no, new DialogInterface.OnClickListener () {
            @Override
            public void onClick (DialogInterface dialog, int which) {

                hideDrawer ();
            }
        });
        alertdialog.create ().show ();
    }

    public void hideDrawer(){
        drawerLayout.closeDrawer (GravityCompat.START);
    }
    public void showdrawer(){
        drawerLayout.openDrawer (GravityCompat.START);
    }

    public class GenericFileProvider extends FileProvider {}

}
