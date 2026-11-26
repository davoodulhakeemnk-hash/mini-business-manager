
package com.minibusiness.manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                BusinessDashboard()
            }
        }
    }
}

@Composable
fun BusinessDashboard() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Mini Business Manager")
                }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            item {
                Text(
                    "Welcome to your business",
                    style = MaterialTheme.typography.headlineSmall
                )
            }

            item {
                Text("Today's Overview")
            }

            item {
                DashboardCard("Today's Sales", "₹0")
            }

            item {
                DashboardCard("Products", "0")
            }

            item {
                DashboardCard("Customers", "0")
            }

            item {
                DashboardCard("Low Stock Items", "0")
            }

            item {
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("＋ New Sale")
                }
            }

            item {
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Scan QR / Barcode")
                }
            }

            item {
                Text(
                    "Sales  |  Inventory  |  Billing  |  Customers",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun DashboardCard(
    title: String,
    value: String
) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(title)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                value,
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}
