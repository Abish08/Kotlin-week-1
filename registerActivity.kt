@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.c36a

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.c36a.ui.theme.C36ATheme
import java.util.*

class registerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            C36ATheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    RegisterForm()
                }
            }
        }
    }
}

@Composable
fun RegisterForm() {
    val context = LocalContext.current

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var selectedCountry by remember { mutableStateOf("Select Country") }
    var dob by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var termsAccepted by remember { mutableStateOf(false) }

    val countryOptions = listOf("Select Country", "USA", "Canada", "India", "UK")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Register", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            OutlinedTextField(
                value = firstName,
                onValueChange = { firstName = it },
                label = { Text("Firstname") },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = lastName,
                onValueChange = { lastName = it },
                label = { Text("Lastname") },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        var countryDropdownExpanded by remember { mutableStateOf(false) }

        ExposedDropdownMenuBox (
            expanded = countryDropdownExpanded,
            onExpandedChange = { countryDropdownExpanded = !countryDropdownExpanded }
        ) {
            OutlinedTextField(
                value = selectedCountry,
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(),
                label = { Text("Select Country") },
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = countryDropdownExpanded) }
            )
            DropdownMenu(
                expanded = countryDropdownExpanded,
                onDismissRequest = { countryDropdownExpanded = false }
            ) {
                countryOptions.forEach { country ->
                    DropdownMenuItem(
                        text = { Text(country) },
                        onClick = {
                            selectedCountry = country
                            countryDropdownExpanded = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        OutlinedTextField(
            value = dob,
            onValueChange = {},
            label = { Text("DOB") },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    contentDescription = "Select Date",
                    modifier = Modifier.clickable {
                        DatePickerDialog(context, { _, y, m, d ->
                            dob = "$d/${m + 1}/$y"
                        }, year, month, day).show()
                    }
                )
            },
            readOnly = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Gender")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            RadioButton(
                selected = gender == "Male",
                onClick = { gender = "Male" }
            )
            Text("Male")

            RadioButton(
                selected = gender == "Female",
                onClick = { gender = "Female" }
            )
            Text("Female")

            RadioButton(
                selected = gender == "Others",
                onClick = { gender = "Others" }
            )
            Text("Others")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = termsAccepted, onCheckedChange = { termsAccepted = it })
            Spacer(modifier = Modifier.width(8.dp))
            Text("I accept terms and conditions")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                if (!termsAccepted) {
                    Toast.makeText(context, "Please accept terms", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Registered Successfully", Toast.LENGTH_SHORT).show()
                }
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Register")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Already have an account? Sign in",
            color = Color.Blue,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Go to Sign In screen", Toast.LENGTH_SHORT).show()
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterFormPreview() {
    C36ATheme {
        RegisterForm()
    }
}