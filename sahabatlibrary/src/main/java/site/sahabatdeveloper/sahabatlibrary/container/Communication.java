package site.sahabatdeveloper.sahabatlibrary.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import site.sahabatdeveloper.sahabatlibrary.base.BaseActivity;

/**
 * This is the Communication Class is used for communication between activities and fragments
 * @author by Alchemy Framework (http://alchemy.sahabatdeveloper.site/) - Politeknik Elektronika Negeri Surabaya
 */
public class Communication{
    Context context;

    /**
     * Constructor Method
     * @param context for get context from activity or fragment
     */
    public Communication(Context context) {
        this.context = context;
    }

    /**
     * Method for move activity with Intent
     * @param kelas Destination activity class
     */
    public void moveActivity(Class<?> kelas){
        context.startActivity(new Intent(context,kelas));
    }

    /**
     * Method for move activity and store data to destination activity
     * @param kelas Destination activity class
     * @param bundle contain store data bundle
     */
    public void moveActivity(Class<?> kelas, Bundle bundle){
        Intent i = new Intent(context,kelas);
        i.putExtras(bundle);
        context.startActivity(i);
    }

    /**
     * Method for switch or replace fragment from activity
     * @param fragmentManager getSupportFragmentManager from Activity
     * @param containerViewId Res Id Attribute Frame layout for fragment
     * @param fragment class for destination class
     * @param fragmentTag for identity tag this fragment
     * @param backStackStateName for action replace fragment when on back pressed
     */
    public void switchFragment(@NonNull FragmentManager fragmentManager,
                                @IdRes int containerViewId,
                                @NonNull Fragment fragment,
                                @NonNull String fragmentTag,
                                @Nullable String backStackStateName) {

                fragmentManager
                .beginTransaction()
                .replace(containerViewId, fragment, fragmentTag)
                .addToBackStack(backStackStateName)
                .commit();
    }

}
