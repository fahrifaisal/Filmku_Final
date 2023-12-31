package com.d121211070.filmku.di;

import com.d121211070.filmku.data.apiInterfaces.*;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Named;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/d121211070/filmku/di/AppModule;", "", "()V", "genresApi", "Lcom/d121211070/filmku/data/apiInterfaces/GenresInterface;", "popularApi", "Lcom/d121211070/filmku/data/apiInterfaces/PopularInterface;", "retrofitProvider", "Lretrofit2/Retrofit;", "searchApi", "Lcom/d121211070/filmku/data/apiInterfaces/SearchInterface;", "topRatedApi", "Lcom/d121211070/filmku/data/apiInterfaces/TopRatedInterface;", "trendingApi", "Lcom/d121211070/filmku/data/apiInterfaces/TrendingInterface;", "upcomingApi", "Lcom/d121211070/filmku/data/apiInterfaces/UpcomingInterface;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.d121211070.filmku.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit retrofitProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.TrendingInterface trendingApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.GenresInterface genresApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.SearchInterface searchApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.TopRatedInterface topRatedApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.UpcomingInterface upcomingApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.d121211070.filmku.data.apiInterfaces.PopularInterface popularApi() {
        return null;
    }
}