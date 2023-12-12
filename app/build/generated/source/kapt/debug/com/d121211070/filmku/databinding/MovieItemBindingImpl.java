package com.d121211070.filmku.databinding;
import com.d121211070.filmku.R;
import com.d121211070.filmku.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieItemBindingImpl extends MovieItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MovieItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (com.google.android.material.chip.Chip) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.cardView.setTag(null);
        this.chip.setTag(null);
        this.productImage.setTag(null);
        this.productNameText.setTag(null);
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
        if (BR.ItemListXml == variableId) {
            setItemListXml((com.d121211070.filmku.models.MovieItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemListXml(@Nullable com.d121211070.filmku.models.MovieItem ItemListXml) {
        this.mItemListXml = ItemListXml;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ItemListXml);
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
        java.lang.Double itemListXmlVoteAverage = null;
        com.d121211070.filmku.models.MovieItem itemListXml = mItemListXml;
        double androidxDatabindingViewDataBindingSafeUnboxItemListXmlVoteAverage = 0.0;
        java.lang.String itemListXmlNameJavaLangObjectNullItemListXmlTitleItemListXmlName = null;
        java.lang.String itemListXmlName = null;
        boolean itemListXmlNameJavaLangObjectNull = false;
        java.lang.String itemListXmlTitle = null;
        java.lang.String itemListXmlPosterPath = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (itemListXml != null) {
                    // read ItemListXml.vote_average
                    itemListXmlVoteAverage = itemListXml.getVote_average();
                    // read ItemListXml.name
                    itemListXmlName = itemListXml.getName();
                    // read ItemListXml.poster_path
                    itemListXmlPosterPath = itemListXml.getPoster_path();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ItemListXml.vote_average)
                androidxDatabindingViewDataBindingSafeUnboxItemListXmlVoteAverage = androidx.databinding.ViewDataBinding.safeUnbox(itemListXmlVoteAverage);
                // read ItemListXml.name == null
                itemListXmlNameJavaLangObjectNull = (itemListXmlName) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(itemListXmlNameJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (itemListXml != null) {
                    // read ItemListXml.title
                    itemListXmlTitle = itemListXml.getTitle();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read ItemListXml.name == null ? ItemListXml.title : ItemListXml.name
                itemListXmlNameJavaLangObjectNullItemListXmlTitleItemListXmlName = ((itemListXmlNameJavaLangObjectNull) ? (itemListXmlTitle) : (itemListXmlName));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.d121211070.filmku.methods.MethodsClass.rateToInt(this.chip, androidxDatabindingViewDataBindingSafeUnboxItemListXmlVoteAverage);
            com.d121211070.filmku.methods.MethodsClass.getImageByPicasso(this.productImage, itemListXmlPosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.productNameText, itemListXmlNameJavaLangObjectNullItemListXmlTitleItemListXmlName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ItemListXml
        flag 1 (0x2L): null
        flag 2 (0x3L): ItemListXml.name == null ? ItemListXml.title : ItemListXml.name
        flag 3 (0x4L): ItemListXml.name == null ? ItemListXml.title : ItemListXml.name
    flag mapping end*/
    //end
}