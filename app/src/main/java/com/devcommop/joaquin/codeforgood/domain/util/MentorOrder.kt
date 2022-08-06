package com.devcommop.joaquin.codeforgood.domain.util

sealed class MentorOrder(val orderType: OrderType){

    class DateStart(orderType: OrderType): MentorOrder(orderType = orderType)
    class Rating(orderType: OrderType): MentorOrder(orderType = orderType)
    class Class(orderType: OrderType): MentorOrder(orderType = orderType)
    class City(orderType: OrderType): MentorOrder(orderType = orderType)
    class Subject(orderType: OrderType): MentorOrder(orderType = orderType)
    class Complaints(orderType: OrderType): MentorOrder(orderType = orderType)

    fun copy(orderType: OrderType): MentorOrder{
        return when(this){
            is MentorOrder.DateStart -> MentorOrder.DateStart(orderType)
            is MentorOrder.Rating -> MentorOrder.Rating(orderType)
            is MentorOrder.Class -> MentorOrder.Class(orderType)
            is MentorOrder.City -> MentorOrder.City(orderType)
            is MentorOrder.Subject -> MentorOrder.Subject(orderType)
            is MentorOrder.Complaints -> MentorOrder.Complaints(orderType)
        }
    }

}
