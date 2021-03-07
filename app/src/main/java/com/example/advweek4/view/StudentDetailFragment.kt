package com.example.advweek4.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.advweek4.R
import com.example.advweek4.model.Student
import com.example.advweek4.viewmodel.DetailViewModel
import com.example.advweek4.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_student_detail.*
import kotlinx.android.synthetic.main.fragment_student_list.*

class StudentDetailFragment : Fragment() {
    private lateinit var viewModel: DetailViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel=ViewModelProvider(this).get(DetailViewModel::class.java)
        viewModel.fetch()


        observeViewModel()
    }

    fun observeViewModel(){
        viewModel.studentLD.observe(viewLifecycleOwner, Observer {
            txtID.setText(viewModel.studentLD.value!!.id)
            txtName.setText(viewModel.studentLD.value!!.name)
            txtBod.setText(viewModel.studentLD.value!!.bod)
            txtPhone.setText(viewModel.studentLD.value!!.phone)
            
        })

    }
}