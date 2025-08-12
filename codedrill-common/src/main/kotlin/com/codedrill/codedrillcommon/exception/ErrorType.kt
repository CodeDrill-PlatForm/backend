package com.codedrill.codedrillcommon.exception

import org.springframework.boot.logging.LogLevel
import com.codedrill.codedrillcommon.exception.StatusCode.*;

/**
 * 발생하는 모든 에러 유형을 정의하는 Enum.
 *
 * @property statusCode  HTTP 상태 코드 (StatusCode Enum)
 * @property errorCode   클라이언트 응답에 포함될 에러 코드
 * @property message     에러 메시지 (로깅 및 디버깅 용)
 * @property logLevel    로깅 레벨
 */
enum class ErrorType(
    val statusCode: StatusCode,
    val errorCode: String,
    val message: String,
    val logLevel: LogLevel
) {
    // COMMON
    SERVER_ERROR(INTERNAL_SERVER_ERROR, "Server Error", "Server Error", LogLevel.ERROR),

}
