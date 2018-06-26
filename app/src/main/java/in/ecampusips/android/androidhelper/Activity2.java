package in.ecampusips.android.androidhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    Button l2_gohome;
    Button l2_b1;
    Button l2_b2;
    EditText l2_et1;
    String et1_text;
    TextView l2_tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        l2_gohome = (Button)findViewById(R.id.l2_gohome);
        l2_gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        l2_et1 = (EditText)findViewById(R.id.l2_et1);
        l2_b1 = (Button)findViewById(R.id.l2_b1);
        l2_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1_text = l2_et1.getText().toString().trim();
                Toast.makeText(getApplicationContext(),et1_text,Toast.LENGTH_LONG).show();
            }
        });

        l2_tv1 = (TextView) findViewById(R.id.l2_tv1);
        l2_et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    l2_tv1.setText(charSequence.toString());
                }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void showMsg(View l2_b2) {
        Toast.makeText(getApplicationContext(), "You clicked on 2nd Button", Toast.LENGTH_SHORT).show();
    }
}
