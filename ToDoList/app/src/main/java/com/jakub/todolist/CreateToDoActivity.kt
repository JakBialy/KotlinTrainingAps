package com.jakub.todolist

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_to_do.*

class CreateToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_to_do)

        saveButton.setOnClickListener {
            title = ""

            if (importantCheckBox.isChecked) {
                title = "❗" + titleEditText.text.toString()
            } else {
                title = titleEditText.text.toString()
            }

            var prefs = getSharedPreferences(getString(R.string.SHARED_PREF_NAME), Context.MODE_PRIVATE)
            var todos = prefs.getStringSet(getString(R.string.TODO_STRINGS), setOf()).toMutableSet()
            todos.add(title as String)

            prefs.edit().putStringSet(getString(R.string.TODO_STRINGS), todos).apply()

            finish()
        }
    }
}
