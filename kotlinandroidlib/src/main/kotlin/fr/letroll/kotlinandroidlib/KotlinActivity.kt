package fr.letroll.kotlinandroidlib

import android.app.Activity
import android.content.res.Configuration
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
