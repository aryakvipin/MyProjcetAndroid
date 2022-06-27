package com.arya.myprojcetandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder>

{

    private ArrayList<CourseModalNew> courseModalArrayList;
    private Context context;

    // creating a constructor for our variables.
    public CourseAdapter(ArrayList < CourseModalNew > courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_itemnew, parent, false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.ViewHolder holder, int position) {
        CourseModalNew modal = courseModalArrayList.get(position);
        holder.courseNameTV.setText(modal.getID());
        holder.courseTracksTV.setText(modal.getTitle());
        holder.courseModeTV.setText(modal.getShortDescription());
   //     holder.courseNameTV.setText(modal.getDescription());
//        holder.courseTracksTV.setText(modal.getLanguage());
//        holder.courseModeTV.setText(modal.getCategoryID());
//        holder.courseTracksTV.setText(modal.getSubCategoryID());
//        holder.courseModeTV.setText(modal.getSection());
//        holder.courseModeTV.setText(modal.getDiscountFlag());
//        holder.courseTracksTV.setText(modal.getDiscountedPrice());
//        holder.courseModeTV.setText(modal.getPrice());
//
//        holder.courseModeTV.setText(modal.getCategoryID());
//        holder.courseTracksTV.setText(modal.getSubCategoryID());
//        holder.courseModeTV.setText(modal.getSection());



    //    Picasso.get().load(modal.getCourseimg()).into(holder.courseIV);

    }

    @Override
    public int getItemCount() {
        return courseModalArrayList.size();
    }


    public class ViewHolder extends  RecyclerView.ViewHolder {
        // creating variables for our views.
        private TextView courseNameTV, courseModeTV, courseTracksTV;
       // private ImageView courseIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // initializing our views with their ids.
            courseNameTV = itemView.findViewById(R.id.idTVCourseNamenew);
            courseModeTV = itemView.findViewById(R.id.idTVBatch);
            courseTracksTV = itemView.findViewById(R.id.idTVTracks);
          //  courseIV = itemView.findViewById(R.id.idIVCourse);
        }
    }
}