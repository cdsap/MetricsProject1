package com.awesomeapp.news

sealed class State41_111 {
    data object Loading : State41_111()
    data class Success(val data: String) : State41_111()
    data class Error(val message: String) : State41_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}