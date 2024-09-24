package kr.thkim.kmp.base

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform