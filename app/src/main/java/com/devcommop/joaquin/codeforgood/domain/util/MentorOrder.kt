package com.devcommop.joaquin.codeforgood.domain.util

sealed class MentorOrder(val typeOfOrder: TypeOfOrder){

    class DateStart(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)
    class Rating(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)
    class Class(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)
    class City(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)
    class Subject(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)
    class Complaints(orderType: TypeOfOrder): MentorOrder(typeOfOrder = orderType)

    fun copy(typeOfOrder: TypeOfOrder): MentorOrder{
        return when(this){
            is MentorOrder.DateStart -> MentorOrder.DateStart(typeOfOrder)
            is MentorOrder.Rating -> MentorOrder.Rating(typeOfOrder)
            is MentorOrder.Class -> MentorOrder.Class(typeOfOrder)
            is MentorOrder.City -> MentorOrder.City(typeOfOrder)
            is MentorOrder.Subject -> MentorOrder.Subject(typeOfOrder)
            is MentorOrder.Complaints -> MentorOrder.Complaints(typeOfOrder)
        }
    }

}
