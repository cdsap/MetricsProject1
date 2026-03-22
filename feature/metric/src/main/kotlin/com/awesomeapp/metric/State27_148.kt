package com.awesomeapp.metric

sealed class State27_148 {
    data object Loading : State27_148()
    data class Success(val data: String) : State27_148()
    data class Error(val message: String) : State27_148()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}