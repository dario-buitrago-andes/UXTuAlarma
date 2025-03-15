package com.uxproject.uxtualarma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
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
import com.uxproject.uxtualarma.ui.theme.UXTuAlarmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.ingresar)
        button.setOnClickListener {
            val intent = Intent(this, AlarmListActivity::class.java)
            startActivity(intent)
        }
    }
}

class AlarmListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm_list)

        val buttonAccount = findViewById<ImageView>(R.id.imageView10)
        buttonAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        val buttonMas = findViewById<ImageView>(R.id.imageView12)
        buttonMas.setOnClickListener {
            val intent = Intent(this, MasActivity::class.java)
            startActivity(intent)
        }

        val buttonAlarms = findViewById<ImageView>(R.id.imageView11)
        buttonAlarms.setOnClickListener {
            val intent = Intent(this, AlarmListActivity::class.java)
            startActivity(intent)
        }

        val itemTrabajo = findViewById<TextView>(R.id.textView)
        itemTrabajo.setOnClickListener {
            val intent = Intent(this, AlarmDetailActivity::class.java)
            startActivity(intent)
        }
    }
}

class AlarmDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarm_detail)

        val buttonAccount = findViewById<ImageView>(R.id.imageView10)
        buttonAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        val buttonMas = findViewById<ImageView>(R.id.imageView12)
        buttonMas.setOnClickListener {
            val intent = Intent(this, MasActivity::class.java)
            startActivity(intent)
        }

        val buttonAlarms = findViewById<ImageView>(R.id.imageView11)
        buttonAlarms.setOnClickListener {
            val intent = Intent(this, AlarmListActivity::class.java)
            startActivity(intent)
        }
    }
}

class MasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mas_screen)

        val buttonAccount = findViewById<ImageView>(R.id.imageView10)
        buttonAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        val buttonMas = findViewById<ImageView>(R.id.imageView12)
        buttonMas.setOnClickListener {
            val intent = Intent(this, MasActivity::class.java)
            startActivity(intent)
        }

        val buttonAlarms = findViewById<ImageView>(R.id.imageView11)
        buttonAlarms.setOnClickListener {
            val intent = Intent(this, AlarmListActivity::class.java)
            startActivity(intent)
        }
    }
}

class AccountActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_screen)

        val buttonAccount = findViewById<ImageView>(R.id.imageView10)
        buttonAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        val buttonMas = findViewById<ImageView>(R.id.imageView12)
        buttonMas.setOnClickListener {
            val intent = Intent(this, MasActivity::class.java)
            startActivity(intent)
        }

        val buttonAlarms = findViewById<ImageView>(R.id.imageView11)
        buttonAlarms.setOnClickListener {
            val intent = Intent(this, AlarmListActivity::class.java)
            startActivity(intent)
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UXTuAlarmaTheme {
        Greeting("Android")
    }
}