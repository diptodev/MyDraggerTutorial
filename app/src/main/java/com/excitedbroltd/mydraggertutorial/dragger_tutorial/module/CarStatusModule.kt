package com.excitedbroltd.mydraggertutorial.dragger_tutorial.module

import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarNew
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarOld
import com.excitedbroltd.mydraggertutorial.dragger_tutorial.CarStatus
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class CarStatusModule {
    @Provides
    @Named("new")
    fun getCarStatus(): CarStatus {
        return CarNew()
    }

    @Provides
    @Named("old")
    fun getCarOld(carOld: CarOld): CarStatus {
        return carOld
    }


}