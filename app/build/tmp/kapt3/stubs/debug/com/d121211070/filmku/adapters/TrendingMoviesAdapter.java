package com.d121211070.filmku.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.d121211070.filmku.databinding.TrendingMovieItemBinding;
import com.d121211070.filmku.models.MovieItem;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001c\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/d121211070/filmku/adapters/TrendingMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/d121211070/filmku/adapters/TrendingMoviesAdapter$TrendingViewHolder;", "listener", "Lcom/d121211070/filmku/adapters/OnItemClickListener;", "(Lcom/d121211070/filmku/adapters/OnItemClickListener;)V", "itemList", "", "Lcom/d121211070/filmku/models/MovieItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "addList", "", "TrendingViewHolder", "app_debug"})
public final class TrendingMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.d121211070.filmku.adapters.TrendingMoviesAdapter.TrendingViewHolder> {
    private final com.d121211070.filmku.adapters.OnItemClickListener listener = null;
    private java.util.List<com.d121211070.filmku.models.MovieItem> itemList;
    
    public TrendingMoviesAdapter(@org.jetbrains.annotations.NotNull
    com.d121211070.filmku.adapters.OnItemClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.d121211070.filmku.adapters.TrendingMoviesAdapter.TrendingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.d121211070.filmku.adapters.TrendingMoviesAdapter.TrendingViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.d121211070.filmku.models.MovieItem> itemList, boolean addList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/d121211070/filmku/adapters/TrendingMoviesAdapter$TrendingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/d121211070/filmku/databinding/TrendingMovieItemBinding;", "listener", "Lcom/d121211070/filmku/adapters/OnItemClickListener;", "(Lcom/d121211070/filmku/adapters/TrendingMoviesAdapter;Lcom/d121211070/filmku/databinding/TrendingMovieItemBinding;Lcom/d121211070/filmku/adapters/OnItemClickListener;)V", "getBinding", "()Lcom/d121211070/filmku/databinding/TrendingMovieItemBinding;", "setBinding", "(Lcom/d121211070/filmku/databinding/TrendingMovieItemBinding;)V", "app_debug"})
    public final class TrendingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.d121211070.filmku.databinding.TrendingMovieItemBinding binding;
        
        public TrendingViewHolder(@org.jetbrains.annotations.NotNull
        com.d121211070.filmku.databinding.TrendingMovieItemBinding binding, @org.jetbrains.annotations.NotNull
        com.d121211070.filmku.adapters.OnItemClickListener listener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.d121211070.filmku.databinding.TrendingMovieItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull
        com.d121211070.filmku.databinding.TrendingMovieItemBinding p0) {
        }
    }
}