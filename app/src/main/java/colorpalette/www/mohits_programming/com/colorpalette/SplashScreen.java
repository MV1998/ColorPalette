package colorpalette.www.mohits_programming.com.colorpalette;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        requestWindowFeature (Window.FEATURE_NO_TITLE);
        getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView (R.layout.splash_screen_activity);

        Handler mMyhandler = new Handler ();
        mMyhandler.postDelayed (new Runnable () {
            @Override
            public void run (){
                Intent intent = new Intent (SplashScreen.this,MainActivity.class);
                startActivity (intent);
                finish ();
            }
        },1000);
    }
}
