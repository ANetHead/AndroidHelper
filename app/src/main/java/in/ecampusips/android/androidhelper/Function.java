package in.ecampusips.android.androidhelper;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Function extends AppCompatActivity{

    private static final String url  = "http://127.0.0.1";

    public void getJson(){
        StringRequest str = new StringRequest(Request.Method.GET, "http://android.ecampusips.in/json.php",
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        try {
                            JSONObject json = new JSONObject(response);
                            Toast.makeText(getApplicationContext(), json.getString("first"), Toast.LENGTH_LONG).show();
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

//    StringRequest str = new StringRequest(Request.Method.GET,"http://127.0.0.1/json.php",
//            new Response.Listener<String>(){
//                public  void onResponse(String response){
//                    try{
//                        JSONObject json = new JSONObject(response);
//                    }
//                }
//            }

}
