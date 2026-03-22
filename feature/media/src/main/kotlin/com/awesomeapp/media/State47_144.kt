package com.awesomeapp.media

sealed class State47_144 {
    data object Loading : State47_144()
    data class Success(val data: String) : State47_144()
    data class Error(val message: String) : State47_144()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}