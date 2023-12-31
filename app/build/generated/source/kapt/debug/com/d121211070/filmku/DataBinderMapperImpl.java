package com.d121211070.filmku;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.d121211070.filmku.databinding.FragmentDetailsBindingImpl;
import com.d121211070.filmku.databinding.FragmentSearchBindingImpl;
import com.d121211070.filmku.databinding.MovieItemBindingImpl;
import com.d121211070.filmku.databinding.TrendingMovieItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDETAILS = 1;

  private static final int LAYOUT_FRAGMENTSEARCH = 2;

  private static final int LAYOUT_MOVIEITEM = 3;

  private static final int LAYOUT_TRENDINGMOVIEITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.d121211070.filmku.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.d121211070.filmku.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.d121211070.filmku.R.layout.movie_item, LAYOUT_MOVIEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.d121211070.filmku.R.layout.trending_movie_item, LAYOUT_TRENDINGMOVIEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIEITEM: {
          if ("layout/movie_item_0".equals(tag)) {
            return new MovieItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TRENDINGMOVIEITEM: {
          if ("layout/trending_movie_item_0".equals(tag)) {
            return new TrendingMovieItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for trending_movie_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(1, "ItemListXml");
      sKeys.put(0, "_all");
      sKeys.put(2, "movieItemXml");
      sKeys.put(3, "trendingItemXml");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_details_0", com.d121211070.filmku.R.layout.fragment_details);
      sKeys.put("layout/fragment_search_0", com.d121211070.filmku.R.layout.fragment_search);
      sKeys.put("layout/movie_item_0", com.d121211070.filmku.R.layout.movie_item);
      sKeys.put("layout/trending_movie_item_0", com.d121211070.filmku.R.layout.trending_movie_item);
    }
  }
}
