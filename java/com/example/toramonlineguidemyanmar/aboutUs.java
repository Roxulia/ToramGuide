package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.toramonlineguidemyanmar.R;

public class aboutUs extends AppCompatActivity {

    Display d;
    DisplayMetrics dmetric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.bar);
        TextView txt=(TextView)findViewById(R.id.title);
        final Button btnUni=(Button)findViewById(R.id.btnUni);
        if(MainActivity.zg==true)
        {
            btnUni.setText("UN");
        }
        else
        {
            btnUni.setText("ZG");
        }
        txt.setText("About Us");

        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float h=dmetric.heightPixels/density;
        float w=dmetric.widthPixels/density;

        Button btncontact=(Button)findViewById(R.id.btnContact);
        ImageView imglogo=(ImageView)findViewById(R.id.logo);
        TextView title=(TextView)findViewById(R.id.textView);

        ViewGroup.MarginLayoutParams mp=(ViewGroup.MarginLayoutParams)imglogo.getLayoutParams();
        mp.rightMargin=(int)(w/4*density);
        mp.leftMargin=mp.rightMargin;
        imglogo.setLayoutParams(mp);
        mp=(ViewGroup.MarginLayoutParams)btncontact.getLayoutParams();
        mp.bottomMargin=(int)(h/20*density);
        btncontact.setLayoutParams(mp);
        mp=(ViewGroup.MarginLayoutParams)title.getLayoutParams();
        mp.topMargin=(int)(h/20*density);
        title.setLayoutParams(mp);

        btnUni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.zg)
                {
                    btnUni.setText("ZG");
                    MainActivity.zg=false;
                }
                else
                {
                    btnUni.setText("UN");
                    MainActivity.zg=true;
                }
            }
        });

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uri=new Intent(Intent.ACTION_VIEW);
                uri.setData(Uri.parse("https://www.facebook.com/Disciples-of-Dog-toram-newbie-guide-302359220475627"));
                startActivity(uri);
            }
        });
    }
}
