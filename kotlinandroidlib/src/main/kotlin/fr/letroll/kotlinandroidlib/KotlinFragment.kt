package fr.letroll.kotlinandroidlib

/**
 * Created by jquievreux on 31/07/15.
 */

import android.app.Fragment
import android.support.v4.app
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v4.app.Fragment as SupportFragment

fun Fragment.inflate(layoutResId: Int, inflater: LayoutInflater?,
                         container: ViewGroup?): View? {
    return inflater?.inflate(layoutResId, container, false)
}

fun SupportFragment.inflate(layoutResId: Int, inflater: LayoutInflater?,
                     container: ViewGroup?): View? {
    return inflater?.inflate(layoutResId, container, false)
}