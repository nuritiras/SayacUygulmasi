package tr.com.nuritiras.sayacuygulmasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tr.com.nuritiras.sayacuygulmasi.ui.theme.SayacUygulmasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SayacUygulmasiTheme {
                    Sayfa()
            }
        }
    }
}

@Composable
fun Sayfa() {
    val sayac= remember { mutableStateOf(0) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sayaç:${sayac.value}")
        
        Button(onClick = {
            sayac.value++
        }) {
            Text(text="Artır")
        }

        Button(onClick = {
            sayac.value--
        }) {
            Text(text="Eksilt")
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SayacUygulmasiTheme {
        Sayfa()
    }
}