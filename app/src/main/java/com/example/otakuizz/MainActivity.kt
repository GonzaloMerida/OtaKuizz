package com.example.otakuizz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.otakuizz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //declara las variables del bindeo
    //se inicia en null, hasta que se infle (inflate)
    private var _binding: ActivityMainBinding? = null

    //puede ser public porque solo es una variable asignada a un getter
    private val binding
        get() = _binding!!

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //en el main activity se le pasa el inflate con un parámetro y no el de 3
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        binding.tvHello.text = getString(R.string.hello_payer)
        setContentView(view)

        drawerLayout = binding.drawerLayout


//incluye un controlador de navegacion. fragmentcontainerView2 es el host de navegación.
        val navFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        val navController = navFragment.navController
//establece la barra con controles
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)


//eventos de escucha del menú de navegación...
        binding.drawerNav.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.rules_menu -> {
                    navController.navigate(R.id.action_titleFragment_to_rulesFragment)
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }

                R.id.about_menu -> {
                    navController.navigate(R.id.action_titleFragment_to_aboutFragment)
                    drawerLayout.closeDrawer(GravityCompat.START)
                    true
                }

                else -> false
            }
        }

    }

    //popupTo en el nav_graph
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainerView2)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}