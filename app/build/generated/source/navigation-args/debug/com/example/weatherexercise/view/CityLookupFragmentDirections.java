package com.example.weatherexercise.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.weatherexercise.R;
import com.example.weatherexercise.model.ForecastData;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CityLookupFragmentDirections {
  private CityLookupFragmentDirections() {
  }

  @NonNull
  public static ActionCityLookupFragmentToForecastFragment actionCityLookupFragmentToForecastFragment(
      @NonNull ForecastData wData) {
    return new ActionCityLookupFragmentToForecastFragment(wData);
  }

  public static class ActionCityLookupFragmentToForecastFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCityLookupFragmentToForecastFragment(@NonNull ForecastData wData) {
      if (wData == null) {
        throw new IllegalArgumentException("Argument \"wData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("wData", wData);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCityLookupFragmentToForecastFragment setWData(@NonNull ForecastData wData) {
      if (wData == null) {
        throw new IllegalArgumentException("Argument \"wData\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("wData", wData);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_cityLookupFragment_to_forecastFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ForecastData getWData() {
      return (ForecastData) arguments.get("wData");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCityLookupFragmentToForecastFragment that = (ActionCityLookupFragmentToForecastFragment) object;
      if (arguments.containsKey("wData") != that.arguments.containsKey("wData")) {
        return false;
      }
      if (getWData() != null ? !getWData().equals(that.getWData()) : that.getWData() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getWData() != null ? getWData().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCityLookupFragmentToForecastFragment(actionId=" + getActionId() + "){"
          + "wData=" + getWData()
          + "}";
    }
  }
}
