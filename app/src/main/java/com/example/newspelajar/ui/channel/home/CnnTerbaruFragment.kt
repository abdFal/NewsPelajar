package com.example.newspelajar.ui.channel.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newspelajar.R
import com.example.newspelajar.adapter.NewsAdapter
import com.example.newspelajar.data.repository.NewsRepository
import com.example.newspelajar.databinding.FragmentAntaraTerbaruBinding
import com.example.newspelajar.databinding.FragmentCnnTerbaruBinding
import com.example.newspelajar.ui.NewsViewModel
import com.example.newspelajar.ui.utils.NewsViewModelFactory


class CnnTerbaruFragment : Fragment()  {
    private lateinit var binding: FragmentCnnTerbaruBinding
    private val cnnNewsTerbaruViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnnTerbaruBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myAdapter = NewsAdapter()
        if (cnnNewsTerbaruViewModel.cnnNewsTerbaru.value == null){
            cnnNewsTerbaruViewModel.getCnnNewsTerbaru()
        }
        cnnNewsTerbaruViewModel.cnnNewsTerbaru.observe(viewLifecycleOwner){data ->
            myAdapter.setData(data.data.posts)
            binding.rvTest.adapter = myAdapter
            binding.rvTest.layoutManager = LinearLayoutManager(requireContext())
        }
    }

}