package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Atividade1Ex2 extends AppCompatActivity {

	EditText messageEditText;
	Button buttonSend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atividade1_ex2);

		messageEditText = findViewById(R.id.messageEditText);
		buttonSend = findViewById(R.id.buttonSend);
	}

	public void sendMessage(View view) {
		String message = messageEditText.getText().toString();

		Intent intent = new Intent(this, A1E2ShowMessage.class);
		intent.putExtra("message", message);
		startActivity(intent);
	}
}
