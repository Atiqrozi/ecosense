// Generated by view binder compiler. Do not edit!
package com.dicoding.asclepius.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.asclepius.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button analyzeButton;

  @NonNull
  public final ImageButton buttonHistory;

  @NonNull
  public final ImageButton buttonNews;

  @NonNull
  public final Button galleryButton;

  @NonNull
  public final ImageView previewImageView;

  @NonNull
  public final LinearProgressIndicator progressIndicator;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button analyzeButton,
      @NonNull ImageButton buttonHistory, @NonNull ImageButton buttonNews,
      @NonNull Button galleryButton, @NonNull ImageView previewImageView,
      @NonNull LinearProgressIndicator progressIndicator) {
    this.rootView = rootView;
    this.analyzeButton = analyzeButton;
    this.buttonHistory = buttonHistory;
    this.buttonNews = buttonNews;
    this.galleryButton = galleryButton;
    this.previewImageView = previewImageView;
    this.progressIndicator = progressIndicator;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.analyzeButton;
      Button analyzeButton = ViewBindings.findChildViewById(rootView, id);
      if (analyzeButton == null) {
        break missingId;
      }

      id = R.id.button_history;
      ImageButton buttonHistory = ViewBindings.findChildViewById(rootView, id);
      if (buttonHistory == null) {
        break missingId;
      }

      id = R.id.button_news;
      ImageButton buttonNews = ViewBindings.findChildViewById(rootView, id);
      if (buttonNews == null) {
        break missingId;
      }

      id = R.id.galleryButton;
      Button galleryButton = ViewBindings.findChildViewById(rootView, id);
      if (galleryButton == null) {
        break missingId;
      }

      id = R.id.previewImageView;
      ImageView previewImageView = ViewBindings.findChildViewById(rootView, id);
      if (previewImageView == null) {
        break missingId;
      }

      id = R.id.progressIndicator;
      LinearProgressIndicator progressIndicator = ViewBindings.findChildViewById(rootView, id);
      if (progressIndicator == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, analyzeButton, buttonHistory,
          buttonNews, galleryButton, previewImageView, progressIndicator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}