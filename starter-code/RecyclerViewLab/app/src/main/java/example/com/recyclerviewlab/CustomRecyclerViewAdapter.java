package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by roosevelt on 7/5/16.
 */
public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<CustomObject> mCustomObjectList;

    public CustomRecyclerViewAdapter(List<CustomObject> mCustomObjectList) {
        this.mCustomObjectList = mCustomObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_layout, parent, false);

        CustomViewHolder viewHolder = new CustomViewHolder(parentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
//        final int myPosition = position;
        CustomObject customObject = mCustomObjectList.get(position);
        final String theTitle = customObject.getTitle();

        holder.setText1Text(theTitle);
        holder.setText2Text(customObject.getDescription());
        holder.setColor(customObject.getColor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Title " + theTitle,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mCustomObjectList.size();
    }
}
