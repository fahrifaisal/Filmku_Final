package com.d121211070.filmku.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.d121211070.filmku.R
import com.d121211070.filmku.adapters.MovieItemAdapter
import com.d121211070.filmku.adapters.OnItemClickListener
import com.d121211070.filmku.models.MovieItem
import com.d121211070.filmku.databinding.FragmentGenresBinding
import com.d121211070.filmku.methods.MethodsClass.Companion.createChip
import com.d121211070.filmku.ui.viewModel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GenresFragment : Fragment(), OnItemClickListener {

    private var viewModel: SharedViewModel? = null
    private var _binding: FragmentGenresBinding? = null
    private val binding get() = _binding!!
    private var myAdapter = MovieItemAdapter(this)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGenresBinding.inflate(inflater, container, false)
        uiInit()
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            binding.textView2.visibility = View.GONE
            binding.progressId.visibility = View.VISIBLE
            viewModel!!.selectedGenreId.value = checkedIds
            viewModel?.genreMovieList?.value = emptyList()
            viewModel?.selectedPage?.value = 0
            viewRecycler()
        }

        binding.recycle.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    if (newState == 0) {
                        binding.progressId.visibility = View.VISIBLE
                        viewRecycler()
                    }
                }
            }
        })
    }

    private fun uiInit() {
        viewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        binding.recycle.adapter = myAdapter

        viewModel?.genre?.observe(viewLifecycleOwner) { genreList ->
            for (genre in genreList) {
                val chip = createChip(genre, requireContext())
                viewModel?.selectedGenreId?.observe(viewLifecycleOwner) { selectedChip ->
                    for (i in selectedChip)
                        if (chip.id == i)
                            chip.isChecked = true
                        else
                            continue
                }
                binding.chipGroup.addView(chip as View)
            }
        }

        viewModel?.genreMovieList?.observe(viewLifecycleOwner) { genreMovieList ->
            if (genreMovieList.isNotEmpty()){
                binding.textView2.visibility=View.GONE
            }
            myAdapter.setData(genreMovieList, false)
        }
    }


    override fun onItemClick(position: Int, movieItem: MovieItem) {
        viewModel?.selectedProduct?.value = movieItem
        findNavController().navigate(R.id.action_genresFragment_to_detailsFragment)
    }

    fun viewRecycler() {
        binding.noDataText.visibility = View.GONE
        binding.textView2.visibility = View.GONE
        viewModel?.getGenreMovieList()?.observe(viewLifecycleOwner) { taskCode ->
            when (taskCode) {
                "There are No Results" ->binding.noDataText.visibility = View.VISIBLE
                "Finish" -> binding.progressId.visibility = View.GONE
                "No More Results" -> Toast.makeText(context, "No More Results", Toast.LENGTH_LONG).show()
                "Choose Genre" -> binding.textView2.visibility = View.VISIBLE
            }
        }
    }
}