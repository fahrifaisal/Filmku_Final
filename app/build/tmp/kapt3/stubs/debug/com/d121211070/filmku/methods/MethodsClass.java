package com.d121211070.filmku.methods;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;
import com.d121211070.filmku.R;
import com.d121211070.filmku.models.Genre;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/d121211070/filmku/methods/MethodsClass;", "", "()V", "Companion", "app_debug"})
public final class MethodsClass {
    @org.jetbrains.annotations.NotNull
    public static final com.d121211070.filmku.methods.MethodsClass.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.d121211070.filmku.models.Genre> genresList;
    
    public MethodsClass() {
        super();
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void getImageByPicasso(@org.jetbrains.annotations.NotNull
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable
    java.lang.String image_url) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"dropBackUrl"})
    public static final void getImageByGlide(@org.jetbrains.annotations.NotNull
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable
    java.lang.String image_url) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"itsForAdult"})
    public static final void itsForAdult(@org.jetbrains.annotations.NotNull
    android.widget.ImageView view, boolean itsForAdult) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"rate"})
    public static final void rateToInt(@org.jetbrains.annotations.NotNull
    com.google.android.material.chip.Chip view, double rate) {
    }
    
    @kotlin.jvm.JvmStatic
    @androidx.databinding.BindingAdapter(value = {"addGenreChip"})
    public static final void addChip(@org.jetbrains.annotations.NotNull
    com.google.android.material.chip.ChipGroup view, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> genreIdList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004H\u0007J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0013H\u0007J\u0018\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0007R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/d121211070/filmku/methods/MethodsClass$Companion;", "", "()V", "genresList", "", "Lcom/d121211070/filmku/models/Genre;", "getGenresList", "()Ljava/util/List;", "setGenresList", "(Ljava/util/List;)V", "addChip", "", "view", "Lcom/google/android/material/chip/ChipGroup;", "genreIdList", "", "addGenreList", "list", "checkForInternet", "", "context", "Landroid/content/Context;", "createChip", "Lcom/google/android/material/chip/Chip;", "genre", "getImageByGlide", "Landroid/widget/ImageView;", "image_url", "getImageByPicasso", "itsForAdult", "rateToInt", "rate", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.d121211070.filmku.models.Genre> getGenresList() {
            return null;
        }
        
        public final void setGenresList(@org.jetbrains.annotations.NotNull
        java.util.List<com.d121211070.filmku.models.Genre> p0) {
        }
        
        public final boolean checkForInternet(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void addGenreList(@org.jetbrains.annotations.NotNull
        java.util.List<com.d121211070.filmku.models.Genre> list) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.google.android.material.chip.Chip createChip(@org.jetbrains.annotations.NotNull
        com.d121211070.filmku.models.Genre genre, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @androidx.databinding.BindingAdapter(value = {"imageUrl"})
        public final void getImageByPicasso(@org.jetbrains.annotations.NotNull
        android.widget.ImageView view, @org.jetbrains.annotations.Nullable
        java.lang.String image_url) {
        }
        
        @kotlin.jvm.JvmStatic
        @androidx.databinding.BindingAdapter(value = {"dropBackUrl"})
        public final void getImageByGlide(@org.jetbrains.annotations.NotNull
        android.widget.ImageView view, @org.jetbrains.annotations.Nullable
        java.lang.String image_url) {
        }
        
        @kotlin.jvm.JvmStatic
        @androidx.databinding.BindingAdapter(value = {"itsForAdult"})
        public final void itsForAdult(@org.jetbrains.annotations.NotNull
        android.widget.ImageView view, boolean itsForAdult) {
        }
        
        @kotlin.jvm.JvmStatic
        @androidx.databinding.BindingAdapter(value = {"rate"})
        public final void rateToInt(@org.jetbrains.annotations.NotNull
        com.google.android.material.chip.Chip view, double rate) {
        }
        
        @kotlin.jvm.JvmStatic
        @androidx.databinding.BindingAdapter(value = {"addGenreChip"})
        public final void addChip(@org.jetbrains.annotations.NotNull
        com.google.android.material.chip.ChipGroup view, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> genreIdList) {
        }
    }
}