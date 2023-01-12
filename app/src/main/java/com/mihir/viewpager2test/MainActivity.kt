package com.mihir.viewpager2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihir.viewpager2test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val viewPager = binding.viewPager
        val adapter = Adapter(this)
        viewPager.adapter = adapter
    }
}