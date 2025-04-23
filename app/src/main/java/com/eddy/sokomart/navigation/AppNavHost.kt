package com.eddy.sokomart.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.eddy.sokomart.data.UserDatabase
import com.eddy.sokomart.repository.UserRepository
import com.eddy.sokomart.ui.screens.about.AboutScreen
import com.eddy.sokomart.ui.screens.assign.AssignScreen
import com.eddy.sokomart.ui.screens.auth.LoginScreen
import com.eddy.sokomart.ui.screens.auth.RegisterScreen
import com.eddy.sokomart.ui.screens.dashboard.DashboardScreen
import com.eddy.sokomart.ui.screens.form.FormScreen
import com.eddy.sokomart.ui.screens.form1.Form1Screen
import com.eddy.sokomart.ui.screens.home.HomeScreen
import com.eddy.sokomart.ui.screens.intent.IntentScreen
import com.eddy.sokomart.ui.screens.item.ItemScreen
import com.eddy.sokomart.ui.screens.more.MoreScreen
import com.eddy.sokomart.ui.screens.products.AddProductScreen
import com.eddy.sokomart.ui.screens.products.EditProductScreen
import com.eddy.sokomart.ui.screens.products.ProductListScreen
import com.eddy.sokomart.ui.screens.service.ServiceScreen
import com.eddy.sokomart.ui.screens.splash.SplashScreen
import com.eddy.sokomart.ui.screens.start.StartScreen
import com.eddy.sokomart.viewmodel.AuthViewModel
import com.eddy.sokomart.viewmodel.ProductViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ADD_PRODUCT,
    productViewModel: ProductViewModel = viewModel(),
) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_ASSIGN) {
            AssignScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        composable(ROUT_FORM1) {
            Form1Screen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }

















    }
}