package com.d121211070.filmku.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.d121211070.filmku.R;
import com.d121211070.filmku.adapters.MovieItemAdapter;
import com.d121211070.filmku.adapters.OnItemClickListener;
import com.d121211070.filmku.ui.viewModel.SharedViewModel;
import com.d121211070.filmku.databinding.FragmentSeeMoreBinding;
import com.d121211070.filmku.models.MovieList;
import com.d121211070.filmku.models.MovieItem;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/d121211070/filmku/ui/SeeMoreFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/d121211070/filmku/adapters/OnItemClickListener;", "()V", "_binding", "Lcom/d121211070/filmku/databinding/FragmentSeeMoreBinding;", "binding", "getBinding", "()Lcom/d121211070/filmku/databinding/FragmentSeeMoreBinding;", "myAdapter", "Lcom/d121211070/filmku/adapters/MovieItemAdapter;", "page", "", "topRatedResponse", "Lcom/d121211070/filmku/models/MovieList;", "getTopRatedResponse", "()Lcom/d121211070/filmku/models/MovieList;", "setTopRatedResponse", "(Lcom/d121211070/filmku/models/MovieList;)V", "viewModel", "Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;", "getData", "", "selectedListId", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "movieItem", "Lcom/d121211070/filmku/models/MovieItem;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SeeMoreFragment extends androidx.fragment.app.Fragment implements com.d121211070.filmku.adapters.OnItemClickListener {
    private com.d121211070.filmku.databinding.FragmentSeeMoreBinding _binding;
    private com.d121211070.filmku.ui.viewModel.SharedViewModel viewModel;
    private com.d121211070.filmku.adapters.MovieItemAdapter myAdapter;
    private int page = 1;
    public com.d121211070.filmku.models.MovieList topRatedResponse;
    
    public SeeMoreFragment() {
        super();
    }
    
    private final com.d121211070.filmku.databinding.FragmentSeeMoreBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.d121211070.filmku.models.MovieList getTopRatedResponse() {
        return null;
    }
    
    public final void setTopRatedResponse(@org.jetbrains.annotations.NotNull
    com.d121211070.filmku.models.MovieList p0) {
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
    
    private final void getData(int page, int selectedListId) {
    }
}