package com.awesomeapp.checkoutlogin

sealed class State103_141 {
    data object Loading : State103_141()
    data class Success(val data: String) : State103_141()
    data class Error(val message: String) : State103_141()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}