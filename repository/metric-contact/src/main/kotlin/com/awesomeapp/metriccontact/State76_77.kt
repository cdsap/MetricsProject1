package com.awesomeapp.metriccontact

sealed class State76_77 {
    data object Loading : State76_77()
    data class Success(val data: String) : State76_77()
    data class Error(val message: String) : State76_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}