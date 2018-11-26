package com.milkmanagement.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.milkmanagement.R;

import java.util.List;

public class MySpinnerAdapter extends ArrayAdapter<String> {
    // Initialise custom font, for example:
    // Typeface MPLUSRounded1c_Bold,MPLUSRounded1c_Light,MPLUSRounded1c_Medium,MPLUSRounded1c_Regular;
    // (In reality I used a manager which caches the Typeface objects)
    // Typeface font = FontManager.getInstance().getFont(getContext(), BLAMBOT);
    public MySpinnerAdapter(Context context, int resource, List<String> items) {
        super(context, resource, items);
//         MPLUSRounded1c_Bold = Typeface.createFromAsset(context.getAssets(), "MPLUSRounded1c-Bold.ttf");
//         MPLUSRounded1c_Light = Typeface.createFromAsset(context.getAssets(), "MPLUSRounded1c-Light.ttf");
//         MPLUSRounded1c_Medium = Typeface.createFromAsset(context.getAssets(), "MPLUSRounded1c-Medium.ttf");
//         MPLUSRounded1c_Regular = Typeface.createFromAsset(context.getAssets(), "MPLUSRounded1c-Regular.ttf");
    }

    // Affects default (closed) state of the spinner
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getView(position, convertView, parent);
        // view.setTypeface(MPLUSRounded1c_Regular);
        view.setGravity(Gravity.LEFT | Gravity.CENTER);

        view.setTextSize(14);
        return view;
    }

    // Affects opened state of the spinner
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView view = (TextView) super.getDropDownView(position, convertView, parent);
        // view.setTypeface(MPLUSRounded1c_Regular);
        view.setBackgroundResource(R.drawable.sp_bg);
        view.setGravity(Gravity.LEFT | Gravity.CENTER);
        view.setTextSize(14);
        return view;
    }
}