package com.example.greetinggreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{//esse hm sari static variable bana sakte h
        const val NAME_EXTRA = "name_extra"   //ab ye variable hm different activity me v excess kr skte h with activity name,ab name change hone ka daar nhi hoga in key value pair
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)//key yaha v same hona chahiye as main activity aur value passing activity taki we can identify which key pair value is this
        //it is address or name
        birthdayGreeting.text = "Happy Birthday\n $name!"
    }
}
