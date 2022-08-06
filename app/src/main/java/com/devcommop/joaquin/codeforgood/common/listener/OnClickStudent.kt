package com.devcommop.joaquin.codeforgood.common.listener

interface OnClickStudent {
    fun onClick()
}

interface OnClickClass{
    fun onClick()
}

interface OnClickStudentAdd {
    fun onClick()
    fun onClickAdd()
}

interface OnClickStudentAddRemove {
    fun onClick()
    fun onClickAdd()
    fun onClickSubtract()
    fun onClickRemove()
}