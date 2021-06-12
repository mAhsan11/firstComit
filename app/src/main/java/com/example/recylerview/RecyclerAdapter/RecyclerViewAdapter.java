package com.example.recylerview.RecyclerAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recylerview.R;
import com.example.recylerview.StudentClass.Student;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    public List<Student> studentList;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }


    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerViewAdapter.ViewHolder holder, int position) {
        Student student= studentList.get(position);
        holder.tv_name.setText(student.getName());
        holder.tv_rollNo.setText(student.getRollNo());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View

            .OnClickListener{
        TextView tv_name,tv_rollNo;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_name= itemView.findViewById(R.id.tv_name);
            tv_rollNo= itemView.findViewById(R.id.tv_rollNo);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
