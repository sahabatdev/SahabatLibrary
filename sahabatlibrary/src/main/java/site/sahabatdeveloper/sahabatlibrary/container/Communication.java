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

public class Communication{
    Context context;

    public Communication(Context context) {
        this.context = context;
    }

    public void moveActivity(Class<?> kelas){
        context.startActivity(new Intent(context,kelas));
    }

    public void moveActivity(Class<?> kelas, Bundle bundle){
        Intent i = new Intent(context,kelas);
        i.putExtras(bundle);
        context.startActivity(i);
    }

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
