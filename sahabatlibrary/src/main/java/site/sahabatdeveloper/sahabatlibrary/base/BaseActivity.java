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
 * This is the parent file of the activity that is connected to container methods
 * @author by Alchemy Framework (http://alchemy.sahabatdeveloper.site/) - Politeknik Elektronika Negeri Surabaya
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Method for communication between activities
     * @return Communiation Class in Container
     */
    public Communication getCommunication() {
        return new Communication(this);
    }

    /**
     * Method for show progress loading dialog with custom Message and Style
     * @param message is message for progress loading dialog
     * @param style is Style for progress loading dialog
     * @return Loading Class in Container
     */
    public Loading getLoading(String message, int style) {
        return new Loading(this,message,style);
    }

    /**
     * Method for show progress loading dialog with default without parameter
     * @return Loading Class in Container
     */
    public Loading getLoading() {
        return new Loading(this);
    }

    /**
     * Method for store and get data in cache android (Usually for User Session)
     * @return Prefs Class in Container
     */
    public Prefs getPrefs() {
        return new Prefs(this);
    }

    /**
     * Method for show Alert Dialog with custom message, title, and button
     * @return Sahabat Dialog Class in Container
     */
    public SahabatDialog getDialog() {
        return new SahabatDialog(this);
    }

    /**
     * Method for User Interface message snackbar, toast, etc
     * @return User Interface Class in Container
     */
    public UserInterface getUserInterface() {
        return new UserInterface(this);
    }

    /**
     * Method for handle validation input type
     * @return Validation Class in Container
     */
    public Validation getValidation() {
        return new Validation(this);
    }

}
