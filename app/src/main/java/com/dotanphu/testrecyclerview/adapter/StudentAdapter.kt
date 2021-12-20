package com.dotanphu.testrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dotanphu.testrecyclerview.databinding.ItemListStudentBinding
import com.dotanphu.testrecyclerview.model.Student

class StudentAdapter(private var listStudent: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.viewHolder {
        return viewHolder(
            ItemListStudentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StudentAdapter.viewHolder, position: Int) {
        holder.bind(listStudent[position])

    }

    override fun getItemCount() = listStudent.size

    class viewHolder(private var binding: ItemListStudentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.tvName.text = student.name
            binding.tvAge.text = student.age.toString()
            binding.tvEmail.text = student.email
        }
    }

}