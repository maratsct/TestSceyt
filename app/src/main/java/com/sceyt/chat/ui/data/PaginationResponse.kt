package com.sceyt.chat.ui.data

import com.sceyt.chat.ui.data.models.SceytResponse

sealed class PaginationResponse<T> {

    data class DBResponse<T>(
            val data: List<T>,
            val offset: Int = 0
    ) : PaginationResponse<T>()

    data class ServerResponse<T>(
            val data: SceytResponse<List<T>>,
            val offset: Int = 0
    ) : PaginationResponse<T>()

    class Nothing<T> : PaginationResponse<T>()
}
