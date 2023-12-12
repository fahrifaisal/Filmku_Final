// Generated by view binder compiler. Do not edit!
package com.d121211070.filmku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.d121211070.filmku.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSeeMoreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView PageNameText;

  @NonNull
  public final RecyclerView SeeMoreRecycler;

  @NonNull
  public final ProgressBar SeeProgressBar;

  @NonNull
  public final Button backBtn;

  private FragmentSeeMoreBinding(@NonNull ConstraintLayout rootView, @NonNull TextView PageNameText,
      @NonNull RecyclerView SeeMoreRecycler, @NonNull ProgressBar SeeProgressBar,
      @NonNull Button backBtn) {
    this.rootView = rootView;
    this.PageNameText = PageNameText;
    this.SeeMoreRecycler = SeeMoreRecycler;
    this.SeeProgressBar = SeeProgressBar;
    this.backBtn = backBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSeeMoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSeeMoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_see_more, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSeeMoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PageNameText;
      TextView PageNameText = ViewBindings.findChildViewById(rootView, id);
      if (PageNameText == null) {
        break missingId;
      }

      id = R.id.SeeMoreRecycler;
      RecyclerView SeeMoreRecycler = ViewBindings.findChildViewById(rootView, id);
      if (SeeMoreRecycler == null) {
        break missingId;
      }

      id = R.id.SeeProgressBar;
      ProgressBar SeeProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (SeeProgressBar == null) {
        break missingId;
      }

      id = R.id.backBtn;
      Button backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      return new FragmentSeeMoreBinding((ConstraintLayout) rootView, PageNameText, SeeMoreRecycler,
          SeeProgressBar, backBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}