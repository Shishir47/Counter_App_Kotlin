package com.example.testapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var myTxt: TextView
    private var isVisible: Boolean= false
    private var count: Int= 0
    private lateinit var appTitle: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTxt= findViewById(R.id.myTxt)
    }
    fun countUp(view: View){
        count++
        myTxt.text=count.toString()
    }
    fun countDown(view: View){
        if(count==0){
            myTxt.text=getString(R.string.btn_txt)
            return
        }
        count--
        myTxt.text=count.toString()
    }
    fun countReset(view: View){
        count=0
        myTxt.text=count.toString()
    }
}