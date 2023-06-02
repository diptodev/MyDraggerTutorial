package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import android.util.Log
import javax.inject.Inject

interface CarColor {
    fun carColor()
}

class ColorRed @Inject constructor() : CarColor {
    override fun carColor() {
        Log.d("DaggerTester", "carColor: Color red")
    }
}

class ColorGreen() : CarColor {
    override fun carColor() {
        Log.d("DaggerTester", "carColor: Color Green")
    }

}