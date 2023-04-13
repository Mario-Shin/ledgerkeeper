package com.tappytoon.ledgerkeeper.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

@Configuration
class DynamoDbConfiguration {

    //todo
    @Bean
    fun dynamoDbAsyncClient(): DynamoDbAsyncClient {
//        val dbClient = DynamoDbClient.builder()
//            .endpointOverride(URI.create("todo"))
//            .build()

        return DynamoDbAsyncClient.create()
    }

}
