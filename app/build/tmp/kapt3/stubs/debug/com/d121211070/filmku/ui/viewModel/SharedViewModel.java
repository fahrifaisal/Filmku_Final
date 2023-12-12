package com.d121211070.filmku.ui.viewModel;

import android.app.Application;
import androidx.lifecycle.*;
import com.d121211070.filmku.data.ProductRepository;
import com.d121211070.filmku.models.*;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006J\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00062\u0006\u00107\u001a\u00020\u001cJ\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00062\u0006\u00107\u001a\u00020\u001cH\u0016J$\u0010:\u001a\b\u0012\u0004\u0012\u0002060\u00062\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u001cJ\u0014\u0010=\u001a\b\u0012\u0004\u0012\u0002060\u00062\u0006\u00107\u001a\u00020\u001cR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000f\"\u0004\b(\u0010\u0011R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000fR&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011\u00a8\u0006>"}, d2 = {"Lcom/d121211070/filmku/ui/viewModel/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/d121211070/filmku/data/ProductRepository;", "(Lcom/d121211070/filmku/data/ProductRepository;)V", "genre", "Landroidx/lifecycle/LiveData;", "", "Lcom/d121211070/filmku/models/Genre;", "getGenre", "()Landroidx/lifecycle/LiveData;", "genreMovieList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/d121211070/filmku/models/MovieItem;", "getGenreMovieList", "()Landroidx/lifecycle/MutableLiveData;", "setGenreMovieList", "(Landroidx/lifecycle/MutableLiveData;)V", "popularMovieList", "getPopularMovieList", "setPopularMovieList", "searchMovieList", "getSearchMovieList", "setSearchMovieList", "searchMovieName", "", "getSearchMovieName", "selectedGenreId", "", "getSelectedGenreId", "selectedListId", "getSelectedListId", "selectedPage", "getSelectedPage", "selectedPageSearch", "getSelectedPageSearch", "selectedProduct", "getSelectedProduct", "topRatedMovieList", "getTopRatedMovieList", "setTopRatedMovieList", "trendingMovieList", "getTrendingMovieList", "setTrendingMovieList", "trendingValues", "getTrendingValues", "upcomingMovieList", "getUpcomingMovieList", "setUpcomingMovieList", "filterListByList", "", "list", "filterList", "popularResult", "Lcom/d121211070/filmku/models/MovieList;", "page", "searchResult", "topRatedResult", "trendingResult", "media_type", "time_window", "upcomingResult", "app_debug"})
public class SharedViewModel extends androidx.lifecycle.ViewModel {
    private final com.d121211070.filmku.data.ProductRepository productRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.d121211070.filmku.models.MovieItem> selectedProduct = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> selectedListId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> trendingValues = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.d121211070.filmku.models.Genre>> genre = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> selectedPage = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Integer>> selectedGenreId = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> genreMovieList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> trendingMovieList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> topRatedMovieList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> upcomingMovieList;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> popularMovieList;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> selectedPageSearch = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> searchMovieList;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchMovieName = null;
    
    @javax.inject.Inject
    public SharedViewModel(@org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.d121211070.filmku.models.MovieItem> getSelectedProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedListId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getTrendingValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.d121211070.filmku.models.Genre>> getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Integer>> getSelectedGenreId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getGenreMovieList() {
        return null;
    }
    
    public final void setGenreMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getTrendingMovieList() {
        return null;
    }
    
    public final void setTrendingMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getTopRatedMovieList() {
        return null;
    }
    
    public final void setTopRatedMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getUpcomingMovieList() {
        return null;
    }
    
    public final void setUpcomingMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getPopularMovieList() {
        return null;
    }
    
    public final void setPopularMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedPageSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> getSearchMovieList() {
        return null;
    }
    
    public final void setSearchMovieList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.d121211070.filmku.models.MovieItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchMovieName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.d121211070.filmku.models.MovieList> trendingResult(@org.jetbrains.annotations.NotNull
    java.lang.String media_type, @org.jetbrains.annotations.NotNull
    java.lang.String time_window, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> searchResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getGenreMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.LiveData<com.d121211070.filmku.models.MovieList> topRatedResult(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.d121211070.filmku.models.MovieList> upcomingResult(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.d121211070.filmku.models.MovieList> popularResult(int page) {
        return null;
    }
    
    private final boolean filterListByList(java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> filterList) {
        return false;
    }
}