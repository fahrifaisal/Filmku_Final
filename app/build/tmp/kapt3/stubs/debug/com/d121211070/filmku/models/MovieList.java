package com.d121211070.filmku.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JH\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/d121211070/filmku/models/MovieList;", "", "Id", "", "page", "results", "", "Lcom/d121211070/filmku/models/MovieItem;", "total_pages", "total_results", "(Ljava/lang/Integer;ILjava/util/List;II)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPage", "()I", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getTotal_pages", "getTotal_results", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;ILjava/util/List;II)Lcom/d121211070/filmku/models/MovieList;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieList {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer Id = null;
    private final int page = 0;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.d121211070.filmku.models.MovieItem> results;
    private final int total_pages = 0;
    private final int total_results = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.d121211070.filmku.models.MovieList copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer Id, int page, @org.jetbrains.annotations.NotNull
    java.util.List<com.d121211070.filmku.models.MovieItem> results, int total_pages, int total_results) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieList(@org.jetbrains.annotations.Nullable
    java.lang.Integer Id, int page, @org.jetbrains.annotations.NotNull
    java.util.List<com.d121211070.filmku.models.MovieItem> results, int total_pages, int total_results) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.d121211070.filmku.models.MovieItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.d121211070.filmku.models.MovieItem> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull
    java.util.List<com.d121211070.filmku.models.MovieItem> p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTotal_results() {
        return 0;
    }
}