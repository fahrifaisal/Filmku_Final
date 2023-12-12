package com.d121211070.filmku.data;

import android.app.Application;
import android.widget.Toast;
import com.d121211070.filmku.data.apiInterfaces.*;
import com.d121211070.filmku.models.Genre;
import com.d121211070.filmku.models.MovieList;
import kotlinx.coroutines.*;
import retrofit2.Retrofit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/d121211070/filmku/data/ProductRepository;", "", "context", "Landroid/app/Application;", "trendingApi", "Lcom/d121211070/filmku/data/apiInterfaces/TrendingInterface;", "genreApi", "Lcom/d121211070/filmku/data/apiInterfaces/GenresInterface;", "searchApi", "Lcom/d121211070/filmku/data/apiInterfaces/SearchInterface;", "topRatedApi", "Lcom/d121211070/filmku/data/apiInterfaces/TopRatedInterface;", "upcomingApi", "Lcom/d121211070/filmku/data/apiInterfaces/UpcomingInterface;", "popularApi", "Lcom/d121211070/filmku/data/apiInterfaces/PopularInterface;", "(Landroid/app/Application;Lcom/d121211070/filmku/data/apiInterfaces/TrendingInterface;Lcom/d121211070/filmku/data/apiInterfaces/GenresInterface;Lcom/d121211070/filmku/data/apiInterfaces/SearchInterface;Lcom/d121211070/filmku/data/apiInterfaces/TopRatedInterface;Lcom/d121211070/filmku/data/apiInterfaces/UpcomingInterface;Lcom/d121211070/filmku/data/apiInterfaces/PopularInterface;)V", "getData", "Lcom/d121211070/filmku/models/MovieList;", "media_type", "", "time_window", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenres", "", "Lcom/d121211070/filmku/models/Genre;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchResult", "searchMovie", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRatedResult", "getUpcomingResult", "app_debug"})
public final class ProductRepository {
    private final android.app.Application context = null;
    private final com.d121211070.filmku.data.apiInterfaces.TrendingInterface trendingApi = null;
    private final com.d121211070.filmku.data.apiInterfaces.GenresInterface genreApi = null;
    private final com.d121211070.filmku.data.apiInterfaces.SearchInterface searchApi = null;
    private final com.d121211070.filmku.data.apiInterfaces.TopRatedInterface topRatedApi = null;
    private final com.d121211070.filmku.data.apiInterfaces.UpcomingInterface upcomingApi = null;
    private final com.d121211070.filmku.data.apiInterfaces.PopularInterface popularApi = null;
    
    @javax.inject.Inject
    public ProductRepository(@org.jetbrains.annotations.NotNull
    android.app.Application context, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.TrendingInterface trendingApi, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.GenresInterface genreApi, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.SearchInterface searchApi, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.TopRatedInterface topRatedApi, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.UpcomingInterface upcomingApi, @org.jetbrains.annotations.NotNull
    com.d121211070.filmku.data.apiInterfaces.PopularInterface popularApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getData(@org.jetbrains.annotations.NotNull
    java.lang.String media_type, @org.jetbrains.annotations.NotNull
    java.lang.String time_window, @org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.d121211070.filmku.models.MovieList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGenres(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.d121211070.filmku.models.Genre>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSearchResult(@org.jetbrains.annotations.NotNull
    java.lang.String searchMovie, @org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.d121211070.filmku.models.MovieList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTopRatedResult(@org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.d121211070.filmku.models.MovieList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUpcomingResult(@org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.d121211070.filmku.models.MovieList> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPopularResult(@org.jetbrains.annotations.NotNull
    java.lang.String page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.d121211070.filmku.models.MovieList> continuation) {
        return null;
    }
}