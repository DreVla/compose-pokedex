package com.example.pokedex

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Provides
    @Singleton
    fun providePokeApiService(): PokeApiService {
        return RetrofitInstance.api
    }
}
