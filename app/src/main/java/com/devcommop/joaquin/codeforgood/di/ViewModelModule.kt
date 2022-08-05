package com.devcommop.joaquin.codeforgood.di

import com.devcommop.joaquin.codeforgood.ui.MainViewModel
import com.devcommop.joaquin.codeforgood.ui.announcements_screen.AnnouncementsViewModel
import com.devcommop.joaquin.codeforgood.ui.attendance_screen.AttendanceViewModel
import com.devcommop.joaquin.codeforgood.ui.home_screen.HomeViewModel
import com.devcommop.joaquin.codeforgood.ui.sponsors_screen.SponsorsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }
    viewModel { AnnouncementsViewModel(get()) }
    viewModel { AttendanceViewModel(get()) }
    viewModel { HomeViewModel(get()) }
    viewModel { SponsorsViewModel(get()) }

}