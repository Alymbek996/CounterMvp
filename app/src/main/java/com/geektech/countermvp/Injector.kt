package com.geektech.countermvp

import com.geektech.countermvp.model.CounterModel
import com.geektech.countermvp.presenter.Presenter

class Injector {
   companion object {
      fun  getPresenter():Presenter{
         return Presenter()
      }
       fun getModel():CounterModel{
         return CounterModel()
       }

    }
}