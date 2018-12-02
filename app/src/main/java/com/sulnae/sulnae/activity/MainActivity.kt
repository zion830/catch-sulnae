package com.sulnae.sulnae.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.sulnae.sulnae.R
import com.sulnae.sulnae.adapter.AlcoholAdapter
import com.sulnae.sulnae.view.OnRecyclerItemClickListener
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity


class MainActivity : AppCompatActivity() {
    lateinit var adapter: AlcoholAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        et_search.clearFocus()
        adapter = AlcoholAdapter(applicationContext)
        rv_main.adapter = adapter

        adapter.notifyDataSetChanged()
        rv_main.layoutManager = LinearLayoutManager(applicationContext)
        rv_main.addOnItemTouchListener(OnRecyclerItemClickListener(this, rv_main,
                object : OnRecyclerItemClickListener.OnItemClickListener {
                    override fun onItemClick(view: View, position: Int) {
                        val item = adapter.getItem(position)
                        startActivity<DetailActivity>(
                                "title" to item.name,
                                "intro" to item.intro,
                                "rating" to item.rating,
                                "capacity" to item.drinkCapacity,
                                "img" to item.image,
                                "id" to item.alcoholId)
                    }
                }))
    }
}
