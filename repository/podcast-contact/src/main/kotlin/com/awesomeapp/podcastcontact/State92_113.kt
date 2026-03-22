package com.awesomeapp.podcastcontact

sealed class State92_113 {
    data object Loading : State92_113()
    data class Success(val data: String) : State92_113()
    data class Error(val message: String) : State92_113()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}