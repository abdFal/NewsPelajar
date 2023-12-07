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
import com.example.newspelajar.databinding.FragmentCnnInternasionalBinding
import com.example.newspelajar.databinding.FragmentCnnNasionalBinding
import com.example.newspelajar.ui.NewsViewModel
import com.example.newspelajar.ui.utils.NewsViewModelFactory


class CnnInternasionalFragment : Fragment(){
    private lateinit var binding: FragmentCnnInternasionalBinding
    private val cnnNewsInterNasionalViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCnnInternasionalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myAdapter = NewsAdapter()
        if (cnnNewsInterNasionalViewModel.cnnNewsInternasional.value == null){
            cnnNewsInterNasionalViewModel.getCnnNewsInternasional()
        }
        cnnNewsInterNasionalViewModel.cnnNewsInternasional.observe(viewLifecycleOwner){data ->
            myAdapter.setData(data.data.posts)
            binding.rvTest.adapter = myAdapter
            binding.rvTest.layoutManager = LinearLayoutManager(requireContext())
        }
    }

}