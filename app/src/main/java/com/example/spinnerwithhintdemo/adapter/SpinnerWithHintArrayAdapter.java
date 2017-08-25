package com.example.spinnerwithhintdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Promlert on 2017-08-25.
 */

public class SpinnerWithHintArrayAdapter extends ArrayAdapter<String> {

    public SpinnerWithHintArrayAdapter(Context context, int resource, String[] items) {
        super(context, resource, items);
    }

    public SpinnerWithHintArrayAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);

        if (position == getCount()) {
            ((TextView) v.findViewById(android.R.id.text1)).setText("");
            ((TextView) v.findViewById(android.R.id.text1)).setHint(getItem(getCount()));
        }
        return v;
    }

    @Override
    public int getCount() {
        return super.getCount() - 1;
    }
}
