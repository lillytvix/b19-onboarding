package com.banana.b19.onboarding

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_activity.*

class Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity)
        viewPager.adapter = Adapter()

    }

    inner class Adapter :
        FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getCount(): Int {
            return 3
        }

        override fun getItem(position: Int): AFragment {
            return when (position) {
                0 -> newFragment(0xFF201E1F.toInt(), R.drawable.image, "GALERY", textcolor = 0xFFFFFFFF.toInt())
                1 -> newFragment(0xFF616972.toInt(), R.drawable.ic_launcher_foreground, "FEAW", textcolor = 0xFFFFFFFF.toInt())
                2 -> newFragment(0xFF7F76D2.toInt(), R.drawable.white_radius, "wsf", 0xFFFFFFFF.toInt())

                else -> AFragment()

            }
        }

    }











}
