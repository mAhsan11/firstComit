package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recylerview.RecyclerAdapter.RecyclerViewAdapter;
import com.example.recylerview.StudentClass.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Student> studentList=new ArrayList();
    RecyclerView rv_studentName;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList.add(new Student("Muhammad Ahsan","191188"));
        studentList.add(new Student("Muhammad Usman","191167"));
        studentList.add(new Student("Ahmed Hassan","191194"));
        studentList.add(new Student("Saqib Usman","191119"));
        studentList.add(new Student("Muhammad Dawood","191100"));
        studentList.add(new Student("Fahad","191149"));
        studentList.add(new Student("Ali Ahmed","191159"));
        studentList.add(new Student("Saqib Ali","191151"));
        studentList.add(new Student("Hassan Ahmed","191198"));
        studentList.add(new Student("Hamid Ali","191191"));
        studentList.add(new Student("Arslan jamil","191076"));
        studentList.add(new Student("Umair Ahmed","191094"));

        recyclerViewAdapter= new RecyclerViewAdapter(MainActivity.this,studentList);
        rv_studentName=findViewById(R.id.rv_studentName);
        rv_studentName.setHasFixedSize(true);
        rv_studentName.setLayoutManager(new LinearLayoutManager(this));
        rv_studentName.setAdapter(recyclerViewAdapter);
    }
}