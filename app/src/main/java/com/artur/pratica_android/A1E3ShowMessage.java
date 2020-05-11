package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class A1E3ShowMessage extends AppCompatActivity {

	TextView view_x_value, view_y_value, view_z_value;
	TextView view_x_old, view_y_old, view_z_old;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a1_e3_show_message);

		float x = getIntent().getFloatExtra("x", 0);
		float y = getIntent().getFloatExtra("y", 0);
		float z = getIntent().getFloatExtra("z", 0);
		float x_old = getIntent().getFloatExtra("x_old", 0);
		float y_old = getIntent().getFloatExtra("y_old", 0);
		float z_old = getIntent().getFloatExtra("z_old", 0);

		view_x_value = findViewById(R.id.x_value);
		view_y_value = findViewById(R.id.y_value);
		view_z_value = findViewById(R.id.z_value);
		view_x_old = findViewById(R.id.x_old);
		view_y_old = findViewById(R.id.y_old);
		view_z_old = findViewById(R.id.z_old);

		view_x_value.setText(String.format("%.2f",x));
		view_y_value.setText(String.format("%.2f",y));
		view_z_value.setText(String.format("%.2f",z));
		view_x_old.setText(String.format("%.2f",x_old));
		view_y_old.setText(String.format("%.2f",y_old));
		view_z_old.setText(String.format("%.2f",z_old));


	}
}
