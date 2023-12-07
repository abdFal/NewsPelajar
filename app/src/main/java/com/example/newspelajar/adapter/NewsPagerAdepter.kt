package com.example.newspelajar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newspelajar.ui.channel.home.AntaraHukumFragment
import com.example.newspelajar.ui.channel.home.AntaraPolitikFragment
import com.example.newspelajar.ui.channel.home.AntaraTerbaruFragment

class NewsPagerAdepter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AntaraTerbaruFragment()
            1 -> AntaraPolitikFragment()
            2 -> AntaraHukumFragment()
            else -> AntaraTerbaruFragment() // Fragment default
        }
    }

    override fun getItemCount(): Int = 3

}