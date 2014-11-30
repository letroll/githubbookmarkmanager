package fr.letroll.githubbookmarkmanager

import android.app.Activity
import android.view.View
import android.widget.TextView

/**
 * Created by jquievreux on 26/11/14.
 */

abstract class BaseActivity : Activity(){

    //ici le mot clef val peut être comparer au mot clef final de java
    //ce qui signifie que contentViewId peut-être seulement lu et est initialisable qu'une fois
    abstract val contentViewId : Int

}