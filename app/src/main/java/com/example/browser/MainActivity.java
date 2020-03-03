package com.example.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button google,facebook,youtub,instagram ,phone ,twtter,linkedin,paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        google=findViewById(R.id.googleid);
        facebook=findViewById(R.id.facebookIdButton);
        youtub=findViewById(R.id.youtubIdButton);
        instagram=findViewById(R.id.instagramIdButton);
        phone=findViewById(R.id.phoneid);
        twtter=findViewById(R.id.twtterIdButton);
        linkedin=findViewById(R.id.linkedinbIdButton);
        paint=findViewById(R.id.gmailIdButton);




        google.setOnClickListener(this);
        facebook.setOnClickListener(this);
        youtub.setOnClickListener(this);
        instagram.setOnClickListener(this);
        phone.setOnClickListener(this);
        twtter.setOnClickListener(this);
        linkedin.setOnClickListener(this);
        paint.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.googleid) {
            Intent google = new Intent(MainActivity.this, Web1Activity.class);
            startActivity(google);
        }

        if (v.getId() == R.id.facebookIdButton) {
            Intent facebook = new Intent(MainActivity.this, Web2Activity.class);
            startActivity(facebook);
        }

        if (v.getId() == R.id.youtubIdButton) {
            Intent youtub = new Intent(MainActivity.this, Web3Activity.class);
            startActivity(youtub);


        }

        if (v.getId() == R.id.instagramIdButton) {
            Intent instagram = new Intent(MainActivity.this, web4Activity.class);
            startActivity(instagram);


        }


        if (v.getId() == R.id.phoneid) {
            Intent phonereview = new Intent(MainActivity.this, web5Activity.class);
            startActivity(phonereview);


        }
        if (v.getId() == R.id.twtterIdButton) {
            Intent twtter = new Intent(MainActivity.this, web6Activity.class);
            startActivity(twtter);


        }
        if (v.getId() == R.id.linkedinbIdButton) {
            Intent linkedin = new Intent(MainActivity.this, web7Activity.class);
            startActivity(linkedin);


        }
        if (v.getId() == R.id.gmailIdButton) {
            Intent paint = new Intent(MainActivity.this, web8Activity.class);
            startActivity(paint);


        }
    }
}
