package studio.plus.horizontalscroll.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import studio.plus.horizontalscroll.R;
import studio.plus.horizontalscroll.models.Group;

/**
 * Created by SUCCESS\phungdinh on 5/8/15.
 */
public class HorizontalListAdapter extends ArrayAdapter<Group> {
    private List<Group> listGroup;
    private Activity activity;

    public HorizontalListAdapter(Activity activity, List<Group> listGroup){
        super(activity, R.layout.activity_second, listGroup);
        this.activity = activity;
        this.listGroup = listGroup;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_single_group, null);

        TextView title = (TextView) view.findViewById(R.id.title);
        TextView realValue = (TextView) view.findViewById(R.id.real_value);
        TextView oldValue = (TextView) view.findViewById(R.id.old_value);
        LinearLayout wrapper = (LinearLayout) activity.findViewById(R.id.group_wrapper);

        for(int i =0; i < 5; i++){
            title.setText("title " + i);
            realValue.setText("realValue " + i);
            oldValue.setText("oldValue " + i);

            wrapper.addView(view);
        }


        return super.getView(position, convertView, parent);
    }
}
