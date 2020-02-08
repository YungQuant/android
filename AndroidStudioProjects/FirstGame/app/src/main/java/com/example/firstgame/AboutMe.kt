package com.example.firstgame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activityaboutme.*

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityaboutme)

        button4.setOnClickListener {
            startActivity(Intent(this, AboutYou::class.java))
        }

        supportFragmentManager.beginTransaction().replace(R.id.layout2, FragmentOne()).commit()

    }

}