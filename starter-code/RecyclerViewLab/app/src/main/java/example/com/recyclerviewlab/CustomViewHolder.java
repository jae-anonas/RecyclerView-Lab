package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by roosevelt on 7/5/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;
    private TextView mText1;
    private TextView mText2;

    public CustomViewHolder(View itemView) {
        super(itemView);
        mImageView = (ImageView) itemView.findViewById(R.id.colorbox);
        mText1 = (TextView) itemView.findViewById(R.id.text1);
        mText2 = (TextView) itemView.findViewById(R.id.text2);
    }
    public void setText1Text(String str){
        mText1 = (TextView) itemView.findViewById(R.id.text1);
        mText1.setText(str);
    }

    public void setText2Text(String str){
        mText2 = (TextView) itemView.findViewById(R.id.text2);
        mText2.setText(str);
    }

    public String getText1Text(){
        mText1 = (TextView) itemView.findViewById(R.id.text1);
        return mText1.getText().toString();
    }

    public String getText2Text(){
        mText2 = (TextView) itemView.findViewById(R.id.text2);
        return mText2.getText().toString();
    }

    public void setColor(String str){
        mImageView = (ImageView) itemView.findViewById(R.id.colorbox);
        mImageView.setBackgroundColor(Color.parseColor(str));
    }
}
