package com.awesomeapp.audio

sealed class State48_102 {
    data object Loading : State48_102()
    data class Success(val data: String) : State48_102()
    data class Error(val message: String) : State48_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}