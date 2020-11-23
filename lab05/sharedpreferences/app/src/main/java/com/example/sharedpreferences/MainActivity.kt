package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val input = findViewById<EditText>(R.id.editText)
		val saveButton = findViewById<Button>(R.id.button)
		val sharedPreferences: SharedPreferences = this.getPreferences(Context.MODE_PRIVATE)

		input.setText(sharedPreferences.getString("text", ""))

		saveButton.setOnClickListener(View.OnClickListener {
			val newText:String = input.text.toString()
			val editor:SharedPreferences.Editor = sharedPreferences.edit()
			editor.putString("text", newText)
			editor.apply()
			editor.commit()
		})
	}
}