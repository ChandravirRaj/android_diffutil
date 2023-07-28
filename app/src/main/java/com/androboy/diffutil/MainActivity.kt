package com.androboy.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.androboy.diffutil.adapters.BooksAdapter
import com.androboy.diffutil.adapters.BooksAdapter1
import com.androboy.diffutil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val booksAdapter = BooksAdapter1()
        booksAdapter.submitList(AppUtils.loadData())

        binding.apply {
            recyclerview.apply {
                layoutManager = LinearLayoutManager(this@MainActivity);
                adapter = booksAdapter

            }
        }

        binding.appCompatButton.setOnClickListener {
            booksAdapter.submitList(AppUtils.loadData1())
        }
        binding.appCompatButton2.setOnClickListener {
            booksAdapter.submitList(AppUtils.loadData2())
        }
    }



}