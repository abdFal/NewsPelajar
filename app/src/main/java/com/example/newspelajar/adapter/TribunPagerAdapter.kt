package com.example.newspelajar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newspelajar.ui.channel.home.TribunLifestyleFragment
import com.example.newspelajar.ui.channel.home.TribunSelebFragment
import com.example.newspelajar.ui.channel.home.TribunTerbaruFragment

class TribunPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TribunTerbaruFragment()
            1 -> TribunSelebFragment()
            2 -> TribunLifestyleFragment()
            else -> TribunTerbaruFragment() // Fragment default
        }
    }

    override fun getItemCount(): Int = 3

}