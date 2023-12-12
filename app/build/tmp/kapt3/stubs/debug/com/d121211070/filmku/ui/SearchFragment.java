package com.d121211070.filmku.ui;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.d121211070.filmku.R;
import com.d121211070.filmku.adapters.MovieItemAdapter;
import com.d121211070.filmku.adapters.OnItemClickListener;
import com.d121211070.filmku.ui.viewModel.SharedViewModel;
import com.d121211070.filmku.databinding.FragmentSearchBinding;
import com.d121211070.filmku.models.MovieItem;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bH\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\u0006\u0010\'\u001a\u00020\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006("}, d2 = {"Lcom/d121211070/filmku/ui/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/d121211070/filmku/adapters/OnItemClickListener;", "()V", "_binding", "Lcom/d121211070/filmku/databinding/FragmentSearchBinding;", "binding", "getBinding", "()Lcom/d121211070/filmku/databinding/FragmentSearchBinding;", "movieList", "", "Lcom/d121211070/filmku/models/MovieItem;", "myAdapter", "Lcom/d121211070/filmku/adapters/MovieItemAdapter;", "searchMovie", "", "viewModel", "Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;", "getViewModel", "()Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;", "setViewModel", "(Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "position", "", "movieItem", "onViewCreated", "view", "uiInit", "viewRecycler", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SearchFragment extends androidx.fragment.app.Fragment implements com.d121211070.filmku.adapters.OnItemClickListener {
    public com.d121211070.filmku.ui.viewModel.SharedViewModel viewModel;
    private com.d121211070.filmku.databinding.FragmentSearchBinding _binding;
    private com.d121211070.filmku.adapters.MovieItemAdapter myAdapter;
    private java.lang.String searchMovie;
    private java.util.List<com.d121211070.filmku.models.MovieItem> movieList;
    
    public SearchFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.d121211070.filmku.ui.viewModel.SharedViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.d121211070.filmku.ui.viewModel.SharedViewModel p0) {
    }
    
    private final com.d121211070.filmku.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void uiInit() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void viewRecycler() {
    }
    
    @java.lang.Override
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.models.MovieItem movieItem) {
    }
}