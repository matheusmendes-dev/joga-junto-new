package com.mendev.jogajunto

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform