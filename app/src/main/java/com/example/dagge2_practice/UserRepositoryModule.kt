package com.example.dagge2_practice

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {
//    @Provides
//    fun getFirebaseRepository() : UserRepository {
//        return FirebaseRepository() //Here dagger can't made FirebaseRepository object due to lack of @inject annotation
//    }
    //If we want sql repository dagger can make it own due to inject constructor in SQLRepository
//    @Provides
//    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository {
//        return sqlRepository
//    }

    //we know that SQLRepository dagger can make it own so why this manually write its code let's dagger to make it simpler and dagger make its code implementation
    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository

    //In Summary
    //@Provide if dagger can not make implementation
    //@Bind if dagger can do it's implementation due to @Inject on  it's constructor
}