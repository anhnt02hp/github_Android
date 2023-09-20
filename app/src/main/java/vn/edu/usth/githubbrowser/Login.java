package vn.edu.usth.githubbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private String username;
    private String password;
    Button btn_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvUsername = (TextView) findViewById(R.id.editTextTextEmailAddress);
                TextView tvPassword = (TextView) findViewById(R.id.editTextTextPassword);

                final String username = tvUsername.getText().toString();
                final String password = tvPassword.getText().toString();

//                Log.d("DEBUG", username);
//                Log.d("DEBUG", password);

                if (username.equals("admin") && password.equals("123")) {
//                    Log.d("DEBUG", "Correct");
                    Toast.makeText(getApplicationContext(), "Login successfully",Toast.LENGTH_LONG).show();
                    Intent signIn = new Intent(Login.this, MainActivity.class);
                    startActivity(signIn);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong credential!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}