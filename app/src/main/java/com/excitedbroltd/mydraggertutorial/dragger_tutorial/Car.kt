package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import javax.inject.Inject

class Car @Inject constructor(private val carColor: CarColor, private val carStatus: CarStatus) {
    fun getCarInfo() {
        carStatus.carStatus()
        carColor.carColor()
    }

}