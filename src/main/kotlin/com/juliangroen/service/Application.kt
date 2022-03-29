package com.juliangroen.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

// STANDARD CARRIER FUNCTIONALITY DEPENDENCY

// FEATURE FLAGS, LOGGING, RABBITMQ

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}