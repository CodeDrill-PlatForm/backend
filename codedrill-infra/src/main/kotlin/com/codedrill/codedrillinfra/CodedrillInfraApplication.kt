package com.codedrill.codedrillinfra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodedrillInfraApplication

fun main(args: Array<String>) {
    runApplication<CodedrillInfraApplication>(*args)
}
