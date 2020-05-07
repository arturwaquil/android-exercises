package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Atividade1Ex1 extends AppCompatActivity {

	EditText numberOne;
	EditText numberTwo;
	Button sumButton;
	TextView showResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atividade1_ex1);

		numberOne = findViewById(R.id.numberOne);
		numberTwo = findViewById(R.id.numberTwo);
		sumButton = findViewById(R.id.sumButton);
		showResult = findViewById(R.id.showResult);

	}

	public void sum(View view) {
		String numberOneText = numberOne.getText().toString();
		String numberTwoText = numberTwo.getText().toString();

		if(!numberOneText.isEmpty() && !numberTwoText.isEmpty()) {
			try {
				int nOne = Integer.parseInt(numberOneText);
				Log.d("ONE", String.valueOf(nOne));
				int nTwo = Integer.parseInt(numberTwoText);
				Log.d("TWO", String.valueOf(nTwo));
				String result = String.valueOf(nOne + nTwo);
				Log.d("RESULT", result);
				showResult.setText(result);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				showResult.setText("ERRO");
			}
		}
	}
}
