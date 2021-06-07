package com.example.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomAppBar: BottomAppBar;
    lateinit var bottomNavigationView: BottomNavigationView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView =findViewById(R.id.bottomNavigationView)

        val navHostFragment: NavHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment;
        NavigationUI.setupWithNavController(bottomNavigationView,
            navHostFragment.navController);
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(1).isEnabled = true

        navController.addOnDestinationChangedListener {
                _, destination, _ ->
            when (destination.id) {
                R.id.orderList -> {
                    showBottomNav()

                    hideTitleBar()
                }
                R.id.product_List -> {
                    showBottomNav()
                    hideTitleBar()
                }
                R.id.orderstatus -> {
                    hideTitleBar()
                    showBottomNav()
                }


            }
        }

    }
    private fun hideTitleBar() {
        this.supportActionBar?.hide()
    }



    private fun showBottomNav() {
        bottomNavigationView.visibility = View.VISIBLE
        bottomAppBar.visibility = View.VISIBLE


    }

}

