package com.rifqiy.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //code
            Log.i("Mainactivity","Button Was Click")

            Toast.makeText(this,"Button Was Clicked !",Toast.LENGTH_LONG).show()
        }

        btnSendMsgToNectActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
