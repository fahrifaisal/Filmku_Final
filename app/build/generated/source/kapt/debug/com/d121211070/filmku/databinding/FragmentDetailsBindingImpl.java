package com.d121211070.filmku.databinding;
import com.d121211070.filmku.R;
import com.d121211070.filmku.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backButton, 10);
        sViewsWithIds.put(R.id.textView3, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (com.google.android.material.chip.Chip) bindings[5]
            , (com.google.android.material.chip.ChipGroup) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            );
        this.chip.setTag(null);
        this.chipGroup.setTag(null);
        this.descriptionText.setTag(null);
        this.imageView2.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.posterImage.setTag(null);
        this.productImage.setTag(null);
        this.productNameText.setTag(null);
        this.releaseDateText.setTag(null);
        this.textView4.setTag(null);
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
        if (BR.movieItemXml == variableId) {
            setMovieItemXml((com.d121211070.filmku.models.MovieItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovieItemXml(@Nullable com.d121211070.filmku.models.MovieItem MovieItemXml) {
        this.mMovieItemXml = MovieItemXml;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movieItemXml);
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
        java.lang.String movieItemXmlVoteCountToString = null;
        java.lang.String movieItemXmlOverview = null;
        java.lang.String movieItemXmlName = null;
        java.lang.String movieItemXmlPosterPath = null;
        boolean movieItemXmlNameJavaLangObjectNull = false;
        java.lang.String movieItemXmlNameJavaLangObjectNullMovieItemXmlTitleMovieItemXmlName = null;
        java.lang.Double movieItemXmlVoteAverage = null;
        java.lang.Integer movieItemXmlVoteCount = null;
        java.lang.Boolean movieItemXmlAdult = null;
        double androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlVoteAverage = 0.0;
        java.lang.String movieItemXmlReleaseDate = null;
        java.lang.String movieItemXmlTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlAdult = false;
        java.util.List<java.lang.String> movieItemXmlGenreIds = null;
        com.d121211070.filmku.models.MovieItem movieItemXml = mMovieItemXml;
        java.lang.String movieItemXmlBackdropPath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movieItemXml != null) {
                    // read movieItemXml.overview
                    movieItemXmlOverview = movieItemXml.getOverview();
                    // read movieItemXml.name
                    movieItemXmlName = movieItemXml.getName();
                    // read movieItemXml.poster_path
                    movieItemXmlPosterPath = movieItemXml.getPoster_path();
                    // read movieItemXml.vote_average
                    movieItemXmlVoteAverage = movieItemXml.getVote_average();
                    // read movieItemXml.vote_count
                    movieItemXmlVoteCount = movieItemXml.getVote_count();
                    // read movieItemXml.adult
                    movieItemXmlAdult = movieItemXml.getAdult();
                    // read movieItemXml.release_date
                    movieItemXmlReleaseDate = movieItemXml.getRelease_date();
                    // read movieItemXml.genre_ids
                    movieItemXmlGenreIds = movieItemXml.getGenre_ids();
                    // read movieItemXml.backdrop_path
                    movieItemXmlBackdropPath = movieItemXml.getBackdrop_path();
                }


                // read movieItemXml.name == null
                movieItemXmlNameJavaLangObjectNull = (movieItemXmlName) == (null);
                // read androidx.databinding.ViewDataBinding.safeUnbox(movieItemXml.vote_average)
                androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(movieItemXmlVoteAverage);
                // read androidx.databinding.ViewDataBinding.safeUnbox(movieItemXml.adult)
                androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlAdult = androidx.databinding.ViewDataBinding.safeUnbox(movieItemXmlAdult);
            if((dirtyFlags & 0x3L) != 0) {
                if(movieItemXmlNameJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
                if (movieItemXmlVoteCount != null) {
                    // read movieItemXml.vote_count.toString()
                    movieItemXmlVoteCountToString = movieItemXmlVoteCount.toString();
                }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (movieItemXml != null) {
                    // read movieItemXml.title
                    movieItemXmlTitle = movieItemXml.getTitle();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read movieItemXml.name == null ? movieItemXml.title : movieItemXml.name
                movieItemXmlNameJavaLangObjectNullMovieItemXmlTitleMovieItemXmlName = ((movieItemXmlNameJavaLangObjectNull) ? (movieItemXmlTitle) : (movieItemXmlName));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.d121211070.filmku.methods.MethodsClass.rateToInt(this.chip, androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlVoteAverage);
            com.d121211070.filmku.methods.MethodsClass.addChip(this.chipGroup, movieItemXmlGenreIds);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionText, movieItemXmlOverview);
            com.d121211070.filmku.methods.MethodsClass.itsForAdult(this.imageView2, androidxDatabindingViewDataBindingSafeUnboxMovieItemXmlAdult);
            com.d121211070.filmku.methods.MethodsClass.getImageByPicasso(this.posterImage, movieItemXmlPosterPath);
            com.d121211070.filmku.methods.MethodsClass.getImageByGlide(this.productImage, movieItemXmlBackdropPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productNameText, movieItemXmlNameJavaLangObjectNullMovieItemXmlTitleMovieItemXmlName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseDateText, movieItemXmlReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView4, movieItemXmlVoteCountToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movieItemXml
        flag 1 (0x2L): null
        flag 2 (0x3L): movieItemXml.name == null ? movieItemXml.title : movieItemXml.name
        flag 3 (0x4L): movieItemXml.name == null ? movieItemXml.title : movieItemXml.name
    flag mapping end*/
    //end
}