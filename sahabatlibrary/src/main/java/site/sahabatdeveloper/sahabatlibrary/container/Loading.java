package site.sahabatdeveloper.sahabatlibrary.container;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ProgressBar;

/**
 * This is the Loading Class is used for loading progress dialog activities and fragments
 * @author by Alchemy Framework (http://alchemy.sahabatdeveloper.site/) - Politeknik Elektronika Negeri Surabaya
 */
public class Loading {
    private Context context;
    private ProgressDialog pDialog;
    private String message;

    /**
     * This is constructor for get custom data message and style
     * @param context for get context from activity or fragment
     * @param message for custom body message loading progress dialog
     * @param style for custom style loading progress dialog
     */
    public Loading(Context context, String message, int style) {
        this.context = context;
        this.message = message;
        pDialog = new ProgressDialog(context);
        pDialog.setMessage(message);
        pDialog.setProgressStyle(style);
        pDialog.setCanceledOnTouchOutside(false);
    }

    /**
     * This is constructor with default progress dialog
     * @param context for get context from activity or fragment
     */
    public Loading(Context context) {
        this.context = context;

        pDialog = new ProgressDialog(context);
        pDialog.setMessage("Terhubung ke Server");
        pDialog.setCanceledOnTouchOutside(false);
    }

    /**
     * method use show progress loading dialog
     */
    public void showLoadingDialog(){
        if(pDialog!=null){
            pDialog.show();
        }
    }

    /**
     * method use hide progress loading dialog
     */
    public void hideLoadingDialog(){
        if(pDialog!=null){
            pDialog.hide();
        }
    }

}
