package com.awesomeapp.identitycontact

sealed class State53_99 {
    data object Loading : State53_99()
    data class Success(val data: String) : State53_99()
    data class Error(val message: String) : State53_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}