package com.awesomeapp.gallerycontact

sealed class State95_80 {
    data object Loading : State95_80()
    data class Success(val data: String) : State95_80()
    data class Error(val message: String) : State95_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}