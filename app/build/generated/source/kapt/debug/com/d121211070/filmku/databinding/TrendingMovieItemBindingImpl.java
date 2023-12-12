package com.d121211070.filmku.databinding;
import com.d121211070.filmku.R;
import com.d121211070.filmku.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TrendingMovieItemBindingImpl extends TrendingMovieItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TrendingMovieItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private TrendingMovieItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieTitle.setTag(null);
        this.originalImageView.setTag(null);
        this.posterImageView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.trendingItemXml == variableId) {
            setTrendingItemXml((com.d121211070.filmku.models.MovieItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTrendingItemXml(@Nullable com.d121211070.filmku.models.MovieItem TrendingItemXml) {
        this.mTrendingItemXml = TrendingItemXml;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.trendingItemXml);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String trendingItemXmlName = null;
        boolean trendingItemXmlNameJavaLangObjectNull = false;
        com.d121211070.filmku.models.MovieItem trendingItemXml = mTrendingItemXml;
        java.lang.String trendingItemXmlTitle = null;
        java.lang.String trendingItemXmlNameJavaLangObjectNullTrendingItemXmlTitleTrendingItemXmlName = null;
        java.lang.String trendingItemXmlPosterPath = null;
        java.lang.String trendingItemXmlBackdropPath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (trendingItemXml != null) {
                    // read trendingItemXml.name
                    trendingItemXmlName = trendingItemXml.getName();
                    // read trendingItemXml.poster_path
                    trendingItemXmlPosterPath = trendingItemXml.getPoster_path();
                    // read trendingItemXml.backdrop_path
                    trendingItemXmlBackdropPath = trendingItemXml.getBackdrop_path();
                }


                // read trendingItemXml.name == null
                trendingItemXmlNameJavaLangObjectNull = (trendingItemXmlName) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(trendingItemXmlNameJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (trendingItemXml != null) {
                    // read trendingItemXml.title
                    trendingItemXmlTitle = trendingItemXml.getTitle();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read trendingItemXml.name == null ? trendingItemXml.title : trendingItemXml.name
                trendingItemXmlNameJavaLangObjectNullTrendingItemXmlTitleTrendingItemXmlName = ((trendingItemXmlNameJavaLangObjectNull) ? (trendingItemXmlTitle) : (trendingItemXmlName));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTitle, trendingItemXmlNameJavaLangObjectNullTrendingItemXmlTitleTrendingItemXmlName);
            com.d121211070.filmku.methods.MethodsClass.getImageByGlide(this.originalImageView, trendingItemXmlBackdropPath);
            com.d121211070.filmku.methods.MethodsClass.getImageByPicasso(this.posterImageView, trendingItemXmlPosterPath);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): trendingItemXml
        flag 1 (0x2L): null
        flag 2 (0x3L): trendingItemXml.name == null ? trendingItemXml.title : trendingItemXml.name
        flag 3 (0x4L): trendingItemXml.name == null ? trendingItemXml.title : trendingItemXml.name
    flag mapping end*/
    //end
}