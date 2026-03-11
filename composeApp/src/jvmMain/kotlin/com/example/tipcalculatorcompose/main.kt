package com.example.tipcalculatorcompose

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import theme.TipCalculatorTheme
import ui.TipCalculatorScreen
import viewmodel.TipCalculatorViewModel

fun main() = application {

    val viewModel = TipCalculatorViewModel()

    Window(
        onCloseRequest = {
            viewModel.onCleared()
            exitApplication()
        },
        title = "Tip Calculator"
    ) {

        TipCalculatorTheme {
            TipCalculatorScreen(viewModel)
        }

    }
}