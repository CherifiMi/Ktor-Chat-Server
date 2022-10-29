package com.example.room

class MemberAlreadyExistsException: Exception(
    "there is a member with this name in the room"
)