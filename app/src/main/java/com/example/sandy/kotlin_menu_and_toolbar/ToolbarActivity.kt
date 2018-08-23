package com.example.sandy.kotlin_menu_and_toolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_toolbar.*

class ToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        /*for hide default toolbar customize style.xml*/
        setSupportActionBar(toolBar)
       // supportActionBar!!.setTitle("Add post here")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true) //for this method config AndroidManifest.xml
    }
}

