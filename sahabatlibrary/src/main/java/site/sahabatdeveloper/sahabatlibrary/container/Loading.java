package site.sahabatdeveloper.sahabatlibrary.container;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ProgressBar;

public class Loading {
    Context context;
    private ProgressDialog pDialog;
    private String message;

    public Loading(Context context, String message, int style) {
        this.context = context;
        this.message = message;

        pDialog = new ProgressDialog(context);
        pDialog.setMessage(message);
        pDialog.setProgressStyle(style);
        pDialog.setCanceledOnTouchOutside(false);
    }

    public Loading(Context context) {
        this.context = context;

        pDialog = new ProgressDialog(context);
        pDialog.setMessage("Terhubung ke Server");
        pDialog.setCanceledOnTouchOutside(false);
    }

    public void showLoadingDialog(){
        if(pDialog!=null){
            pDialog.show();
        }
    }

    public void hideLoadingDialog(){
        if(pDialog!=null){
            pDialog.hide();
        }
    }

}
