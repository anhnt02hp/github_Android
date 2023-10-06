package vn.edu.usth.githubbrowser.ui.main;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.githubbrowser.R;

public class SearchFragment extends AppCompatActivity {
    private MainViewModel viewModel;
    private UserAdapter adapter;

    Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new UserAdapter();
        adapter.notifyDataSetChanged();
        viewModel = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) new ViewModelProvider.NewInstanceFactory()).get(MainViewModel.class);

        RecyclerView rvUser = findViewById(R.id.rv_user);
        rvUser.setLayoutManager(new LinearLayoutManager(this));
        rvUser.setHasFixedSize(true);
        rvUser.setAdapter(adapter);

        ImageView btnSearch = findViewById(R.id.btn_search);
        EditText etQuery = findViewById(R.id.et_query);
        ProgressBar progressBar = findViewById(R.id.progress_bar);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchUser(etQuery, progressBar);
            }
        });

        etQuery.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    searchUser(etQuery, progressBar);
                    return true;
                }
                return false;
            }
        });

        viewModel.getSearchUsers().observe(this, userList -> {
            if (userList != null) {
                adapter.setList(userList);
                showLoading(false, progressBar);
            }
        });
    }

    private void searchUser(EditText etQuery, ProgressBar progressBar) {
        String query = etQuery.getText().toString();
        if (query.isEmpty()) return;
        showLoading(true, progressBar);
        viewModel.setSearchUsers(query);
    }

    private void showLoading(boolean state, ProgressBar progressBar) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }
}
