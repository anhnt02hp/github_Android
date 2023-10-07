package vn.edu.usth.githubbrowser.api.repos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.githubbrowser.R;
import vn.edu.usth.githubbrowser.data.Repositories;
import vn.edu.usth.githubbrowser.data.RepositoriesAdapter;

public class ApiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RequestQueue requestQueue;
    private List<Repositories> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
        Button try_conn = findViewById(R.id.try_connect);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        requestQueue = VolleySingleton.getmInstance(this).getRequestQueue();

        movieList = new ArrayList<>();


        try_conn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchRepo();
            }
        });


        fetchRepo();


    }

    private void fetchRepo() {

        String url = "https://run.mocky.io/v3/5aafd4f1-e9a3-4c24-8c97-5e7844bd4cf2";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i = 0 ; i < response.length() ; i ++){
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        String title = jsonObject.getString("title");
                        String overview = jsonObject.getString("overview");
                        String poster = jsonObject.getString("poster");
                        Double rating = jsonObject.getDouble("rating");

                        Repositories movie = new Repositories(title , poster , overview , rating);
                        movieList.add(movie);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    RepositoriesAdapter adapter = new RepositoriesAdapter(ApiActivity.this , movieList);

                    recyclerView.setAdapter(adapter);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ApiActivity.this, "No network connection!", Toast.LENGTH_SHORT).show();

            }
        });

        requestQueue.add(jsonArrayRequest);
    }
}