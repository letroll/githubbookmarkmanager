package fr.letroll.githubbookmarkmanager

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import fr.letroll.kotlinandroidlib.findView
import android.widget.AutoCompleteTextView
import android.widget.EditText
import fr.letroll.githubbookmarkmanager.api.GithubApi

/**
 * Created by jquievreux on 26/11/14.
 */

open class MainActivity : BaseActivity() {
    override val contentViewId: Int=R.layout.activity_login

//    var login
//    var pass: EditText()

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(contentViewId);

        val githubApi: GithubApi = GithubApi()
        val login = findView<AutoCompleteTextView>(R.id.email)
        val pass = findView<EditText>(R.id.password)
        val email_sign_in_button = findView<Button>(R.id.email_sign_in_button)
        email_sign_in_button.setOnClickListener {
            Toast.makeText(this, "toto", Toast.LENGTH_LONG).show()

            githubApi.getService()
        }

//        val i = Intent(this, javaClass<LoginActivity>())
//        startActivity(i)
//        Github github = RtGithub()
    }
}