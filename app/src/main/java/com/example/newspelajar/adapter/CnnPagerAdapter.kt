package com.example.newspelajar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newspelajar.ui.channel.home.CnnInternasionalFragment
import com.example.newspelajar.ui.channel.home.CnnNasionalFragment
import com.example.newspelajar.ui.channel.home.CnnTerbaruFragment

class CnnPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CnnTerbaruFragment()
            1 -> CnnNasionalFragment()
            2 -> CnnInternasionalFragment()
            else -> CnnTerbaruFragment() // Fragment default
        }
    }

    override fun getItemCount(): Int = 3

}