package com.devcommop.joaquin.codeforgood.di

import com.devcommop.joaquin.codeforgood.ui.MainViewModel
import com.devcommop.joaquin.codeforgood.ui.announcements_screen.AnnouncementsViewModel
import com.devcommop.joaquin.codeforgood.ui.attendance_screen.AttendanceViewModel
import com.devcommop.joaquin.codeforgood.ui.classes_screen.ClassesViewModel
import com.devcommop.joaquin.codeforgood.ui.classes_screen.class_detail_screen.ClassDetailViewModel
import com.devcommop.joaquin.codeforgood.ui.donation_screen.DonationsViewModel
import com.devcommop.joaquin.codeforgood.ui.home_screen.HomeViewModel
import com.devcommop.joaquin.codeforgood.ui.login_screen.LoginViewModel
import com.devcommop.joaquin.codeforgood.ui.signup_screen.SignUpViewModel
import com.devcommop.joaquin.codeforgood.ui.sponsors_screen.SponsorsViewModel
import com.devcommop.joaquin.codeforgood.ui.sponsors_screen.sponsor_detail_screen.SponsorDetailViewModel
import com.devcommop.joaquin.codeforgood.ui.students_screen.StudentsViewModel
import com.devcommop.joaquin.codeforgood.ui.students_screen.student_detail_screen.StudentDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }
    viewModel { AnnouncementsViewModel(get()) }
    viewModel { AttendanceViewModel(get()) }
    viewModel { HomeViewModel(get()) }
    viewModel { SponsorsViewModel(get()) }
    viewModel { SponsorDetailViewModel(get()) }
    viewModel { DonationsViewModel(get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { SignUpViewModel(get()) }
    viewModel { StudentsViewModel(get()) }
    viewModel { StudentDetailViewModel(get()) }
    viewModel { ClassesViewModel(get()) }
    viewModel { ClassDetailViewModel(get()) }

}