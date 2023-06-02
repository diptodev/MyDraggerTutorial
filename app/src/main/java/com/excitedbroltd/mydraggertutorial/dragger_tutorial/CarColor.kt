package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import android.util.Log

interface CarColor {
    fun carColor()
}

class ColorRed() : CarColor {
    override fun carColor() {
        Log.d("DaggerTester", "carColor: Color red")
    }
}

class ColorGreen() : CarColor {
    override fun carColor() {
        Log.d("DaggerTester", "carColor: Color Green")
    }

}