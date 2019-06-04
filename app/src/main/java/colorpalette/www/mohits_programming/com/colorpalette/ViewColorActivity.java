package colorpalette.www.mohits_programming.com.colorpalette;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.text.Html;

import org.w3c.dom.Text;

public class ViewColorActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView htmlTextView;
    private TextView textView;
    private WebView webView;
    private String fileName;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.view_color_activity);

        linearLayout = (LinearLayout) findViewById (R.id.ViewlinearLayout);



    }
}
