package com.awesomeapp.todo

sealed class State36_93 {
    data object Loading : State36_93()
    data class Success(val data: String) : State36_93()
    data class Error(val message: String) : State36_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}