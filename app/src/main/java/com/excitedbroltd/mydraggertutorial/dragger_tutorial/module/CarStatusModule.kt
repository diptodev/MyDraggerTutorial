package com.excitedbroltd.mydraggertutorial.dragger_tutorial.module

import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarNew
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarStatus
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class CarStatusModule {
    @Provides
    fun getCarStatus(): CarStatus {
        return CarNew()
    }
}