package com.kotlinbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

//인터페이스  BottomNavigationView.OnNavigationItemSelectedListener
class MainActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var rankingFragment: RankingFragment
    private lateinit var profileFragment: ProfileFragment

    companion object {
        const val TAG: String = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ")
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_frame, HomeFragment.newInstance()).commit()

        bottom_nav.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListener)
//        bottom_nav.setOnNavigationItemSelectedListener(this)

    }

    //바텀네비 아이템 클릭 리스너 설정
    private val onBottomNavItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener {

            lateinit var currentFragment: Fragment

            when (it.itemId) {
                R.id.menu_home -> {
                    Log.d(TAG, "onNavigationItemSelected: home")
                    currentFragment = HomeFragment.newInstance()
                }
                R.id.menu_ranking -> {
                    Log.d(TAG, "onNavigationItemSelected: ranking")
                    currentFragment = RankingFragment.newInstance()
                }
                R.id.menu_profile -> {
                    Log.d(TAG, "onNavigationItemSelected: profile")
                    currentFragment = ProfileFragment.newInstance()
                }

            }

            if (currentFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_frame, currentFragment).commit()
            }

            true
        }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//
//
//        when(item.itemId){
//            R.id.menu_home -> {
//                Log.d(TAG, "onNavigationItemSelected: home")
//            }
//            R.id.menu_ranking ->{
//                Log.d(TAG, "onNavigationItemSelected: ranking")
//            }
//            R.id.menu_profile ->{
//                Log.d(TAG, "onNavigationItemSelected: profile")
//            }
//
//        }
//
//        return true
//    }


}