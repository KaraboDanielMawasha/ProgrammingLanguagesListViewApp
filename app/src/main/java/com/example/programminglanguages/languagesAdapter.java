package com.example.programminglanguages;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class languagesAdapter extends BaseAdapter {

    private static LayoutInflater layoutInflater;
    //    implementing
    public final Context context;
    public final String[] titles;
    public final String[] descriptions;
    public final TypedArray images;

    languagesAdapter(Context adapterContext, String[] title, String[] description, TypedArray image) {
        titles = title;
        descriptions = description;
        images = image;
        context = adapterContext;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.list_layout, parent, false);
            viewHolder.title = convertView.findViewById(R.id.textView);
            viewHolder.description = convertView.findViewById(R.id.textView2);
            viewHolder.images = convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.title.setText(titles[position]);
        viewHolder.description.setText(descriptions[position]);
        viewHolder.images.setImageResource(images.getResourceId(position, 0));

        return convertView;
    }

    public static class ViewHolder {
        TextView title, description;
        ImageView images;
    }
}
