package com.example.weatherexercise.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.weatherexercise.model.ForecastData;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ForecastFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ForecastFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ForecastFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ForecastFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ForecastFragmentArgs __result = new ForecastFragmentArgs();
    bundle.setClassLoader(ForecastFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("wData")) {
      ForecastData wData;
      if (Parcelable.class.isAssignableFrom(ForecastData.class) || Serializable.class.isAssignableFrom(ForecastData.class)) {
        wData = (ForecastData) bundle.get("wData");
      } else {
        throw new UnsupportedOperationException(ForecastData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (wData == null) {
        throw new IllegalArgumentException("Argument \"wData\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("wData", wData);
    } else {
      throw new IllegalArgumentException("Required argument \"wData\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ForecastData getWData() {
    return (ForecastData) arguments.get("wData");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("wData")) {
      ForecastData wData = (ForecastData) arguments.get("wData");
      if (Parcelable.class.isAssignableFrom(ForecastData.class) || wData == null) {
        __result.putParcelable("wData", Parcelable.class.cast(wData));
      } else if (Serializable.class.isAssignableFrom(ForecastData.class)) {
        __result.putSerializable("wData", Serializable.class.cast(wData));
      } else {
        throw new UnsupportedOperationException(ForecastData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    ForecastFragmentArgs that = (ForecastFragmentArgs) object;
    if (arguments.containsKey("wData") != that.arguments.containsKey("wData")) {
      return false;
    }
    if (getWData() != null ? !getWData().equals(that.getWData()) : that.getWData() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getWData() != null ? getWData().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ForecastFragmentArgs{"
        + "wData=" + getWData()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(ForecastFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ForecastData wData) {
      if (wData == null) {
        throw new IllegalArgumentException("Argument \"wData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("wData", wData);
    }

    @NonNull
    public ForecastFragmentArgs build() {
      ForecastFragmentArgs result = new ForecastFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setWData(@NonNull ForecastData wData) {
      if (wData == null) {
        throw new IllegalArgumentException("Argument \"wData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("wData", wData);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ForecastData getWData() {
      return (ForecastData) arguments.get("wData");
    }
  }
}
