package site.sahabatdeveloper.sahabatlibrary.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Created by sahabatdeveloper on 4/7/18.
 */

public class BaseActivity extends AppCompatActivity {

    ProgressDialog pDialog;
    public DecimalFormat df= new DecimalFormat("#,##0");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ITALY));
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Menghubungkan ke server");
        pDialog.setCanceledOnTouchOutside(false);
    }

    public void launchActivity(Class<?> kelas){
        startActivity(new Intent(this,kelas));
    }

    public void launchActivity(Class<?> kelas, Bundle bundle){
        Intent i = new Intent(this,kelas);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void showDialog(){
        pDialog.show();
    }

    public void hideDialog(){
        pDialog.hide();
    }

    protected void replaceFragment(@IdRes int containerViewId,
                                   @NonNull Fragment fragment,
                                   @NonNull String fragmentTag,
                                   @Nullable String backStackStateName) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId, fragment, fragmentTag)
                .addToBackStack(backStackStateName)
                .commit();
    }

}
