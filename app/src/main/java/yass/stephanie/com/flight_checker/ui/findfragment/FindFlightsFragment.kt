package yass.stephanie.com.flight_checker.ui.findfragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import yass.stephanie.com.flight_checker.R

class FindFlightsFragment : Fragment() {

    companion object {
        fun newInstance() = FindFlightsFragment()
    }

    private lateinit var viewModel: FindFlightsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_find_flights, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FindFlightsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}