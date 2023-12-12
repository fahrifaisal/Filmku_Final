package com.d121211070.filmku.adapters;

import com.d121211070.filmku.models.MovieItem;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/d121211070/filmku/adapters/OnItemClickListener;", "", "onItemClick", "", "position", "", "movieItem", "Lcom/d121211070/filmku/models/MovieItem;", "app_debug"})
public abstract interface OnItemClickListener {
    
    public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.models.MovieItem movieItem);
}