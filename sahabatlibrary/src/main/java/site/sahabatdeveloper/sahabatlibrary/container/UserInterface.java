package site.sahabatdeveloper.sahabatlibrary.container;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Toast;

public class UserInterface {
    Context context;

    public UserInterface(Context context) {
        this.context = context;
    }

    public void showMessageToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void showSnackbar(View view, String message){
        Snackbar.make(view,message,Snackbar.LENGTH_LONG).show();
    }

    public void showSnackbar(View view, String message, Snackbar.Callback callback){
        Snackbar snackbar = Snackbar.make(view,message,Snackbar.LENGTH_LONG);
        snackbar.setCallback(callback);
        snackbar.show();
    }

    public void showError(TextInputLayout textInputLayout, String message){
        textInputLayout.setError(message);
    }

}
