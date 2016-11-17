package uoh.subbu.uohshuttlebustimings;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.widget.SimpleAdapter;

public class CTYActivity extends ListActivity {
    public static boolean IsListed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cis_to_yc);
        


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
        	temp.put("starts","8:35 AM(J&K)");
        	temp.put("reaches", "8:45 AM");
        	list.add(temp);
        	HashMap<String,String> temp1 = new HashMap<String,String>();
        	temp1.put("starts","9:00 AM(J&K)");
        	temp1.put("reaches", "9:15 AM");
        	list.add(temp1);
        	HashMap<String,String> temp2 = new HashMap<String,String>();
        	temp2.put("starts","9:20 AM(J&K)");
        	temp2.put("reaches", "9:35 AM");
        	list.add(temp2);
        	HashMap<String,String> temp3 = new HashMap<String,String>();
        	temp3.put("starts","10:20 AM");
        	temp3.put("reaches", "10:35 AM");
        	list.add(temp3);
        	HashMap<String,String> temp4 = new HashMap<String,String>();
        	temp4.put("starts","11:20 AM");
        	temp4.put("reaches", "11:35 AM");
        	list.add(temp4);
        	
        	HashMap<String,String> temp5 = new HashMap<String,String>();
        	temp5.put("starts","1:00 PM");
        	temp5.put("reaches", "1:15 PM(LH)");
        	list.add(temp5);
        	HashMap<String,String> temp6 = new HashMap<String,String>();
        	temp6.put("starts","1:45 PM(J&K)");
        	temp6.put("reaches", "2:00 PM");
        	list.add(temp6);
        	HashMap<String,String> temp7 = new HashMap<String,String>();
        	temp7.put("starts","2:20 PM");
        	temp7.put("reaches", "2:35 PM");
        	list.add(temp7);
        	HashMap<String,String> temp8 = new HashMap<String,String>();
        	temp8.put("starts","3:10 PM");
        	temp8.put("reaches", "3:25 PM");
        	list.add(temp8);
        	HashMap<String,String> temp9 = new HashMap<String,String>();
        	temp9.put("starts","4:10 PM");
        	temp9.put("reaches", "4:25 PM");
        	list.add(temp9);
        	
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