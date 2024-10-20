package com.example.calculator_prototype3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.calculator_prototype3.ui.theme.Calculator_prototype3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val CalculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]

        enableEdgeToEdge()
        setContent {
            Calculator_prototype3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculator(modifier =Modifier.padding(innerPadding),CalculatorViewModel)

                }
            }
        }
    }
}
