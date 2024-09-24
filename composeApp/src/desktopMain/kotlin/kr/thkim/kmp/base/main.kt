package kr.thkim.kmp.base

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kmp-Base",
    ) {
        App()
    }
}