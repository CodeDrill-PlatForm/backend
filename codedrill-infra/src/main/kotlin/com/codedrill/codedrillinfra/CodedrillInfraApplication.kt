package com.codedrill.codedrillinfra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CodedrillInfraApplication

fun main(args: Array<String>) {
    runApplication<CodedrillInfraApplication>(*args)
}
