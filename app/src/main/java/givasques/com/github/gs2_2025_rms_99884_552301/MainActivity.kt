package givasques.com.github.gs2_2025_rms_99884_552301

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import givasques.com.github.gs2_2025_rms_99884_552301.screens.LoginScreen
import givasques.com.github.gs2_2025_rms_99884_552301.ui.theme.Gs2_2025_rms_99884_552301Theme
import androidx.navigation.compose.rememberNavController
import givasques.com.github.gs2_2025_rms_99884_552301.screens.EquipeScreen
import givasques.com.github.gs2_2025_rms_99884_552301.screens.ImcScreen
import givasques.com.github.gs2_2025_rms_99884_552301.screens.MenuScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Gs2_2025_rms_99884_552301Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost (
                        navController = navController,
                        startDestination = "login",
                    ) {
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "imc") {
                            ImcScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                        composable(route = "equipe") {
                            EquipeScreen(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}


