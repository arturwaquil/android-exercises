package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	EditText numberOne;
	EditText numberTwo;
	Button button;
	TextView resultView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		numberOne = findViewById(R.id.numberOne);
		numberTwo = findViewById(R.id.numberTwo);
		button = findViewById(R.id.button);
		resultView = findViewById(R.id.resultView);


	}
}
