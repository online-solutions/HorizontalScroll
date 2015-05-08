package studio.plus.horizontalscroll.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import studio.plus.horizontalscroll.R;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LayoutInflater inflater = getLayoutInflater();


        for(int i =0; i < 5; i++){
            View view = inflater.inflate(R.layout.custom_single_group, null);

            TextView title = (TextView) view.findViewById(R.id.title);
            TextView realValue = (TextView) view.findViewById(R.id.real_value);
            TextView oldValue = (TextView) view.findViewById(R.id.old_value);
            LinearLayout wrapper = (LinearLayout) findViewById(R.id.group_wrapper);
            Log.d("logging", i + "");
            title.setText("title " + i);
            realValue.setText("realValue " + i);
            oldValue.setText("oldValue " + i);

            wrapper.addView(view, 0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
