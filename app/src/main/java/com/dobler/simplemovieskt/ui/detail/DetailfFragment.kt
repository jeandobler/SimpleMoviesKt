package com.dobler.simplemovieskt.ui.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dobler.simplemovieskt.R

class DetailfFragment : Fragment() {

    companion object {
        fun newInstance() = DetailfFragment()
    }

    private lateinit var viewModel: DetailfViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detailf_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailfViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
