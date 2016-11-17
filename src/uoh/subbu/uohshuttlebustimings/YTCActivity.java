package uoh.subbu.uohshuttlebustimings;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.widget.SimpleAdapter;

public class YTCActivity extends ListActivity {
	public static boolean IsListed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yc_to_cis);
        


        SimpleAdapter adapter = new SimpleAdapter(
        	    this,
        	    list,
        	    R.layout.bus_record,
        	    new String[] {"starts","reaches"},
        	    new int[] {R.id.text1,R.id.text2}
        	    );
        if(IsListed == false) {
        	populateList();
        	IsListed = true;
        }

        	    setListAdapter(adapter);
    }

	static final ArrayList<HashMap<String,String>> list = 
        	new ArrayList<HashMap<String,String>>(); 

    private void populateList() {
        	HashMap<String,String> temp = new HashMap<String,String>();
        	temp.put("starts","8:50 AM(LH)");
        	temp.put("reaches", "9.05 AM");
        	list.add(temp);
        	HashMap<String,String> temp1 = new HashMap<String,String>();
        	temp1.put("starts","9:40 AM");
        	temp1.put("reaches", "9:55 AM");
        	list.add(temp1);
        	HashMap<String,String> temp2 = new HashMap<String,String>();
        	temp2.put("starts","10:40 AM");
        	temp2.put("reaches", "10:55 AM");
        	list.add(temp2);
        	HashMap<String,String> temp3 = new HashMap<String,String>();
        	temp3.put("starts","11:40 AM");
        	temp3.put("reaches", "11:55 AM");
        	list.add(temp3);
        	HashMap<String,String> temp4 = new HashMap<String,String>();
        	temp4.put("starts","1:00 PM");
        	temp4.put("reaches", "1:15 PM(J&K)");
        	list.add(temp4);
        	
        	HashMap<String,String> temp5 = new HashMap<String,String>();
        	temp5.put("starts","1:55 PM(LH)");
        	temp5.put("reaches", "2:10 PM");
        	list.add(temp5);
        	HashMap<String,String> temp6 = new HashMap<String,String>();
        	temp6.put("starts","2:40 PM");
        	temp6.put("reaches", "2:55 PM");
        	list.add(temp6);
        	HashMap<String,String> temp7 = new HashMap<String,String>();
        	temp7.put("starts","3:30 PM");
        	temp7.put("reaches", "3:45 PM");
        	list.add(temp7);
        	HashMap<String,String> temp8 = new HashMap<String,String>();
        	temp8.put("starts","4:30 PM");
        	temp8.put("reaches", "4:45 PM");
        	list.add(temp8);
        	
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
