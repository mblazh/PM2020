package com.example.recyclerview

class Student(name: String, lastName: String) {
    private val name: String = name
        get() = field.capitalize()
    private val lastName: String = lastName
        get() = field.capitalize()

    override fun toString(): String {
        return "$name $lastName"
    }
}