package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	Button button_ex1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button_ex1 = findViewById(R.id.button_ex1);

	}

	public void gotoAtividade1Ex1(View view) {
		Intent intent = new Intent(this, Atividade1Ex1.class);
		startActivity(intent);
	}

	public void gotoAtividade1Ex2(View view) {
		Intent intent = new Intent(this, Atividade1Ex2.class);
		startActivity(intent);
	}

	public void gotoAtividade1Ex3(View view) {
		Intent intent = new Intent(this, Atividade1Ex3.class);
		startActivity(intent);
	}
}
