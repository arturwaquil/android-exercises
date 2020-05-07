package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class A1E2ShowMessage extends AppCompatActivity {

	TextView message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a1_e2_show_message);

		message = findViewById(R.id.message);
		message.setText(getIntent().getStringExtra("message"));
	}
}
