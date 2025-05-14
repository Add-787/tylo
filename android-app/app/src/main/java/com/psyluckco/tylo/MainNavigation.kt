/**
 * Created by developer on 13-05-2025.
 * Tismo Technology Solutions (P) Ltd.
 * developers@tismotech.net
 */

package com.psyluckco.tylo


import android.net.http.SslCertificate.saveState
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object TyloDestinations {
    const val HOME_ROUTE = "home"
    const val RECORD_ROUTE = "record"
}

/**
 * Models the navigation actions in the app
 */
class TyloNavigationActions(private val navController: NavHostController) {

    val navigateToHome: () -> Unit = {
        navController.navigate(TyloDestinations.HOME_ROUTE) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items

            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }

    }

    val navigateToRecord: () -> Unit = {
        navController.navigate(TyloDestinations.RECORD_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }



}