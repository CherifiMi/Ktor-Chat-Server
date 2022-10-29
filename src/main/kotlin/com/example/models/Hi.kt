package com.example.models

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Hi(
    @BsonId
    val id: String= ObjectId().toString(),
    val string: String
)