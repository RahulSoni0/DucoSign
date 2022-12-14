package com.devcommop.joaquin.codeforgood.di

import com.devcommop.joaquin.codeforgood.data.repository.RepositoryImpl
import com.devcommop.joaquin.codeforgood.data.db.FirestoreDb
import com.devcommop.joaquin.codeforgood.data.db.RoomDb
import com.devcommop.joaquin.codeforgood.domain.repository.Repository
import com.devcommop.joaquin.codeforgood.domain.db.CachingDatabase
import com.devcommop.joaquin.codeforgood.domain.db.OnlineDatabase
import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val dataModule = module {

    single<Repository> { RepositoryImpl(get()) }//when someone asks for Repo just give him RepoImpl
    single<OnlineDatabase> { FirestoreDb() }
    //single<CachingDatabase> { RoomDb() } --> Cannot inject abstract class beacuse its instance cannot be created. Rather we should be using getInstance() builder pattern
    single<CachingDatabase> { RoomDb.getInstance() }
    single{ FirebaseAuth.getInstance() }

}
