package com.devcommop.joaquin.codeforgood.domain.util

sealed class StudentOrder(val orderType: OrderType){

    class DateStart(orderType: OrderType): StudentOrder(orderType = orderType)
    class Ranking(orderType: OrderType): StudentOrder(orderType = orderType)
    class Class(orderType: OrderType): StudentOrder(orderType = orderType)
    class City(orderType: OrderType): StudentOrder(orderType = orderType)
    class Subject(orderType: OrderType): StudentOrder(orderType = orderType)
    class Attendance(orderType: OrderType): StudentOrder(orderType = orderType)
    class Complaints(orderType: OrderType): StudentOrder(orderType = orderType)

    fun copy(orderType: OrderType): StudentOrder{
        return when(this){
            is DateStart -> DateStart(orderType)
            is Ranking -> Ranking(orderType)
            is Class -> Class(orderType)
            is City -> City(orderType)
            is Subject -> Subject(orderType)
            is Attendance -> Attendance(orderType)
            is Complaints -> Complaints(orderType)
        }
    }

}