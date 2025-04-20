package com.example;
import android.os.Bundle;
import android.widget.ListView;
import android.app.Activity;
public class MainActivity extends Activity {
	private ListView listaSupermercado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listaSupermercado = (ListView) findViewById(R.id.listView);
	}
}
