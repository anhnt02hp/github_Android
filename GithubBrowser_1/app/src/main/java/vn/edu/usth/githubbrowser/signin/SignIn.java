package vn.edu.usth.githubbrowser.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.githubbrowser.R;

public class SignIn extends AppCompatActivity {

    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_in);
        btnSignIn = findViewById(R.id.btn_sign_in_with_git_hub);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(SignIn.this, Login.class);
                startActivity(signIn);
            }

        });

    }
}