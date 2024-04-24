package com.mistbtv.githubsearcher.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mistbtv.githubsearcher.databinding.FragmentMainBinding
import com.mistbtv.githubsearcher.utils.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {}
}