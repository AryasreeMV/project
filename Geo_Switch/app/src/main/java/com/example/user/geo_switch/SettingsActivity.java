package com.example.user.geo_switch;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    private Button b1,b2;
    private RadioButton r1,r2,r3,r4;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button5);
        r1= (RadioButton) findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.black_list);
        r4=(RadioButton)findViewById(R.id.white_list);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBlacklist();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Map_activity.class);
                startActivity(intent);
            }
        });
        }
    public void openBlacklist(){
        if (r3.isChecked()){
            Toast.makeText(this, " Black list selected ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, Black_List.class);
        startActivity(intent);
        } else if (r4.isChecked()) {
            Toast.makeText(this, " White list selected ", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, White_List.class);
            startActivity(i);
        }
        else
            {
                Toast.makeText(this, " Select a preference list ", Toast.LENGTH_SHORT).show();
            }



    }

}
