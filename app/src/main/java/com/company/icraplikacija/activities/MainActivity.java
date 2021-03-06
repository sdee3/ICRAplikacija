package com.company.icraplikacija.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.company.icraplikacija.R;
import com.company.icraplikacija.activities.SignInActivity;
import com.company.icraplikacija.api.APIService;
import com.company.icraplikacija.helper.SharedPrefManager;
import com.company.icraplikacija.models.Result;
import com.company.icraplikacija.models.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if user is already logged in opening the profile activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, HomeActivity.class));
        }

    }


    public void signUp(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }

    public void signIn(View view) {
        startActivity(new Intent(this, SignInActivity.class));
    }
}