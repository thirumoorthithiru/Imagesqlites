package com.example.thirumoorthi.tymtix2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";
    Button signin;
    Button forgot;
    Button signup;

    TextView uname;
    TextView pname;
    TextView mail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);
        forgot = (Button) findViewById(R.id.forgot);
        imageView=(ImageView)findViewById(R.id.fb);
      uname=(TextView)findViewById(R.id.uname);
        uname.addTextChangedListener(new TextWatcher() {
                                         @Override
                                         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                         }

                                         @Override
                                         public void onTextChanged(CharSequence s, int start, int before, int count) {

                                         }

                                         @Override
                                         public void afterTextChanged(Editable s) {
                                         String mail=uname.getText().toString();
                                             char c[]=mail.toCharArray();
                                         }
                                     });

                forgot.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
             /*   String s="";
                int l=s.length();
                String name[]=new String[l];

                // TODO Auto-generated method stub
                uname=(EditText)findViewById(R.id.uname);
                pname=(EditText)findViewById(R.id.puser);
               s=uname.getText().toString();
                for(int j=0;j<s.length();j++){

                }*/

                        Intent i = new Intent(getApplicationContext(), forgot.class);
                        startActivity(i);
                    }
                });
        signin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), signin.class);
                startActivity(i);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), signup.class);
                startActivity(i);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,facebook.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }


}
