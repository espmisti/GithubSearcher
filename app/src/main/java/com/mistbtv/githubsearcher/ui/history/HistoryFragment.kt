package com.mistbtv.githubsearcher.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mistbtv.githubsearcher.databinding.FragmentHistoryBinding
import com.mistbtv.githubsearcher.utils.base.BaseFragment

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {

    override fun setBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHistoryBinding = FragmentHistoryBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {}
}