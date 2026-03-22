package com.awesomeapp.checkoutlogin

sealed class State103_135 {
    data object Loading : State103_135()
    data class Success(val data: String) : State103_135()
    data class Error(val message: String) : State103_135()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}