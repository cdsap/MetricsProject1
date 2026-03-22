package com.awesomeapp.gallerycontact

sealed class State95_146 {
    data object Loading : State95_146()
    data class Success(val data: String) : State95_146()
    data class Error(val message: String) : State95_146()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}