package xyz.redbooks.umme.adapter;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.redbooks.umme.R;


public class CustomGridAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] web;
    private final int[] Imageid;

    public CustomGridAdapter(Context c, String[] web, int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
        this.web = web;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return web.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(     Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.grid_single, parent, false);
        } else {
            grid = (View) convertView;
        }
        TextView text = (TextView)grid.findViewById(R.id.grid_text);
        text.setText(web[position]);
        text.setGravity(Gravity.CENTER);
        ImageView image = (ImageView)grid.findViewById(R.id.grid_image);
        image.setImageResource(Imageid[position]);
        return grid;
    }
}
