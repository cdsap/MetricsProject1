package com.awesomeapp.metriccontact

sealed class State76_116 {
    data object Loading : State76_116()
    data class Success(val data: String) : State76_116()
    data class Error(val message: String) : State76_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}