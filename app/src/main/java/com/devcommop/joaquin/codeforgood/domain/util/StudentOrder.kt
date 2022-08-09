package com.devcommop.joaquin.codeforgood.domain.util

sealed class StudentOrder(val typeOfOrder: TypeOfOrder){

    class DateStart(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class Ranking(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class Class(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class City(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class Subject(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class Attendance(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)
    class Complaints(orderType: TypeOfOrder): StudentOrder(typeOfOrder = orderType)

    fun copy(typeOfOrder: TypeOfOrder): StudentOrder{
        return when(this){
            is DateStart -> DateStart(typeOfOrder)
            is Ranking -> Ranking(typeOfOrder)
            is Class -> Class(typeOfOrder)
            is City -> City(typeOfOrder)
            is Subject -> Subject(typeOfOrder)
            is Attendance -> Attendance(typeOfOrder)
            is Complaints -> Complaints(typeOfOrder)
        }
    }

}