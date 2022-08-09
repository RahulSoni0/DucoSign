package com.devcommop.joaquin.codeforgood.domain.util

sealed class SponsorOrder(val typeOfOrder: TypeOfOrder){

    class DateStart(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)
    class Funded(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)
    class Occupation(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)
    class City(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)
    class Company(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)
    class Importance(orderType: TypeOfOrder): SponsorOrder(typeOfOrder = orderType)

    fun copy(typeOfOrder: TypeOfOrder): SponsorOrder{
        return when(this){
            is SponsorOrder.DateStart -> SponsorOrder.DateStart(typeOfOrder)
            is SponsorOrder.Funded -> SponsorOrder.Funded(typeOfOrder)
            is SponsorOrder.Occupation -> SponsorOrder.Occupation(typeOfOrder)
            is SponsorOrder.City -> SponsorOrder.City(typeOfOrder)
            is SponsorOrder.Company -> SponsorOrder.Company(typeOfOrder)
            is SponsorOrder.Importance -> SponsorOrder.Importance(typeOfOrder)
        }
    }

}
