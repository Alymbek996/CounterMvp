package com.geektech.countermvp.presenter

import android.graphics.Color
import android.widget.Toast
import androidx.core.graphics.toColor
import com.geektech.countermvp.Injector
import com.geektech.countermvp.MainActivity
import com.geektech.countermvp.databinding.ActivityMainBinding
import com.geektech.countermvp.model.CounterModel
import com.geektech.countermvp.view.CounterView

class Presenter {
    lateinit var view: CounterView
    private val model = Injector.getModel()


    fun increment() {
        model.increment()
        view.updateCount(model.count)
        if (model.count == 10){
            view.showToast()
        }

        if (model.count >= 15) {
            view.col(model.count.toColor())


        }
    }
        fun decrement() {
            model.decrement()
            view.updateCount(model.count)
            if (model.count <= 14) {
                view.colo(model.count.toColor())
            }
        }

        fun attachViw(counterView: CounterView) {
            view = counterView
        }

    }
