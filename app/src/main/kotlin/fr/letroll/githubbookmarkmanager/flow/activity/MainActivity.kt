package fr.letroll.githubbookmarkmanager.flow.activity

import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import fr.letroll.githubbookmarkmanager.R
import fr.letroll.githubbookmarkmanager.api.GithubApi
import fr.letroll.kotlinandroidlib.findView
import rx.functions.Action1

/**
 * Created by jquievreux on 26/11/14.
 */

open class MainActivity : BaseActivity() {
    override val contentViewId: Int = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(contentViewId);

        val githubApi = GithubApi()
        val service = githubApi.getService()

        val login = findView<AutoCompleteTextView>(R.id.email)
        val pass = findView<EditText>(R.id.password)
        val email_sign_in_button = findView<Button>(R.id.email_sign_in_button)
        email_sign_in_button.setOnClickListener({

            //            val tmp = arrayOf("repo"):Array<String>
            //githubApi.getService().getAuthorizations(tmp, "toto", "http://test.com", "f562e3df7d57256f3884","6e90eafd7e6088af4f58170ef5118c64ea05ff50", cal)
            //githubService.getAuthorizations(cal)
            //githubApi.getService().listStarred("letroll", calR)

            service.getAuthorizations().subscribe(
                    object : Action1<String> {
                        override fun call(t: String?) {
                            toast(t)
                        }
                    }, object : Action1<Throwable> {
                override fun call(t: Throwable?) {
                    toast(t?.getMessage())
                }

            })

        })

    }
}