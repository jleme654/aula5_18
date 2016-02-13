package com.example;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends Activity implements OnClickListener  {
	
	Button botaoRetornar = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		
		botaoRetornar = (Button) findViewById(R.id.mButtonRetornar);
		botaoRetornar.setOnClickListener(this);
	
		Intent intencao = getIntent();
		Bundle params = intencao.getExtras();
		String nome = params.getString("inNome");
		String email = params.getString("inEmail");
		String curso = params.getString("inCurso");
		String escola = params.getString("inEscola");
		
		TextView status = (TextView) findViewById(R.id.mStatus);
		status.setText("Nome: " + nome 
				+"\nEmail: "+ email
				+"\nCurso: "+ curso
				+"\nEscola: "+ escola);
	}

	@Override
	public void onClick(View v) {
		finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}
