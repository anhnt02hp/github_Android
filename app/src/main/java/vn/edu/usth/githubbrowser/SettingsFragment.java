package vn.edu.usth.githubbrowser;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends AppCompatActivity {
    Button btnBack;
    Button btnLogOut;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.fragment_settings);
        btnBack = findViewById(R.id.btn_back2);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnLogOut = findViewById(R.id.btn_log_out);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logOut = new Intent(SettingsFragment.this, Login.class);
                startActivity(logOut);
            }
        });
    }

}
