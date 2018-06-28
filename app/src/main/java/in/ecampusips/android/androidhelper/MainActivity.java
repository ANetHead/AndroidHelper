package in.ecampusips.android.androidhelper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
//import  in.ecampusips.android.androidhelper.Function;

public class MainActivity extends AppCompatActivity {

    Button main_b1;
    Button main_b2;
    Button main_b3;
    Button main_b4;
    Button main_b5;
    Button main_b6;
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

        main_b4 = (Button)findViewById(R.id.main_b4);

        main_b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),LinearLayout.class);
                startActivity(i);
            }
        });

        main_b5 = (Button)findViewById(R.id.main_b5);
        main_b6 = (Button) findViewById(R.id.main_b6);

        main_b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BtnVisibility.class);
                startActivity(i);
            }
        });
        main_b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GetJson.class);
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
