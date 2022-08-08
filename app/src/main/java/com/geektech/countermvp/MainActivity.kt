package com.geektech.countermvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.countermvp.databinding.ActivityMainBinding
import com.geektech.countermvp.view.CounterView
import com.geektech.countermvp.view.showToast

open class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        presenter.attachViw(this)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()

            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun updateCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun col(count: Color) {
        binding.counterTv.setTextColor(Color.GREEN)
    }
        override fun colo(count: Color) {
         binding.counterTv.setTextColor(Color.BLACK)
    }

    override fun showToast( ) {
        showToast("10")
    }



}