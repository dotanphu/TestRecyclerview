package com.dotanphu.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.dotanphu.testrecyclerview.adapter.StudentAdapter
import com.dotanphu.testrecyclerview.databinding.ActivityMainBinding
import com.dotanphu.testrecyclerview.model.Student

class MainActivity : AppCompatActivity() {
    private var student = arrayListOf<Student>(
        Student("Phú",20,"phu1682000@gmail.com"),
    )
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = StudentAdapter(student)
        binding.rvListStudent.adapter = adapter
        binding.rvListStudent.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}