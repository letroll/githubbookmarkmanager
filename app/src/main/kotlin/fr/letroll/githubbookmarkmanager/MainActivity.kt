package fr.letroll.githubbookmarkmanager

import android.os.Bundle
import android.widget.Button
import android.widget.AutoCompleteTextView
import android.widget.EditText
import fr.letroll.githubbookmarkmanager.api.GithubApi
import fr.letroll.kotlinandroidlib.findView
import retrofit.Callback
import retrofit.client.Response
import retrofit.RetrofitError
import fr.letroll.githubbookmarkmanager.api.model.Repo
import fr.letroll.githubbookmarkmanager.api.model.RepoAuthorization
import fr.letroll.kotlinandroidlib.loge

/**
 * Created by jquievreux on 26/11/14.
 */

open class MainActivity : BaseActivity() {
    override val contentViewId: Int=R.layout.activity_login

//    var login
//    var pass: EditText()

    val calR = object : Callback<List<Repo>> {
        override fun success(list: List<Repo>?, response: Response?) {
            if (list == null) {
                toast("list:null")
            } else
                toast("list=" + list.size())
        }

        override fun failure(error: RetrofitError?) {
            if (error == null) {
                toast("error:null")
            } else
                toast("error:" + error.getMessage())
        }
    }

    val cal = object : Callback<List<RepoAuthorization>> {
        override fun success(values: List<RepoAuthorization>?, response: Response?) {
            if (values == null) {
                toast("string:null")
            } else {
                for (rep in values) {
                    //                    if(rep._scopes.size==9) {
                    //                        loge(rep._token + " " + rep._scopes)
                    //                        GithubApi().setTokenAuth(rep._token)
                    //                    }
                    loge(rep.toString())
                }
                toast("string=" + values.elementAt(0)._token)
                loge("data:" + values.elementAt(0).toString())
            }
        }

        override fun failure(error: RetrofitError?) {
            if (error == null) {
                toast("error:null")
            } else
                toast("error:" + error.getMessage())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(contentViewId);

        val githubApi: GithubApi = GithubApi()
        val login = findView<AutoCompleteTextView>(R.id.email).getText().toString()
        val pass = findView<EditText>(R.id.password).getText().toString()
        val email_sign_in_button = findView<Button>(R.id.email_sign_in_button)
        githubApi.setBasicAuth(login, pass)
        email_sign_in_button.setOnClickListener({
            //            val tmp = array("repo"):Array<String>
            //            githubApi.getService().getAuthorizations(tmp, "toto", "http://test.com", "f562e3df7d57256f3884",
            //                    "6e90eafd7e6088af4f58170ef5118c64ea05ff50", cal)
            githubApi.getService()?.getAuthorizations(cal)
            //            githubApi.getService().listStarred("letroll", calR)
        })

//        val i = Intent(this, javaClass<LoginActivity>())
//        startActivity(i)
    }
}