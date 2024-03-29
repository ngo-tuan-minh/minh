package com.example.applock

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.applock.adapters.FragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private var tabTitle = arrayOf("Applications","Profiles")
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var imgMenu:ImageView
    private lateinit var imageseach:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager2)
        drawerLayout = findViewById(R.id.drawer_layout)
        imageseach= findViewById(R.id.image_search)
        imgMenu = findViewById(R.id.image_menu)
        viewPager.adapter = FragmentAdapter(this)
        TabLayoutMediator(tabLayout,viewPager){tab,index ->
            tab.text = tabTitle[index]
        }.attach()
        imgMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        imageseach.setOnClickListener {
            startActivity(Intent(this,SearchMain2Activity::class.java))

        }

    }



}