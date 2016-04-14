package me.undownding.docker.ui.fragment

import android.content.Intent
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.snappydb.DB
import com.snappydb.SnappyDB
import me.undownding.docker.DockerApplication

import me.undownding.docker.R
import me.undownding.docker.ext.defaultServer
import me.undownding.docker.ui.activity.LoginActivity
import rx.Observable
import rx.schedulers.Schedulers

/**
 * A placeholder fragment containing a simple view.
 */
class ContainerListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_container_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        val observable: Observable<DB> = Observable.create { sub ->
            sub.onNext(SnappyDB.with(DockerApplication.instance))
        }
        observable.subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe({ db ->
                            if (db.defaultServer == null) {
                                startActivity(Intent(activity, LoginActivity::class.java))
                                activity?.finish()
                            }
                        }, { error ->
                            /*  do nothing */
                        }, { }
                )
    }
}
