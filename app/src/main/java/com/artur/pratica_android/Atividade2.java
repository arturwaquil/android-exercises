package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Atividade2 extends AppCompatActivity implements SensorEventListener {

	TextView light_value;
	private SensorManager sensorManager;
	private Sensor sensor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atividade2);

		light_value = findViewById(R.id.light_value);

		sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
	}

	protected void onResume() {
		super.onResume();
		sensorManager.registerListener(this, sensor, sensorManager.SENSOR_DELAY_NORMAL);
	}

	protected void onPause() {
		super.onPause();
		sensorManager.unregisterListener(this);
	}

	public void onSensorChanged(SensorEvent event) {
		if (event.sensor.getType() == Sensor.TYPE_LIGHT) {
			light_value.setText(String.valueOf(event.values[0]));
		}
	}

	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}
}
