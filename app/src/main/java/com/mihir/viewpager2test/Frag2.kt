package com.mihir.viewpager2test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mihir.viewpager2test.databinding.FragmentFrag2Binding

class Frag2 : Fragment() {

    private val binding: FragmentFrag2Binding by lazy { FragmentFrag2Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = binding.root

    companion object {
        fun newInstance() = Frag2()
    }
}