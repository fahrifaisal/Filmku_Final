package com.d121211070.filmku.adapters

import com.d121211070.filmku.models.MovieItem

interface OnItemClickListener {
    fun onItemClick(position: Int, movieItem: MovieItem)
}