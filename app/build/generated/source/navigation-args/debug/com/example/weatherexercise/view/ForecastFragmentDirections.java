package com.example.weatherexercise.view;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.weatherexercise.R;
import com.example.weatherexercise.model.ForecastDetails;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ForecastFragmentDirections {
  private ForecastFragmentDirections() {
  }

  @NonNull
  public static ActionForecastFragmentToForecastDetailFragment actionForecastFragmentToForecastDetailFragment(
      @NonNull ForecastDetails fDetail) {
    return new ActionForecastFragmentToForecastDetailFragment(fDetail);
  }

  public static class ActionForecastFragmentToForecastDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionForecastFragmentToForecastDetailFragment(@NonNull ForecastDetails fDetail) {
      if (fDetail == null) {
        throw new IllegalArgumentException("Argument \"fDetail\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("fDetail", fDetail);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionForecastFragmentToForecastDetailFragment setFDetail(
        @NonNull ForecastDetails fDetail) {
      if (fDetail == null) {
        throw new IllegalArgumentException("Argument \"fDetail\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("fDetail", fDetail);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_forecastFragment_to_forecastDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ForecastDetails getFDetail() {
      return (ForecastDetails) arguments.get("fDetail");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionForecastFragmentToForecastDetailFragment that = (ActionForecastFragmentToForecastDetailFragment) object;
      if (arguments.containsKey("fDetail") != that.arguments.containsKey("fDetail")) {
        return false;
      }
      if (getFDetail() != null ? !getFDetail().equals(that.getFDetail()) : that.getFDetail() != null) {
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
      result = 31 * result + (getFDetail() != null ? getFDetail().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionForecastFragmentToForecastDetailFragment(actionId=" + getActionId() + "){"
          + "fDetail=" + getFDetail()
          + "}";
    }
  }
}
