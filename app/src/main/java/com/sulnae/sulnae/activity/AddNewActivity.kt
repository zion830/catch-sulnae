package com.sulnae.sulnae.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sulnae.sulnae.R
import kotlinx.android.synthetic.main.activity_add.*

class AddNewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        supportActionBar!!.setHomeAsUpIndicator(null)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener {
            finish()
        }
    }
}
