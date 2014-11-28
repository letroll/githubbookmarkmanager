package com.vlad.android.kotlin

import android.app.Activity
import android.view.View

public fun Activity.findView<T: View>(id: Int): T? = findViewById(id) as? T

//public fun Activity.findView<T : View>(id : Int) : T {
//    val view : View? = findViewById(id)
//    if (view == null)
//        throw IllegalArgumentException("Given ID could not be found in current layout!")
//    return view as T
//}