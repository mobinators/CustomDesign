package com.appytune.librarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.appytune.custom_design.classes.ToastUtils;

public class MainActivity extends AppCompatActivity {
    private Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastButton=this.findViewById(R.id.toastButton);
        toastButton.setOnClickListener(view -> {
            ToastUtils.showToast(this, "New Code");
        });
    }
}