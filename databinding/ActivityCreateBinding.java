// Generated by view binder compiler. Do not edit!
package com.example.hafree.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hafree.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCreateBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout blay;

  @NonNull
  public final EditText editText1;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final Button go;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RelativeLayout lay;

  @NonNull
  public final Button load;

  @NonNull
  public final Button save;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final LinearLayout tlay;

  private ActivityCreateBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout blay,
      @NonNull EditText editText1, @NonNull EditText editText2, @NonNull Button go,
      @NonNull ImageView imageView, @NonNull RelativeLayout lay, @NonNull Button load,
      @NonNull Button save, @NonNull TextView textView1, @NonNull TextView textView2,
      @NonNull LinearLayout tlay) {
    this.rootView = rootView;
    this.blay = blay;
    this.editText1 = editText1;
    this.editText2 = editText2;
    this.go = go;
    this.imageView = imageView;
    this.lay = lay;
    this.load = load;
    this.save = save;
    this.textView1 = textView1;
    this.textView2 = textView2;
    this.tlay = tlay;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCreateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_create, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCreateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blay;
      LinearLayout blay = ViewBindings.findChildViewById(rootView, id);
      if (blay == null) {
        break missingId;
      }

      id = R.id.editText1;
      EditText editText1 = ViewBindings.findChildViewById(rootView, id);
      if (editText1 == null) {
        break missingId;
      }

      id = R.id.editText2;
      EditText editText2 = ViewBindings.findChildViewById(rootView, id);
      if (editText2 == null) {
        break missingId;
      }

      id = R.id.go;
      Button go = ViewBindings.findChildViewById(rootView, id);
      if (go == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.lay;
      RelativeLayout lay = ViewBindings.findChildViewById(rootView, id);
      if (lay == null) {
        break missingId;
      }

      id = R.id.load;
      Button load = ViewBindings.findChildViewById(rootView, id);
      if (load == null) {
        break missingId;
      }

      id = R.id.save;
      Button save = ViewBindings.findChildViewById(rootView, id);
      if (save == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.tlay;
      LinearLayout tlay = ViewBindings.findChildViewById(rootView, id);
      if (tlay == null) {
        break missingId;
      }

      return new ActivityCreateBinding((RelativeLayout) rootView, blay, editText1, editText2, go,
          imageView, lay, load, save, textView1, textView2, tlay);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
