package com.example.passmanager.fragments.pass

data class Password(
    val id: Long, // Уникальный номер
    val name: String, // Название сервиса
    val emailCompany: String, // Название компании
    val password: String // Пароль
)

val passwordList = listOf(
    Password(1, "Google", "google.com", "G0oGl3!p@ss2025"),
    Password(2, "Yandex", "yandex.ru", "Y@nd3x_S3cur3"),
    Password(3, "GitHub", "github.com", "GH_P@ssw0rd!42"),
    Password(4, "Facebook", "facebook.com", "Fb_Acc0unt_999"),
    Password(5, "Amazon", "amazon.com", "Am@z0nS@f3Key")
)
