package com.tappytoon.ledgerkeeper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LedgerkeeperApplication

fun main(args: Array<String>) {
    runApplication<LedgerkeeperApplication>(*args)
}
