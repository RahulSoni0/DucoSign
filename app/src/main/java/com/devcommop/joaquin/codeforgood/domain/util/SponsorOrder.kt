package com.devcommop.joaquin.codeforgood.domain.util

sealed class SponsorOrder(val orderType: OrderType){

    class DateStart(orderType: OrderType): SponsorOrder(orderType = orderType)
    class Funded(orderType: OrderType): SponsorOrder(orderType = orderType)
    class Occupation(orderType: OrderType): SponsorOrder(orderType = orderType)
    class City(orderType: OrderType): SponsorOrder(orderType = orderType)
    class Company(orderType: OrderType): SponsorOrder(orderType = orderType)

    fun copy(orderType: OrderType): SponsorOrder{
        return when(this){
            is SponsorOrder.DateStart -> SponsorOrder.DateStart(orderType)
            is SponsorOrder.Funded -> SponsorOrder.Funded(orderType)
            is SponsorOrder.Occupation -> SponsorOrder.Occupation(orderType)
            is SponsorOrder.City -> SponsorOrder.City(orderType)
            is SponsorOrder.Company -> SponsorOrder.Company(orderType)
        }
    }

}
