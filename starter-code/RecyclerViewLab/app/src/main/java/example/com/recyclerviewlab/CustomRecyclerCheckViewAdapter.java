package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by roosevelt on 7/5/16.
 */
public class CustomRecyclerCheckViewAdapter extends RecyclerView.Adapter<CustomCheckViewHolder> {

    List<CustomObjectCheck> mCheckObjectList;

    public CustomRecyclerCheckViewAdapter(List<CustomObjectCheck> mCheckObjectList) {
        this.mCheckObjectList = mCheckObjectList;
    }

    @Override
    public CustomCheckViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_layout_checkbox, parent, false);

        CustomCheckViewHolder checkViewHolder = new CustomCheckViewHolder(parentView);

        return checkViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomCheckViewHolder holder, int position) {
        final int pos = position;
        CustomObjectCheck customObject = mCheckObjectList.get(position);
        holder.setText1Text(customObject.getTitle());
        holder.setText2Text(customObject.getDescription());
        holder.setColor(customObject.getColor());
        holder.setChecked(customObject.isSelected());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = !mCheckObjectList.get(pos).isSelected();
                CheckBox cbo = (CheckBox) view.findViewById(R.id.check);
                cbo.setChecked(selected);
                mCheckObjectList.get(pos).setSelected(selected);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mCheckObjectList.size();
    }
}
