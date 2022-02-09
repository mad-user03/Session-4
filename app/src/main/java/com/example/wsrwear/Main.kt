package com.example.wsrwear

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class Main : Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    fun lastOnClick(view: View) {
        startActivity(Intent(this, FavoriteScreen::class.java))
    }
    fun firstOnClick(view: View) {
        startActivity(Intent(this, ChatList::class.java))
    }
    fun secOnClick(view: View) {
        startActivity(Intent(this, CompilationScrene::class.java))
    }
}