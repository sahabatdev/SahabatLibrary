package site.sahabatdeveloper.sahabatlibrary.base;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by sahabatdeveloper on 4/7/18.
 */

public class BaseDialog {
    Context context;
    ProgressDialog pDialog;

    public BaseDialog(Context baseActivity) {
        context = baseActivity;
        pDialog = new ProgressDialog(context);
        pDialog.setMessage("Loading ke server");
    }

    public void showProgressDialog(){
        pDialog.show();
    }

    public void hideProgressDialog(){
        pDialog.hide();
    }
}
