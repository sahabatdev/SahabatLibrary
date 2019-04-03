package site.sahabatdeveloper.sahabatlibrary.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import site.sahabatdeveloper.sahabatlibrary.container.Communication;
import site.sahabatdeveloper.sahabatlibrary.container.Loading;
import site.sahabatdeveloper.sahabatlibrary.container.Prefs;
import site.sahabatdeveloper.sahabatlibrary.container.SahabatDialog;
import site.sahabatdeveloper.sahabatlibrary.container.UserInterface;
import site.sahabatdeveloper.sahabatlibrary.container.Validation;

/**
 * Created by sahabatdeveloper on 4/7/18.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public Communication getCommunication() {
        return new Communication(this);
    }

    public Loading getLoading(String message, int style) {
        return new Loading(this,message,style);
    }

    public Loading getLoading() {
        return new Loading(this);
    }



    public Prefs getPrefs() {
        return new Prefs(this);
    }

    public SahabatDialog getDialog() {
        return new SahabatDialog(this);
    }

    public UserInterface getUserInterface() {
        return new UserInterface(this);
    }

    public Validation getValidation() {
        return new Validation(this);
    }

}
