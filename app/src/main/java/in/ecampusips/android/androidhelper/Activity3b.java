package in.ecampusips.android.androidhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activity3b extends AppCompatActivity {

    String e,p;
    Button l3_b1;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3b);
        e = getIntent().getStringExtra("e");
        p = getIntent().getStringExtra("p");
        display = (TextView) findViewById(R.id.display);

    }
    public  void showData(View l3_b1){
        Toast.makeText(getApplicationContext(),e+p,Toast.LENGTH_LONG).show();
        l3_b1.setEnabled(false);
//        l3_b1.setBackgroundColor(2);
        display.setText("Email: "+e+"\n\n"+"Password: "+p);

    }

}
