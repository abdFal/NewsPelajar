
package com.example.newspelajar.ui.channel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.newspelajar.R
import com.example.newspelajar.adapter.NewsAdapter
import com.example.newspelajar.adapter.NewsPagerAdepter
import com.example.newspelajar.adapter.PagerAdapter
import com.example.newspelajar.data.repository.NewsRepository
import com.example.newspelajar.databinding.ActivityMainBinding
import com.example.newspelajar.databinding.FragmentAntaraBinding
import com.example.newspelajar.ui.NewsViewModel
import com.example.newspelajar.ui.utils.NewsViewModelFactory
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class AntaraFragment : Fragment() {
    private lateinit var binding: FragmentAntaraBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAntaraBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabLayout: TabLayout = binding.tabLayout
        val viewPager: ViewPager2 = binding.viewPager

        val pagerAdapter = NewsPagerAdepter(requireActivity())
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Terbaru"
                1 -> tab.text = "Politik"
                2 -> tab.text = "Hukum"
            }
        }.attach()

    }
}