package site.sahabatdeveloper.sahabatlibrary.container;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import javax.security.auth.callback.Callback;

public class SahabatDialog {
    Context context;
    private AlertDialog.Builder dialog;

    public SahabatDialog(Context context) {
        this.context = context;
    }

    public void showDialog(String message){
        new AlertDialog.Builder(context)
        .setMessage(message)
        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        })
        .show();
    }

    public void showDialog(String title, String message){
        new AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        })
        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        })
        .show();
    }

    public void showDialog(String title, String message, DialogInterface.OnClickListener listener){
        new AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(android.R.string.ok, listener)
        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        })
        .show();
    }
}
