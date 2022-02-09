package com.example.wsrwear

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View


class MainActivity : Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    fun startMainScene(view: View) {
        startActivity(Intent(this, Main::class.java))
    }
}