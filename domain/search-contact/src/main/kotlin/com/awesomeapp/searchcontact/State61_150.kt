package com.awesomeapp.searchcontact

sealed class State61_150 {
    data object Loading : State61_150()
    data class Success(val data: String) : State61_150()
    data class Error(val message: String) : State61_150()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}