package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(
    private val carColor: CarColor,
    @Named("old") private val carStatus: CarStatus
) {
    fun getCarInfo() {
        carStatus.carStatus()
        carColor.carColor()
    }

}