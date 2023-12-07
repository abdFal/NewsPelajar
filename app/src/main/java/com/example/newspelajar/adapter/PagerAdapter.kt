package com.example.newspelajar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newspelajar.ui.channel.AntaraFragment
import com.example.newspelajar.ui.channel.CnnFragment
import com.example.newspelajar.ui.channel.TribunFragment

class PagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AntaraFragment()
            1 -> CnnFragment()
            2 -> TribunFragment()
            else -> AntaraFragment() // Fragment default
        }
    }

    override fun getItemCount(): Int = 3
}