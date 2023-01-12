package com.mihir.viewpager2test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mihir.viewpager2test.databinding.FragmentFrag1Binding

class Frag1 : Fragment() {

    private val binding : FragmentFrag1Binding by lazy { FragmentFrag1Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    companion object {
        fun newInstance() = Frag1()
    }
}