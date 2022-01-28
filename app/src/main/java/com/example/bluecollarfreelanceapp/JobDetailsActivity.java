package com.example.bluecollarfreelanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JobDetailsActivity extends AppCompatActivity {

    private TextView mTitle;
    private TextView mDate;
    private TextView mDescription;
    private TextView mSkills;
    private TextView mSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTitle=findViewById(R.id.job_details_title);
        mDate=findViewById(R.id.job_details_date);
        mDescription=findViewById(R.id.job_details_description);
        mSalary=findViewById(R.id.job_details_salary);
        mSkills=findViewById(R.id.job_details_skills);

        //Receive data from all job activity using intent..

        Intent intent=getIntent();

        String title=intent.getStringExtra("title");
        String date=intent.getStringExtra("date");
        String description=intent.getStringExtra("description");
        String skills=intent.getStringExtra("skills");
        String salary=intent.getStringExtra("salary");

        mTitle.setText(title);
        mDate.setText(date);
        mDescription.setText(description);
        mSalary.setText(salary);
        mSkills.setText(skills);

    }
}