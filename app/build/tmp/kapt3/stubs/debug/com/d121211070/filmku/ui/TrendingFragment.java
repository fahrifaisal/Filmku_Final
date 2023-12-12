package com.d121211070.filmku.ui;

import android.os.Bundle;
import android.view.*;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.d121211070.filmku.R;
import com.d121211070.filmku.adapters.MovieItemAdapter;
import com.d121211070.filmku.adapters.OnItemClickListener;
import com.d121211070.filmku.adapters.TrendingMoviesAdapter;
import com.d121211070.filmku.ui.viewModel.SharedViewModel;
import com.d121211070.filmku.databinding.FragmentTrendingBinding;
import com.d121211070.filmku.methods.MethodsClass;
import com.d121211070.filmku.models.MovieItem;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/d121211070/filmku/ui/TrendingFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/d121211070/filmku/adapters/OnItemClickListener;", "()V", "_binding", "Lcom/d121211070/filmku/databinding/FragmentTrendingBinding;", "binding", "getBinding", "()Lcom/d121211070/filmku/databinding/FragmentTrendingBinding;", "isOnCreate", "", "Ljava/lang/Boolean;", "latestAdapter", "Lcom/d121211070/filmku/adapters/MovieItemAdapter;", "mediaType", "", "myAdapter", "popularAdapter", "timeWindow", "trendingAdapter", "Lcom/d121211070/filmku/adapters/TrendingMoviesAdapter;", "viewModel", "Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;", "menuBottoms", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateUi", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "position", "", "movieItem", "Lcom/d121211070/filmku/models/MovieItem;", "onViewCreated", "view", "seeMoreBottoms", "uiInit", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class TrendingFragment extends androidx.fragment.app.Fragment implements com.d121211070.filmku.adapters.OnItemClickListener {
    private com.d121211070.filmku.ui.viewModel.SharedViewModel viewModel;
    private com.d121211070.filmku.databinding.FragmentTrendingBinding _binding;
    private com.d121211070.filmku.adapters.TrendingMoviesAdapter trendingAdapter;
    private com.d121211070.filmku.adapters.MovieItemAdapter myAdapter;
    private com.d121211070.filmku.adapters.MovieItemAdapter latestAdapter;
    private com.d121211070.filmku.adapters.MovieItemAdapter popularAdapter;
    private java.lang.String mediaType;
    private java.lang.String timeWindow;
    private java.lang.Boolean isOnCreate;
    
    public TrendingFragment() {
        super();
    }
    
    private final com.d121211070.filmku.databinding.FragmentTrendingBinding getBinding() {
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
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onItemClick(int position, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.models.MovieItem movieItem) {
    }
    
    private final void onCreateUi() {
    }
    
    private final void uiInit() {
    }
    
    private final void seeMoreBottoms() {
    }
    
    private final void menuBottoms() {
    }
}