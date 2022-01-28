package com.example.bluecollarfreelanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    private Button btnAllJob;
    private Button btnPostJob;
    private Button btnContactUs;

    //Toolbar

    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Blue-collar freelance app");

        mAuth=FirebaseAuth.getInstance();

        btnAllJob=findViewById(R.id.btn_alljob);
        btnPostJob=findViewById(R.id.btn_PostJob);
        btnContactUs=findViewById(R.id.contact_us);

        btnAllJob.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),AllJobActivity.class)));

        btnPostJob.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),PostJobActivity.class)));

        btnContactUs.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(),Contact_us.class)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        switch (item.getItemId()){
            case R.id.logout:
                mAuth.signOut();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}