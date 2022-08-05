package com.devcommop.joaquin.codeforgood.di

import com.devcommop.joaquin.codeforgood.data.RepositoryImpl
import com.devcommop.joaquin.codeforgood.data.db.FirestoreDb
import com.devcommop.joaquin.codeforgood.data.db.RoomDb
import com.devcommop.joaquin.codeforgood.domain.Repository
import com.devcommop.joaquin.codeforgood.domain.db.CachingDatabase
import com.devcommop.joaquin.codeforgood.domain.db.OnlineDatabase
import org.koin.dsl.module

val dataModule = module {

    single<Repository> { RepositoryImpl() }//when someone asks for Repo just give him RepoImpl
    single<OnlineDatabase> { FirestoreDb() }
    single<CachingDatabase> { RoomDb() }

}
