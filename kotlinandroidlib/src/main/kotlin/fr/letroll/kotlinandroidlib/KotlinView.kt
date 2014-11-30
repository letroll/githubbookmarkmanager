package fr.letroll.kotlinandroidlib

import android.view.View

fun View.show() {
    if(!this.isShown())this.setVisibility(View.VISIBLE)
}

fun View.hide() {
    if(this.isShown())this.setVisibility(View.INVISIBLE)
}

fun View.gone() {
    if(this.isShown())this.setVisibility(View.GONE)
}