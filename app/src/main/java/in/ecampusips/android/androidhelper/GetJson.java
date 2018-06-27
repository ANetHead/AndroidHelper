package in.ecampusips.android.androidhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;


public class GetJson extends AppCompatActivity {


    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_json);

        b = (Button)findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getJSON();

            }
        });
    }

    public void getJSON(){
        StringRequest str = new StringRequest(Request.Method.GET, "http://android.ecampusips.in/json.php",
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            JSONObject json = new JSONObject(response);

                            tv.setText(json.getString("first"));
                            //Toast.makeText(getApplicationContext(), json.getString("first"), Toast.LENGTH_LONG).show();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        Volley.newRequestQueue(getApplicationContext()).add(str);
    }

}
