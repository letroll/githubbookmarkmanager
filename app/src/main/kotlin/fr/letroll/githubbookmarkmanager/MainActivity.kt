package fr.letroll.githubbookmarkmanager

import android.os.Bundle
import android.content.Intent

/**
 * Created by jquievreux on 26/11/14.
 */

class MainActivity : BaseActivity() {
    override val contentViewId: Int=R.layout.activity_login;

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(contentViewId);
        val i = Intent(this, javaClass<LoginActivity>())
        startActivity(i)
    }
}