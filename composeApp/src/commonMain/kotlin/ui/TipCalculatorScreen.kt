package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import theme.TextFieldPink
import theme.AccentPink
import viewmodel.TipCalculatorViewModel

@Composable
fun TipCalculatorScreen(viewModel: TipCalculatorViewModel) {

    val billAmount by viewModel.billAmount
    val tipPercent by viewModel.tipPercent
    val roundUp by viewModel.roundUp
    val tipResult by viewModel.tipResult

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {

        Text(
            text = "Calculate Tip",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = billAmount,
            onValueChange = {
                viewModel.billAmount.value = it
                viewModel.calculateTip()
            },
            label = { Text("Bill Amount") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = TextFieldPink,
                unfocusedContainerColor = TextFieldPink
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = tipPercent,
            onValueChange = {
                viewModel.tipPercent.value = it
                viewModel.calculateTip()
            },
            label = { Text("% Tip Percentage") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = TextFieldPink,
                unfocusedContainerColor = TextFieldPink
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Round up tip?")

            Switch(
                checked = roundUp,
                onCheckedChange = {
                    viewModel.roundUp.value = it
                    viewModel.calculateTip()
                },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = AccentPink,
                    checkedTrackColor = AccentPink.copy(alpha = 0.5f)
                )
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Tip Amount: $$tipResult",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold
        )
    }
}