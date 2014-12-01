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
            val cal = object : Callback<String> {
                override fun success(t: String?, response: Response?) {
                    if (t == null) {
                        toast("string:null")
                    } else
                        toast("string=" + t)
                }

                override fun failure(error: RetrofitError?) {
                    if (error == null) {
                        toast("error:null")
                    } else
                        toast("error:" + error.getMessage())
                }
            }
            //val github = RtGithub("999a01a89817293ddf79e6e7b4ab5b37b002d264"):Github
            //            val tmp={"public_repo"}:String[]
            //            githubApi.getService().getAuthorizations(,"toto","http://test.com","f562e3df7d57256f3884",
            //                    "6e90eafd7e6088af4f58170ef5118c64ea05ff50",cal)
            //            githubApi.getService().listStarred("letroll", cal)
        }

//        val i = Intent(this, javaClass<LoginActivity>())
//        startActivity(i)
//        Github github = RtGithub()
    }

    /*

                val cal = object : Callback<List<Repo>> {
                    override fun success(list: List<Repo>?, response: Response?) {
                        if (list == null) {
                            toast("list:null")
                        } else
                            toast("list="+list.size())
                    }

                    override fun failure(error: RetrofitError?) {
                        if (error == null) {
                            toast("error:null")
                        } else
                            toast("error:" + error.getMessage())
                    }
     */
}