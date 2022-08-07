package com.example.cesarapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cesarapp.databinding.RowBinding

class CourseAdapter(private var courses: List<CourseEntity>) :
    RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(private val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(courseEntity: CourseEntity) {
            with(courseEntity) {
                binding.textViewName.text = name
                binding.textViewDate.text = startdate
                binding.textViewDesc.text = desc
            }
        }
    }

    fun update(courses:List<CourseEntity>){
        this.courses = courses
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return CourseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.bind(courses[position])
    }

    override fun getItemCount(): Int = courses.size


}