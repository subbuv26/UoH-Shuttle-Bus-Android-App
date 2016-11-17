package uoh.subbu.uohshuttlebustimings;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	Button buttoncty, buttonytc, buttonob; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickcty();
    }


    
    public void onClickcty() {
    	buttoncty = (Button) findViewById(R.id.button1);
    	 
		buttoncty.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, CTYActivity.class);
				startActivity(intent);
			}
		} );
    }
    
    public void onClickytc(View v) {
        Intent intent = new Intent(MainActivity.this, YTCActivity.class);
        startActivity(intent);
    }
    
    public void onClickOB(View v) {
        Intent intent = new Intent(MainActivity.this, OtherBuses.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
