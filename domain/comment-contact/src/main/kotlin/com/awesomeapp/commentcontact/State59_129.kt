package com.awesomeapp.commentcontact

sealed class State59_129 {
    data object Loading : State59_129()
    data class Success(val data: String) : State59_129()
    data class Error(val message: String) : State59_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}