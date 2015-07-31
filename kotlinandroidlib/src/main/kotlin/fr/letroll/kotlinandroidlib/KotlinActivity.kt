package fr.letroll.kotlinandroidlib

import android.app.Activity
import android.content.res.Configuration
import android.util.Log
import android.view.View

//public fun Activity.findView<T: View>(id: Int): T? = findViewById(id) as? T

public fun Activity.findView<T : View>(id : Int) : T {
    val view : View? = findViewById(id) ?: throw IllegalArgumentException("Given ID could not be found in current layout!")
    return view as T
}

fun Activity.isLandscape(): Boolean {
    return getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE
}

fun Activity.isPortrait(): Boolean {
    return getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT
}

public fun Activity.log(txt: String?) {
    if (txt == null)
        Log.d("debug", "text null")
    else
        Log.d("debug", txt)
}

public fun Activity.loge(txt: String?) {
    if (txt == null)
        Log.e("error", "text null")
    else
        Log.e("error", txt)
}
