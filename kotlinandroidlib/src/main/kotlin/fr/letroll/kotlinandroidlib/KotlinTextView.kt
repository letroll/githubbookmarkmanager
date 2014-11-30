package fr.letroll.kotlinandroidlib

import android.widget.TextView

fun TextView.string() : String {
    return getText()?.toString() ?: ""
}