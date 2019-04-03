package site.sahabatdeveloper.sahabatlibrary.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import site.sahabatdeveloper.sahabatlibrary.container.Communication;
import site.sahabatdeveloper.sahabatlibrary.container.Loading;
import site.sahabatdeveloper.sahabatlibrary.container.Prefs;
import site.sahabatdeveloper.sahabatlibrary.container.SahabatDialog;
import site.sahabatdeveloper.sahabatlibrary.container.UserInterface;
import site.sahabatdeveloper.sahabatlibrary.container.Validation;

/**
 * Created by sahabatdeveloper on 4/7/18.
 */

public class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public Communication getCommunication() {
        return new Communication(getActivity());
    }

    public Loading getLoading(String message, int style) {
        return new Loading(getActivity(),message,style);
    }

    public Loading getLoading() {
        return new Loading(getActivity());
    }

    public Prefs getPrefs() {
        return new Prefs(getActivity());
    }

    public SahabatDialog getDialog() {
        return new SahabatDialog(getActivity());
    }

    public UserInterface getUserInterface() {
        return new UserInterface(getActivity());
    }

    public Validation getValidation() {
        return new Validation(getActivity());
    }
}
