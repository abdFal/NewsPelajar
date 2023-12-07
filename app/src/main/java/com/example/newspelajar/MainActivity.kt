package com.example.newspelajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.newspelajar.adapter.NewsAdapter
import com.example.newspelajar.adapter.PagerAdapter
import com.example.newspelajar.data.repository.NewsRepository
import com.example.newspelajar.databinding.ActivityMainBinding
import com.example.newspelajar.ui.NewsViewModel
import com.example.newspelajar.ui.utils.NewsViewModelFactory
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private lateinit var btnOpenDrawer: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tabLayout: TabLayout = binding.tabLayout
        val viewPager: ViewPager2 = binding.viewPager


        val pagerAdapter = PagerAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Antara"
                1 -> tab.text = "CNN"
                2 -> tab.text = "Tribun"
            }
        }.attach()
        drawerLayout = findViewById(R.id.drawer_layout)
        btnOpenDrawer = findViewById(R.id.btnOpenDrawer)

        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        // Set up click listener for the ImageButton
        btnOpenDrawer.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                if (drawerLayout.isDrawerOpen(binding.navigationView)) {
                    drawerLayout.closeDrawer(binding.navigationView)
                } else {
                    drawerLayout.openDrawer(binding.navigationView)
                }
            }
        })

    }
    }
