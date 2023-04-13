package com.tappytoon.ledgerkeeper.service

import com.tappytoon.ledgerkeeper.entity.Health
import com.tappytoon.ledgerkeeper.repository.HealthRepository
import org.springframework.stereotype.Service

@Service
class HealthService(private val repository: HealthRepository) {

    suspend fun getHealth():Health {
        TODO()
    }
}
