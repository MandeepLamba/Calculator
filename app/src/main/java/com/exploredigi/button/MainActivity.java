package com.exploredigi.button;

import android.arch.core.util.Function;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,c1,dot,plus,eq;
//,dot,plus,sub,div,mul,eq;

TextView t1;

float int1,ans;

//int op;

    boolean isdot = false;

    public void check() {
        if(t1.getText()=="0"){
            t1.setText("");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1= findViewById(R.id.txt1);
        t1.setText("0");

        b1 = findViewById(R.id.bt1);
        b2 = findViewById(R.id.bt2);
        b3 = findViewById(R.id.bt3);
        b4 = findViewById(R.id.bt4);
        b5 = findViewById(R.id.bt5);
        b6 = findViewById(R.id.bt6);
        b7 = findViewById(R.id.bt7);
        b8 = findViewById(R.id.bt8);
        b9 = findViewById(R.id.bt9);
        b0 = findViewById(R.id.bt0);
        dot = findViewById(R.id.dot);
        plus = findViewById(R.id.bt_plus);
        eq = findViewById(R.id.eq);
//        sub = (Button) findViewById(R.id.bt_sub);
//        mul= (Button) findViewById(R.id.bt_mul);
//        div = (Button) findViewById(R.id.bt_div);

        c1= findViewById(R.id.bt_clr);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
                t1.setText(t1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText()!="0") {t1.setText(t1.getText() + "0");} }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isdot==false)
                {t1.setText(t1.getText() + ".");
                isdot=true;
                } }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("0");
                isdot=false;
            }
        });
//
//        mul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int1 = Integer.parseInt(t1.getText().toString());
//                t1.setText("");
//                op=1;
//            }
//        });
//        div.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int1 = Integer.parseInt(t1.getText().toString());
//                t1.setText("");
//                op=2;
//            }
//        });
//        sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int1 = Integer.parseInt(t1.getText().toString());
//                t1.setText("");
//                op=3;
//            }
//        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int1 = Float.parseFloat(t1.getText().toString());
                t1.setText("0");
//                op=4;
            }
        });


        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = int1 + Float.parseFloat(t1.getText().toString());
                        t1.setText(Float.toString(ans));
                        Toast.makeText(MainActivity.this,"Int1 : " + int1 + "ans " +ans,Toast.LENGTH_SHORT).show();
//                switch (op){
//                    case 4:{
//                        ans = int1 + Float.parseFloat(t1.getText().toString());
//                        t1.setText(Float.toString(ans));
//                    }
//                    default:{
//
//                    }
//                }

            }
        });
    }

}
