package com.example.firstgame

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.util.Log.d
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//import androidx.room
import androidx.room.Room

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activityaboutme.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.row_list.*

import java.util.List

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //@Entity(tableName = "table")
        //class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

        //supportFragmentManager.beginTransaction().replace(R.id.layout1, FragmentOne()).commit()

        val users= arrayListOf<String>("Duncan 1", "Duncan 2")
        //val users = ArrayList<String>()
        //for (i in 1..100)
        //    users[i] = "Duncan $i"

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "Welcome to my anus! $isChecked", Toast.LENGTH_LONG).show()
            if (isChecked){
                imageView1.visibility = View.VISIBLE
            } else {
                imageView1.visibility = View.GONE
            }
        }

        imageView1.setOnClickListener {
            Snackbar.make(consLayout, "snacktime", Snackbar.LENGTH_LONG).show()
        }

        button1.setOnClickListener {
            d("Duncan", "Kasey")
            //startActivity(Intent(this, AboutMe::class.java))
            if (editText2.text.toString() == "1") {
                imageView1.setImageResource(R.drawable.img1)
            } else if (editText2.text.toString() == "2") {
                imageView1.setImageResource(R.drawable.img2)
            }
        }

        //button2.setOnClickListener {
            //d("test", "test")
            //startActivity(Intent(this, AboutYou::class.java))
        //}

        button3.setOnClickListener {
            startActivity(Intent(this, AboutMe::class.java))
        }

        editText2.setOnClickListener {
            Toast.makeText(this, "Enjoy...", Toast.LENGTH_LONG).show()
        }

        recyclerView1.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = CycleAdapter(users)
        }

    }
}

