package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import android.util.Log
import javax.inject.Inject

interface CarStatus {
    fun carStatus()
}


class CarOld @Inject constructor() : CarStatus {
    override fun carStatus() {
        Log.d("DaggerTester", "carStatus: old")
    }

}

class CarNew() : CarStatus {
    override fun carStatus() {
        Log.d("DaggerTester", "carStatus: new")
    }

}