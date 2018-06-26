package in.ecampusips.android.androidhelper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button main_b1;
    Button main_b2;
    Button main_b3;
    Button viewbtn;

    Button exit_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewbtn = (Button) findViewById(R.id.viewbtn);

        main_b1 = (Button) findViewById(R.id.main_b1);
        main_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),Activity1.class);
                startActivity(i);
            }
        });

        main_b2 = (Button)findViewById(R.id.main_b2);
        main_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                startActivity(i);
            }
        });

        main_b3 = (Button)findViewById(R.id.main_b3);
        main_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Activity3a.class);
                startActivity(i);
            }
        });

        exit_b = (Button) findViewById(R.id.exit_b);
        exit_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
    public void viewSource(View viewbtn){
        Intent i = new Intent(getApplicationContext(),ViewSource.class);
        startActivity(i);
    }
}
