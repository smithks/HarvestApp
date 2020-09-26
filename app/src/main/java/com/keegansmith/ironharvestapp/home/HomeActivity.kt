package com.keegansmith.ironharvestapp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keegansmith.ironharvestapp.databinding.ActivityHomeBinding

class HomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()


//        val recyclerAdapter = BasicAdapter()
//        recycler.adapter = recyclerAdapter
//        recycler.layoutManager = LinearLayoutManager(this)

    }

}