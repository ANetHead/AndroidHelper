package in.ecampusips.android.androidhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BtnVisibility extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_visibility);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"I'm Already Visible",Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setVisibility(View.INVISIBLE);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setVisibility(View.GONE);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(getResources().getColor(R.color.white));
                b4.setTextColor(getResources().getColor(R.color.black));
            }
        });

    }

}

