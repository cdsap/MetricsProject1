package com.awesomeapp.commentcontact

sealed class State59_93 {
    data object Loading : State59_93()
    data class Success(val data: String) : State59_93()
    data class Error(val message: String) : State59_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}