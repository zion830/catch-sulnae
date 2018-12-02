package com.sulnae.sulnae.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sulnae.sulnae.R
import kotlinx.android.synthetic.main.activity_detail.*
import org.jetbrains.anko.startActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initView()
    }

    fun initView() {
        supportActionBar!!.setHomeAsUpIndicator(null)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        tv_title.text = intent.getStringExtra("title")
        tv_explain.text = intent.getStringExtra("intro")
        rating.numStars = intent.getIntExtra("rating", 0)
        tv_capacity.text = intent.getStringExtra("drinkCapacity")
        iv_item.setImageResource(intent.getIntExtra("img", R.drawable.img1))

        fb.setOnClickListener {
            startActivity<AddNewActivity>()
        }
    }
}
