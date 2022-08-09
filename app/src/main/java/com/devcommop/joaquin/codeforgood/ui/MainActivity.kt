package com.devcommop.joaquin.codeforgood.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.devcommop.joaquin.codeforgood.R
import com.devcommop.joaquin.codeforgood.ui.home_screen.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding.bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
        //             override fun onTabSelected(
        //                 lastIndex: Int,
        //                 lastTab: AnimatedBottomBar.Tab?,
        //                 newIndex: Int,
        //                 newTab: AnimatedBottomBar.Tab
        //             ) {
        //                 Toast.makeText(context, "Selected index: $newIndex, title: ${newTab.title}",Toast.LENGTH_SHORT).show()
        //             }
        //
        //             // An optional method that will be fired whenever an already selected tab has been selected again.
        //             override fun onTabReselected(index: Int, tab: AnimatedBottomBar.Tab) {
        //                 Log.d("bottom_bar", "Reselected index: $index, title: ${tab.title}")
        //             }
        //         })


    }



    }
