package com.example.toramonlineguidemyanmar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class mainSkills extends AppCompatActivity {

    AdView banMain;
    DisplayMetrics dmetric;
    Display d;
    ScrollView scl;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_skills);
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
        txt.setText("Weapon Skills");


        banMain=(AdView)findViewById(R.id.adViewMsk);
        banMain.loadAd(new AdRequest.Builder().build());
        d=getWindowManager().getDefaultDisplay();
        dmetric=new DisplayMetrics();
        d.getMetrics(dmetric);
        float density=getResources().getDisplayMetrics().density;
        float h=dmetric.heightPixels/density;
        float w=dmetric.widthPixels/density;

        scl=(ScrollView)findViewById(R.id.sclMsk);
        btn1=findViewById(R.id.btnBladeSKill);
        btn2=findViewById(R.id.btnShotSkill);
        btn3=findViewById(R.id.btnMagicSkill);
        btn4=findViewById(R.id.btnMartialSkill);
        btn5=findViewById(R.id.btnMomonofuSkill);
        btn6=findViewById(R.id.btnDualSkill);
        btn7=findViewById(R.id.btnHBSkill);

        ViewGroup.MarginLayoutParams mp=(ViewGroup.MarginLayoutParams)scl.getLayoutParams();
        mp.bottomMargin=(int)(h/7.5*density);
        mp.leftMargin=(int)(w/15*density);
        mp.rightMargin=(int)(w/15*density);
        mp.topMargin=(int)(h/3*density);
        scl.setLayoutParams(mp);
        ViewGroup.LayoutParams p=btn1.getLayoutParams();
        p.height=(int)(h/10*density);
        btn1.setLayoutParams(p);
        btn1.setTextSize(w/20);
        p=btn2.getLayoutParams();
        p.height=(int)(h/10*density);
        btn2.setLayoutParams(p);
        btn2.setTextSize(w/20);
        p=btn3.getLayoutParams();
        p.height=(int)(h/10*density);
        btn3.setLayoutParams(p);
        btn3.setTextSize(w/20);
        p=btn4.getLayoutParams();
        p.height=(int)(h/10*density);
        btn4.setLayoutParams(p);
        btn4.setTextSize(w/20);
        p=btn5.getLayoutParams();
        p.height=(int)(h/10*density);
        btn5.setLayoutParams(p);
        btn5.setTextSize(w/20);
        p=btn6.getLayoutParams();
        p.height=(int)(h/10*density);
        btn6.setLayoutParams(p);
        btn6.setTextSize(w/20);
        p=btn7.getLayoutParams();
        p.height=(int)(h/10*density);
        btn7.setLayoutParams(p);
        btn7.setTextSize(w/20);

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,bladeSkill.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,shotSkill.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,magicSkill.class);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,martialSkill.class);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,momonofuSkill.class);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,dualSkill.class);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(mainSkills.this,halberdSkill.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
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
        txt.setText("Weapon Skills");
        /*if(adsToram.isLoaded())
        {
            adsToram.show();
        }*/
    }

    @Override
    protected void onPause() {
        if(banMain!=null)
        {
            banMain.pause();
        }
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if(banMain!=null)
        {
            banMain.destroy();
        }
        super.onDestroy();
    }

}
