package com.artur.pratica_android;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Atividade2 extends AppCompatActivity implements SensorEventListener {

	TextView light_value, temp_value, prox_value;
	private SensorManager sensorManager;
	private Sensor sensorLight;
	private Sensor sensorTemp;
	private Sensor sensorProx;

	boolean light_available, temp_available, prox_available;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atividade2);

		light_value = findViewById(R.id.light_value);
		temp_value = findViewById(R.id.temp_value);
		prox_value = findViewById(R.id.prox_value);

		sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		sensorLight = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
		sensorTemp = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
		sensorProx = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
	}

	protected void onResume() {
		super.onResume();
		light_available = sensorManager.registerListener(this, sensorLight, sensorManager.SENSOR_DELAY_NORMAL);
		temp_available = sensorManager.registerListener(this, sensorTemp, sensorManager.SENSOR_DELAY_NORMAL);
		prox_available = sensorManager.registerListener(this, sensorProx, sensorManager.SENSOR_DELAY_NORMAL);

		if (!light_available) {
			light_value.setText("N/A");
		}

		if (!temp_available) {
			temp_value.setText("N/A");
		}

		if (!prox_available) {
			prox_value.setText("N/A");
		}
	}

	protected void onPause() {
		super.onPause();
		sensorManager.unregisterListener(this);
	}

	public void onSensorChanged(SensorEvent event) {
		if (event.sensor.getType() == Sensor.TYPE_LIGHT) {
			light_value.setText(String.valueOf(event.values[0]));
		}
		else if (event.sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE) {
			temp_value.setText(String.valueOf(event.values[0]));
		}
		else if (event.sensor.getType() == Sensor.TYPE_PROXIMITY) {
			prox_value.setText(String.valueOf(event.values[0]));
		}
	}

	public void onAccuracyChanged(Sensor sensor, int accuracy) {

	}
}
