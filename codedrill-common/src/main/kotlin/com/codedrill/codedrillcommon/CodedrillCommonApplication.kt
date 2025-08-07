package com.codedrill.codedrillcommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CodedrillCommonApplication

fun main(args: Array<String>) {
    runApplication<CodedrillCommonApplication>(*args)
}
