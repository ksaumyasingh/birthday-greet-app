package com.example.greetinggreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        //Toast.makeText(this,"Button was clicked",Toast.LENGTH_LONG).show()
        val name = nameInput.editableText.toString()
        val intent = Intent(this,BirthdayGreetingActivity::class.java)//ek process se dusare process me jane ka tarika hota h yaha pe ye hai activity
        //intent ke use se hm jump kar sakte h ek screen ye dusare pe n also to youtube and instagram via link
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)//intent ke through data v pass kar sakte h key value pair pass kar sakte h key first part value second part ke ke
        startActivity(intent)//starting intent activity
    }
}