//package com.citizenzet.restclient.adapter;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import com.citizenzet.myapplication.R;
//import com.citizenzet.restclient.model.Sample;
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {
//
//    private List<Sample> items;
//
//    private int rowLayout;
//
//    private Context context;
//
//    public static final String IMAGE_URL_BASE_PATH="http://concepture.club";
//
//    public SampleAdapter(List<Sample> items, int rowLayout, Context context) {
//
//        this.items = items;
//
//        this.rowLayout = rowLayout;
//
//        this.context = context;
//
//    }
//
////A view holder inner class where we get reference to the views in the layout using their ID
//
//    public static class SampleViewHolder extends RecyclerView.ViewHolder {
//
//        LinearLayout sampleLayout;
//
//        TextView text;
//
//
//        ImageView image;
//
//        public SampleViewHolder(View v) {
//
//            super(v);
//
//            sampleLayout = (LinearLayout) v.findViewById(R.id.sample_layout);
//
//            image = (ImageView) v.findViewById(R.id.image);
//
//            text = (TextView) v.findViewById(R.id.text);
//
//
//        }
//
//    }
//
//    @Override
//
//    public SampleAdapter.SampleViewHolder onCreateViewHolder(ViewGroup parent,
//
//                                                             int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
//
//        return new SampleViewHolder(view);
//
//    }
//
//    @Override
//
//    public void onBindViewHolder(SampleViewHolder holder, final int position) {
//
//        //String image_url = IMAGE_URL_BASE_PATH + items.get(position).getPosterPath();
//
//        String image_url = IMAGE_URL_BASE_PATH + "/common/uploads/articles/726/1551060535.jpg";
//
//        Picasso.with(context)
//
//                .load(image_url)
//
//                .placeholder(android.R.drawable.sym_def_app_icon)
//
//                .error(android.R.drawable.sym_def_app_icon)
//
//                .into(holder.image);
//
//        holder.text.setText(items.get(position).getText());
//
//
//    }
//
//    @Override
//
//    public int getItemCount() {
//
//        return items.size();
//
//    }
//
//}
//