package com.devcommop.joaquin.codeforgood.domain.util

sealed class OrderType{

    object Ascending:OrderType()
    object Descending: OrderType()

}
