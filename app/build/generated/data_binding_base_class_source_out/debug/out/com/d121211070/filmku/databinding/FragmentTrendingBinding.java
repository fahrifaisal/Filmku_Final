// Generated by view binder compiler. Do not edit!
package com.d121211070.filmku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.d121211070.filmku.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTrendingBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView ScrollView;

  @NonNull
  public final TextView latestText;

  @NonNull
  public final TextView popularText;

  @NonNull
  public final RadioGroup radioMediaGroup;

  @NonNull
  public final RadioGroup radioTimeGroup;

  @NonNull
  public final RecyclerView recycleLatest;

  @NonNull
  public final RecyclerView recyclePopular;

  @NonNull
  public final RecyclerView recycleTrend;

  @NonNull
  public final Button seeMoreLatestBtn;

  @NonNull
  public final Button seeMorePopularBtn;

  @NonNull
  public final Button seeMoreRatedBtn;

  @NonNull
  public final Button seeTrendingBtn;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final Button trendingBtn;

  @NonNull
  public final ConstraintLayout trendingMenu;

  @NonNull
  public final RadioButton trendingMenuAll;

  @NonNull
  public final RadioButton trendingMenuDay;

  @NonNull
  public final RadioButton trendingMenuMovie;

  @NonNull
  public final RadioButton trendingMenuTV;

  @NonNull
  public final RadioButton trendingMenuWeek;

  @NonNull
  public final ViewPager2 trendingMovies;

  private FragmentTrendingBinding(@NonNull ScrollView rootView, @NonNull ScrollView ScrollView,
      @NonNull TextView latestText, @NonNull TextView popularText,
      @NonNull RadioGroup radioMediaGroup, @NonNull RadioGroup radioTimeGroup,
      @NonNull RecyclerView recycleLatest, @NonNull RecyclerView recyclePopular,
      @NonNull RecyclerView recycleTrend, @NonNull Button seeMoreLatestBtn,
      @NonNull Button seeMorePopularBtn, @NonNull Button seeMoreRatedBtn,
      @NonNull Button seeTrendingBtn, @NonNull TextView textView, @NonNull TextView textView5,
      @NonNull TextView textView6, @NonNull Button trendingBtn,
      @NonNull ConstraintLayout trendingMenu, @NonNull RadioButton trendingMenuAll,
      @NonNull RadioButton trendingMenuDay, @NonNull RadioButton trendingMenuMovie,
      @NonNull RadioButton trendingMenuTV, @NonNull RadioButton trendingMenuWeek,
      @NonNull ViewPager2 trendingMovies) {
    this.rootView = rootView;
    this.ScrollView = ScrollView;
    this.latestText = latestText;
    this.popularText = popularText;
    this.radioMediaGroup = radioMediaGroup;
    this.radioTimeGroup = radioTimeGroup;
    this.recycleLatest = recycleLatest;
    this.recyclePopular = recyclePopular;
    this.recycleTrend = recycleTrend;
    this.seeMoreLatestBtn = seeMoreLatestBtn;
    this.seeMorePopularBtn = seeMorePopularBtn;
    this.seeMoreRatedBtn = seeMoreRatedBtn;
    this.seeTrendingBtn = seeTrendingBtn;
    this.textView = textView;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.trendingBtn = trendingBtn;
    this.trendingMenu = trendingMenu;
    this.trendingMenuAll = trendingMenuAll;
    this.trendingMenuDay = trendingMenuDay;
    this.trendingMenuMovie = trendingMenuMovie;
    this.trendingMenuTV = trendingMenuTV;
    this.trendingMenuWeek = trendingMenuWeek;
    this.trendingMovies = trendingMovies;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTrendingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTrendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_trending, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTrendingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ScrollView ScrollView = (ScrollView) rootView;

      id = R.id.latestText;
      TextView latestText = ViewBindings.findChildViewById(rootView, id);
      if (latestText == null) {
        break missingId;
      }

      id = R.id.popularText;
      TextView popularText = ViewBindings.findChildViewById(rootView, id);
      if (popularText == null) {
        break missingId;
      }

      id = R.id.radioMediaGroup;
      RadioGroup radioMediaGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioMediaGroup == null) {
        break missingId;
      }

      id = R.id.radioTimeGroup;
      RadioGroup radioTimeGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioTimeGroup == null) {
        break missingId;
      }

      id = R.id.recycleLatest;
      RecyclerView recycleLatest = ViewBindings.findChildViewById(rootView, id);
      if (recycleLatest == null) {
        break missingId;
      }

      id = R.id.recyclePopular;
      RecyclerView recyclePopular = ViewBindings.findChildViewById(rootView, id);
      if (recyclePopular == null) {
        break missingId;
      }

      id = R.id.recycleTrend;
      RecyclerView recycleTrend = ViewBindings.findChildViewById(rootView, id);
      if (recycleTrend == null) {
        break missingId;
      }

      id = R.id.seeMoreLatestBtn;
      Button seeMoreLatestBtn = ViewBindings.findChildViewById(rootView, id);
      if (seeMoreLatestBtn == null) {
        break missingId;
      }

      id = R.id.seeMorePopularBtn;
      Button seeMorePopularBtn = ViewBindings.findChildViewById(rootView, id);
      if (seeMorePopularBtn == null) {
        break missingId;
      }

      id = R.id.seeMoreRatedBtn;
      Button seeMoreRatedBtn = ViewBindings.findChildViewById(rootView, id);
      if (seeMoreRatedBtn == null) {
        break missingId;
      }

      id = R.id.seeTrendingBtn;
      Button seeTrendingBtn = ViewBindings.findChildViewById(rootView, id);
      if (seeTrendingBtn == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.trendingBtn;
      Button trendingBtn = ViewBindings.findChildViewById(rootView, id);
      if (trendingBtn == null) {
        break missingId;
      }

      id = R.id.trendingMenu;
      ConstraintLayout trendingMenu = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenu == null) {
        break missingId;
      }

      id = R.id.trendingMenuAll;
      RadioButton trendingMenuAll = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenuAll == null) {
        break missingId;
      }

      id = R.id.trendingMenuDay;
      RadioButton trendingMenuDay = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenuDay == null) {
        break missingId;
      }

      id = R.id.trendingMenuMovie;
      RadioButton trendingMenuMovie = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenuMovie == null) {
        break missingId;
      }

      id = R.id.trendingMenuTV;
      RadioButton trendingMenuTV = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenuTV == null) {
        break missingId;
      }

      id = R.id.trendingMenuWeek;
      RadioButton trendingMenuWeek = ViewBindings.findChildViewById(rootView, id);
      if (trendingMenuWeek == null) {
        break missingId;
      }

      id = R.id.trendingMovies;
      ViewPager2 trendingMovies = ViewBindings.findChildViewById(rootView, id);
      if (trendingMovies == null) {
        break missingId;
      }

      return new FragmentTrendingBinding((ScrollView) rootView, ScrollView, latestText, popularText,
          radioMediaGroup, radioTimeGroup, recycleLatest, recyclePopular, recycleTrend,
          seeMoreLatestBtn, seeMorePopularBtn, seeMoreRatedBtn, seeTrendingBtn, textView, textView5,
          textView6, trendingBtn, trendingMenu, trendingMenuAll, trendingMenuDay, trendingMenuMovie,
          trendingMenuTV, trendingMenuWeek, trendingMovies);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}