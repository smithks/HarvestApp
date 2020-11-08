package com.keegansmith.ironharvestapp.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.keegansmith.api.ClassUsingInterface
import com.keegansmith.core.CoreModule
import com.keegansmith.ironharvestapp.DaggerAppComponent
import com.keegansmith.ironharvestapp.RepoImplementation
import com.keegansmith.ironharvestapp.databinding.ActivityHomeBinding
import javax.inject.Inject

class HomeActivity: AppCompatActivity() {

    @Inject
    lateinit var classUsingInterface: ClassUsingInterface

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        DaggerAppComponent.builder()
            .coreModule(CoreModule(RepoImplementation()))
            .build()
            .inject(this)
        Toast.makeText(this, classUsingInterface.getString(), Toast.LENGTH_SHORT).show()

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()


//        val recyclerAdapter = BasicAdapter()
//        recycler.adapter = recyclerAdapter
//        recycler.layoutManager = LinearLayoutManager(this)

    }

}