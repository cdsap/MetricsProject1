package com.awesomeapp.checkoutcontact

sealed class State54_139 {
    data object Loading : State54_139()
    data class Success(val data: String) : State54_139()
    data class Error(val message: String) : State54_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}