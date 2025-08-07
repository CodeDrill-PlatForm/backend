package com.codedrill.codedrillapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CodedrillApiApplication

fun main(args: Array<String>) {
    runApplication<CodedrillApiApplication>(*args)
}
