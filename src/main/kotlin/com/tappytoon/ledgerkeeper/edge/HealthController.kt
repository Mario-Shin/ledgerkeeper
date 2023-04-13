package com.tappytoon.ledgerkeeper.edge

import com.tappytoon.ledgerkeeper.entity.Health
import com.tappytoon.ledgerkeeper.service.HealthService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController(private val healthService: HealthService) {

    @GetMapping
    suspend fun health(): Health {
        TODO()
    }

}
