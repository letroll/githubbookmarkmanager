package fr.letroll.kotlinandroidlib

import android.app.Activity
import android.view.View
import android.util.Log

//public fun Activity.findView<T: View>(id: Int): T? = findViewById(id) as? T

public fun Activity.findView<T : View>(id: Int): T {
    val view: View? = findViewById(id)
    if (view == null)
        throw IllegalArgumentException("Given ID could not be found in current layout!")
    return view as T
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
