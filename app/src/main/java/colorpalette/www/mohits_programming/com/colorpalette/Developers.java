package colorpalette.www.mohits_programming.com.colorpalette;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Developers extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView vaibhav_email_imageView,mohit_email_imageView,praveen_email_imageView,jagruti_email_imageView;
    private ImageView mohit_github_imageView,jagruti_github_imageView,vaibhav_github_imageView,praveen_github_imageView;
    private ImageView mohit_quora_imageView,jagruti_quora_imageView,vaibhav_quora_imageView,praveen_quora_imageView;
    private ImageView mohit_linkedin_imageView,jagruti_linkedin_imageView,vaibhav_linkedin_imageView,praveen_linkedin_imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        toolbar = (Toolbar)  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//
//        vaibhav_email_imageView = (ImageView) findViewById(R.id.vaibhav_email_id);
//        vaibhav_email_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setType("text/plain");
//                Uri s = Uri.parse("mailto:vp484843@gmail.com");
//                intent.setData(s);
//                intent.putExtra(Intent.EXTRA_SUBJECT,"Contact With Vaibhav");
//                startActivity(intent);
//            }
//        });
//
//        vaibhav_github_imageView = (ImageView) findViewById(R.id.vaibhav_github_id);
//        vaibhav_github_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        vaibhav_quora_imageView = (ImageView) findViewById(R.id.vaibhav_quora_id);
//        vaibhav_quora_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.quora.com/profile/Techno-Vaibhav-Patil");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
//
//        vaibhav_linkedin_imageView = (ImageView) findViewById(R.id.vaibhav_linkedin_id);
//        vaibhav_linkedin_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.linkedin.com/in/vaibhav-patil-a14561154");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });

        mohit_email_imageView = (ImageView) findViewById(R.id.mohit_email_id);
        mohit_email_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                Uri s = Uri.parse("mailto:mv501049@gmail.com");
                intent.setData(s);

                intent.putExtra(Intent.EXTRA_SUBJECT,"Contact With Mohit");
                startActivity(intent);
            }
        });

        mohit_github_imageView = (ImageView) findViewById(R.id.mohit_github_id);
        mohit_github_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri s = Uri.parse("https://github.com/MV1998");
                intent.setData(s);
                startActivity(intent);
            }
        });

        mohit_quora_imageView = (ImageView) findViewById(R.id.mohit_quora_id);
        mohit_quora_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri s = Uri.parse("https://www.quora.com/profile/Mohit-Varma-20");
                intent.setData(s);
                startActivity(intent);
            }
        });

        mohit_linkedin_imageView = (ImageView) findViewById(R.id.mohit_linkedin_id);
        mohit_linkedin_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri s = Uri.parse("https://www.linkedin.com/in/mohit-varma-199257146");
                intent.setData(s);
                startActivity(intent);
            }
        });

//        praveen_email_imageView  = (ImageView) findViewById(R.id.praveen_email_id);
//        praveen_email_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setType("text/plain");
//                Uri s = Uri.parse("mailto:praveenjainkar1@gmail.com");
//                intent.setData(s);
//                intent.putExtra(Intent.EXTRA_SUBJECT,"Contact With Praveen");
//                startActivity(intent);
//            }
//        });
//
//        praveen_github_imageView = (ImageView) findViewById(R.id.praveen_github_id);
//        praveen_github_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://github.com/ThePj5");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
//
//        praveen_quora_imageView = (ImageView) findViewById(R.id.praveen_quora_id);
//        praveen_quora_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.quora.com/profile/Praveen-Jainkar");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
//
//        praveen_linkedin_imageView = (ImageView) findViewById(R.id.praveeen_linkedin_id);
//        praveen_linkedin_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.linkedin.com/in/praveen-jainkar-a5b736184");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
//
//        jagruti_email_imageView = (ImageView) findViewById(R.id.jagruri_email_id);
//        jagruti_email_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setType("text/plain");
//                Uri s = Uri.parse("mailto:jagrutinafde2016@gmail.com");
//                intent.setData(s);
//                intent.putExtra(Intent.EXTRA_SUBJECT,"Contact With Jagruti");
//                startActivity(intent);
//            }
//        });
//
//        jagruti_quora_imageView  =  (ImageView) findViewById(R.id.jagruti_quora_id);
//        jagruti_quora_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.quora.com/profile/Jagruti-Nafde?ch=3&share=a2f6fb1b&srid=3F7n5");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
//
//        jagruti_linkedin_imageView = (ImageView) findViewById(R.id.jagruti_linkedin_id);
//        jagruti_linkedin_imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                Uri s = Uri.parse("https://www.linkedin.com/in/jagruti-nafade-a6371a184/");
//                intent.setData(s);
//                startActivity(intent);
//            }
//        });
    }
}
