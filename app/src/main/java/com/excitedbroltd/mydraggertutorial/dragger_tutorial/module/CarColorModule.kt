package com.excitedbroltd.mydraggertutorial.dragger_tutorial.module

import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarColor
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.ColorGreen
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class CarColorModule {
    @Provides
    fun getCarColor(): CarColor {
        return ColorGreen()
    }

}