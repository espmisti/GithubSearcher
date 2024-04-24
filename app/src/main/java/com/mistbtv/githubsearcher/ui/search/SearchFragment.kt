package com.mistbtv.githubsearcher.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mistbtv.githubsearcher.databinding.FragmentSearchBinding
import com.mistbtv.githubsearcher.utils.base.BaseFragment

class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchBinding = FragmentSearchBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {}
}