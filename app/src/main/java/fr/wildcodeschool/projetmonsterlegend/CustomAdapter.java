package fr.wildcodeschool.projetmonsterlegend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<RowItem> {


    public CustomAdapter(Context context, ArrayList<RowItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RowItem item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }
        RelativeLayout itemGeneral = convertView.findViewById(R.id.item_layout_id);
        itemGeneral.setBackgroundResource(item.getColor());


        TextView monsterName = convertView.findViewById(R.id.monster_name);
        monsterName.setText(item.getMonster_name());

        ImageView monsterPics = convertView.findViewById(R.id.monster_pics);
        Drawable monsterImage = ContextCompat.getDrawable(getContext(), item.getMonster_pics_id());
        monsterPics.setImageDrawable(monsterImage);

        ImageView monsterBte = convertView.findViewById(R.id.monsters_type_pic);
        Drawable monsterType = ContextCompat.getDrawable(getContext(), item.getMonsters_type_pic_id());
        monsterBte.setImageDrawable(monsterType);






        return convertView;
    }

}
