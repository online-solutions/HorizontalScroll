package studio.plus.horizontalscroll.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import studio.plus.horizontalscroll.R;

public class SecondActivity extends ActionBarActivity {

    final List<String> list = new ArrayList<String>(){{
        add("10.000");
        add("20.000");
        add("50.000");
        add("100.000");
        add("200.000");
        add("500.000");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LayoutInflater inflater = getLayoutInflater();
        LinearLayout wrapper = (LinearLayout) findViewById(R.id.group_wrapper);
        wrapper.removeAllViews();


        for (int i = 0; i < list.size(); i++) {
            View view = inflater.inflate(R.layout.custom_single_group, (LinearLayout) findViewById(R.id.group_wrapper), false);
            if (i == list.size() -1) {
                LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view.getLayoutParams();
                params.setMargins(0, 0, 0, 0);
                view.setLayoutParams(params);
            }

            final int position = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), list.get(position), Toast.LENGTH_SHORT).show();
                }
            });

            TextView title = (TextView) view.findViewById(R.id.title);
            TextView realValue = (TextView) view.findViewById(R.id.real_value);
            TextView oldValue = (TextView) view.findViewById(R.id.old_value);

            Log.d("logging", i + "");
            title.setText("title " + i);
            realValue.setText(list.get(i));
            oldValue.setText("oldValue " + i);

            wrapper.addView(view, i);
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
