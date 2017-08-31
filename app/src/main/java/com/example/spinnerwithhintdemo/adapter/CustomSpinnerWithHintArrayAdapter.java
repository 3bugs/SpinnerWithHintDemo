package com.example.spinnerwithhintdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.spinnerwithhintdemo.model.Symbol;

import java.util.List;

/**
 * Created by Promlert on 2017-08-31.
 */

public class CustomSpinnerWithHintArrayAdapter extends ArrayAdapter<Symbol> {

    public CustomSpinnerWithHintArrayAdapter(Context context, int resource, Symbol[] items) {
        super(context, resource, items);
    }

    public CustomSpinnerWithHintArrayAdapter(Context context, int resource, List<Symbol> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);

        if (position == getCount()) {
            ((TextView) v.findViewById(android.R.id.text1)).setText("");
            ((TextView) v.findViewById(android.R.id.text1)).setHint(getItem(getCount()).symbolId);
        } else {
            ((TextView) v.findViewById(android.R.id.text1)).setText(getItem(position).symbolId);
        }
        return v;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = super.getDropDownView(position, convertView, parent);
        ((TextView) v.findViewById(android.R.id.text1)).setText(getItem(position).symbolId);
        return v;
    }

    @Override
    public int getCount() {
        return super.getCount() - 1;
    }
}
