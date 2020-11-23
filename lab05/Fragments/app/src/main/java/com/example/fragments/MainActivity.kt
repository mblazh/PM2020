package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val button1 = findViewById<Button>(R.id.button)
		val button2 = findViewById<Button>(R.id.button2)

		replaceFragment(R.id.constraintLayout, Fragment1.newInstance("", ""))

		button1.setOnClickListener(View.OnClickListener {
			replaceFragment(R.id.constraintLayout, Fragment1.newInstance("", ""))
		})

		button2.setOnClickListener(View.OnClickListener {
			replaceFragment(R.id.constraintLayout, Fragment2.newInstance("", ""))
		})
	}

	private fun replaceFragment(containerViewId: Int, fragment: Fragment) {
		val manager: FragmentManager = supportFragmentManager
		val transaction: FragmentTransaction = manager.beginTransaction()
		transaction.replace(containerViewId, fragment)
		transaction.commit()
	}
}