package com.example.weatherexercise.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.weatherexercise.model.ForecastDetails;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ForecastDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ForecastDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ForecastDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ForecastDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ForecastDetailFragmentArgs __result = new ForecastDetailFragmentArgs();
    bundle.setClassLoader(ForecastDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("fDetail")) {
      ForecastDetails fDetail;
      if (Parcelable.class.isAssignableFrom(ForecastDetails.class) || Serializable.class.isAssignableFrom(ForecastDetails.class)) {
        fDetail = (ForecastDetails) bundle.get("fDetail");
      } else {
        throw new UnsupportedOperationException(ForecastDetails.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (fDetail == null) {
        throw new IllegalArgumentException("Argument \"fDetail\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("fDetail", fDetail);
    } else {
      throw new IllegalArgumentException("Required argument \"fDetail\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ForecastDetails getFDetail() {
    return (ForecastDetails) arguments.get("fDetail");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("fDetail")) {
      ForecastDetails fDetail = (ForecastDetails) arguments.get("fDetail");
      if (Parcelable.class.isAssignableFrom(ForecastDetails.class) || fDetail == null) {
        __result.putParcelable("fDetail", Parcelable.class.cast(fDetail));
      } else if (Serializable.class.isAssignableFrom(ForecastDetails.class)) {
        __result.putSerializable("fDetail", Serializable.class.cast(fDetail));
      } else {
        throw new UnsupportedOperationException(ForecastDetails.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ForecastDetailFragmentArgs that = (ForecastDetailFragmentArgs) object;
    if (arguments.containsKey("fDetail") != that.arguments.containsKey("fDetail")) {
      return false;
    }
    if (getFDetail() != null ? !getFDetail().equals(that.getFDetail()) : that.getFDetail() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFDetail() != null ? getFDetail().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ForecastDetailFragmentArgs{"
        + "fDetail=" + getFDetail()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(ForecastDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ForecastDetails fDetail) {
      if (fDetail == null) {
        throw new IllegalArgumentException("Argument \"fDetail\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("fDetail", fDetail);
    }

    @NonNull
    public ForecastDetailFragmentArgs build() {
      ForecastDetailFragmentArgs result = new ForecastDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFDetail(@NonNull ForecastDetails fDetail) {
      if (fDetail == null) {
        throw new IllegalArgumentException("Argument \"fDetail\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("fDetail", fDetail);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ForecastDetails getFDetail() {
      return (ForecastDetails) arguments.get("fDetail");
    }
  }
}
