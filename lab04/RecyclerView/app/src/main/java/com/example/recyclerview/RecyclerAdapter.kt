package com.example.recyclerview

import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class RecyclerAdapter(private val students: ArrayList<Student>) : RecyclerView.Adapter<RecyclerAdapter.StudentHolder>() {
    class StudentHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var student: Student? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            Log.d("RecyclerView", "CLICK!")
        }

        companion object {
            private val STUDENT_KEY = "STUDENT"
        }

        fun bindStudent(student: Student) {
            this.student = student
            view.itemDescription.text = student.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.StudentHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return StudentHolder(inflatedView)
    }

    override fun getItemCount() = students.size

    override fun onBindViewHolder(holder: RecyclerAdapter.StudentHolder, position: Int) {
        val itemStudent = students[position]
        holder.bindStudent(itemStudent)
    }
}