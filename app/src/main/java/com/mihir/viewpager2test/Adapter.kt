package com.mihir.viewpager2test

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class Adapter(activity: MainActivity):FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment = when (position) {
        0 -> Frag1.newInstance()
        1 -> Frag2.newInstance()
        else -> throw IllegalStateException("Invalid adapter position")
    }
}