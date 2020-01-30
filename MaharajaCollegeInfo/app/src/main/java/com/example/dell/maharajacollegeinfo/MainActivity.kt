package com.example.dell.maharajacollegeinfo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.example.dell.maharajacollegeinfo.MainActivity.statified.drawerLayout
import com.example.dell.maharajacollegeinfo.adapters.NavigationDrawerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(){
    var navigationDrawerIconList: ArrayList<String> = arrayListOf()
    object statified{
        var drawerLayout : DrawerLayout?=null
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val toolbar= findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
drawerLayout= findViewById(R.id.drawer_layout)
        navigationDrawerIconList.add("Notes")
        navigationDrawerIconList.add("Notifications")
        navigationDrawerIconList.add("PreviousYearsQuestionPapers")
        navigationDrawerIconList.add("Contacts")
        val toggle= ActionBarDrawerToggle(this@MainActivity,drawerLayout,toolbar,
            R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawerLayout?.setDrawerListener(toggle)
        toggle.syncState()
        val mainScreenFragment =MainScreenFragment()
        this.supportFragmentManager.beginTransaction()
            .add(R.id.details_fragment,mainScreenFragment,"MainScreenFragment")
            .commit()
        var navigation_recycler_view= findViewById<RecyclerView>(R.id.navigation_recycler_view)
navigation_recycler_view.layoutManager= LinearLayoutManager(this)
        navigation_recycler_view.itemAnimator=DefaultItemAnimator()
        navigation_recycler_view.setHasFixedSize(true)
    }
override fun onStart() {
    super.onStart()
}
}

