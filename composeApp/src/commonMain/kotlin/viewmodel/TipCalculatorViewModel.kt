package viewmodel

import androidx.compose.runtime.mutableStateOf
import kotlin.math.ceil

class TipCalculatorViewModel {

    var billAmount = mutableStateOf("")
    var tipPercent = mutableStateOf("")
    var roundUp = mutableStateOf(false)
    var tipResult = mutableStateOf("0.00")

    fun calculateTip() {

        val bill = billAmount.value.toDoubleOrNull() ?: 0.0
        val percent = tipPercent.value.toDoubleOrNull() ?: 0.0

        var tip = bill * percent / 100

        if (roundUp.value) {
            tip = ceil(tip)
        }

        tipResult.value = "%.2f".format(tip)
    }
    fun onCleared() {
        println("ViewModel destruido")
    }
}

