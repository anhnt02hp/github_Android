package vn.edu.usth.githubbrowser.fragment.subs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.githubbrowser.R;

public class StaredFragment extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    Button btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.fragment_stared);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(this);

        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Open");
        courses.add("Closed");
        courses.add("All");

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(this);

        ArrayList<String> courses2 = new ArrayList<String>();
        courses2.add("Create");
        courses2.add("Assigned");
        courses2.add("Mentioned");
        courses2.add("Involved");

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(this);

        ArrayList<String> courses3 = new ArrayList<String>();
        courses3.add("Visibility");
        courses3.add("Private repositories only");
        courses3.add("Public repositories only");

        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner4.setOnItemSelectedListener(this);

        ArrayList<String> courses4 = new ArrayList<String>();
        courses4.add("Organization");


        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner5.setOnItemSelectedListener(this);

        ArrayList<String> courses5 = new ArrayList<String>();
        courses5.add("Repository");

        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner6.setOnItemSelectedListener(this);

        ArrayList<String> courses6 = new ArrayList<String>();
        courses6.add("Sort: Newest");


        //Tạo adapter
        ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinAdapter);

        ArrayAdapter<String> spinAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses2){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinAdapter2);

        ArrayAdapter<String> spinAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses3){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(spinAdapter3);

        ArrayAdapter<String> spinAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses4){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(spinAdapter4);

        ArrayAdapter<String> spinAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses5){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(spinAdapter5);

        ArrayAdapter<String> spinAdapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, courses6){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.your_text_color));
                return view;
            }
        };
        spinAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(spinAdapter6);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
//        Toast.makeText(adapterView.getContext(), "Bạn đã chọn: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}