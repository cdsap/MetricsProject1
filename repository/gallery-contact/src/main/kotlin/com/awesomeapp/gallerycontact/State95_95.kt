package com.awesomeapp.gallerycontact

sealed class State95_95 {
    data object Loading : State95_95()
    data class Success(val data: String) : State95_95()
    data class Error(val message: String) : State95_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}