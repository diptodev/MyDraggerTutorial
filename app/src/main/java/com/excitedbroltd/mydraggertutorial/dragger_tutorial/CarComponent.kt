package com.excitedbroltd.mydraggertutorial.dragger_tutorial

import com.excitedbroltd.mydraggertutorial.MainActivity
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.module.CarColorModule
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.module.CarStatusModule
import dagger.Component

@Component(modules = [CarStatusModule::class, CarColorModule::class])
interface CarComponent {
    fun injectDagger(mainActivity: MainActivity)
}