package in.ecampusips.android.androidhelper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3a extends AppCompatActivity {

    EditText l3_email;
    EditText l3_pass;
    Button l3_login;
    String email="email";
    String pass="pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3a);


        l3_email = (EditText)findViewById(R.id.l3_email);
        l3_login = (Button)findViewById(R.id.l3_login);
        l3_pass = (EditText)findViewById(R.id.l3_pass);

        l3_login.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Activity3b.class);
                email = l3_email.getText().toString().trim();
                pass = l3_pass.getText().toString().trim();
                i.putExtra("e",email);
                i.putExtra("p",pass);
                startActivity(i);
                finish();
            }
        });

    }

    public  void fillemail(View l3_login){
        l3_email.setText("helper@ecampusips.in");
    }

    public void fillpassword(View l3_login){
        l3_pass.setText("123456");
    }
}
