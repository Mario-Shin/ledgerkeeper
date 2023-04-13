package com.tappytoon.ledgerkeeper.repository

import com.tappytoon.ledgerkeeper.entity.Health
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Repository
import reactor.kotlin.core.publisher.toMono
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest

@Repository
class HealthRepository(
    private val dynamoDbAsyncClient: DynamoDbAsyncClient
) {

    suspend fun getHello(): Health {
//        TODO()
        val request = GetItemRequest.builder().build()
        val result = dynamoDbAsyncClient.getItem(
            request
        ).toMono()
            .awaitSingle()
        TODO()
    }

}
