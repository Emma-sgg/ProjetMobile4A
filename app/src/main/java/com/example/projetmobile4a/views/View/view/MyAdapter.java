package com.example.projetmobile4a.views.View.view;


import java.text.BreakIterator;
import java.util.List;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.projetmobile4a.R;
import com.example.projetmobile4a.views.View.model.Beer;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

  private List<Beer> values;
  public class ViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView name;

    public TextView txtHeader;
    public TextView txtFooter;
    public View layout;



    public ViewHolder(View v){//, OnItemClickListener listener) {
      super(v);
      layout = v;
      txtHeader = (TextView) v.findViewById(R.id.firstLine);
      txtFooter = (TextView) v.findViewById(R.id.secondLine);

    }
  }

  public void add(int position, Beer item) {
    values.add(position, item);
    notifyItemInserted(position);
  }


  public void remove(int position) {
    values.remove(position);
    notifyItemRemoved(position);
  }

  // Provide a suitable constructor (depends on the kind of dataset)
  public MyAdapter(List<Beer> myDataset) {
    values = myDataset;
  }

  // Create new views (invoked by the layout manager)
  @Override
  public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // create a new view
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    //LayoutInflater inflater = LayoutInflater.from(mContext);
    View v =  inflater.inflate(R.layout.row_layout, parent, false); //le fichier xml
    // set the view's size, margins, paddings and layout parameters

    ViewHolder vh = new ViewHolder(v);
    return vh;
  }

  // Replace the contents of a view (invoked by the layout manager)
  @Override
  public void onBindViewHolder(ViewHolder holder, final int position) {
    // - get element from your dataset at this position
    // - replace the contents of the view with that element
    //Beer obj_beer = values.get
    final Beer currentBeer = values.get(position);
    //String image_url = currentBeer.getImage_url();
    holder.txtHeader.setText(currentBeer.getName());
    // holder.txtFooter.setText(currentBeer.getName());
    holder.txtFooter.setText(currentBeer.getName());
   holder.txtFooter.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        // remove(position);
      }
    });

  }
  // Return the size of your dataset (invoked by the layout manager)
  @Override
  public int getItemCount() {
    return values.size();
  }

}
