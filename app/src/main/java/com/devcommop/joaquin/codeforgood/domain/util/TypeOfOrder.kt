package com.devcommop.joaquin.codeforgood.domain.util

sealed class TypeOfOrder{

    object Ascending: TypeOfOrder()
    object Descending: TypeOfOrder()

}
