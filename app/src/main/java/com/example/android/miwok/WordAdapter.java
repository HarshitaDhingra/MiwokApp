package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter {

    private int mColorResourceId;
        public WordAdapter(Context context, ArrayList<Word> pWords,int ColorResourceId) {
                super(context,0, pWords);

                   mColorResourceId=ColorResourceId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
             // Check if the existing view is being reused, otherwise inflate the view
                View listItemView = convertView;

                if(listItemView == null) {
                        listItemView = LayoutInflater.from(getContext()).inflate(
                                R.layout.list_item, parent, false);
                }
                Word my_word= (Word) getItem(position);

                TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
                miwokTextView.setText(my_word.getMiwokTranslation());

                TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
                defaultTextView.setText(my_word.getDefaultTranslation());

                 ImageView i=(ImageView) listItemView.findViewById(R.id.image);

                 if(my_word.hasImage())
            {   i.setImageResource(my_word.getImageResourceId());
            // make sure view is visible
                i.setVisibility(View.VISIBLE);}
            else
            { i.setVisibility(View.GONE);}

            View textContainer =listItemView.findViewById(R.id.text_container);
            int color= ContextCompat.getColor(getContext(),mColorResourceId);
            textContainer.setBackgroundColor(color);
                return listItemView;
        }
}
