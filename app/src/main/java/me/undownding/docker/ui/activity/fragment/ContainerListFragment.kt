package me.undownding.docker.ui.activity.fragment

import android.support.v4.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import me.undownding.docker.R
import me.undownding.docker.api.DockerApi
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
        val api = DockerApi.newInstance("http://d.zaku.red/")
        api.getContainers()
            .observeOn(Schedulers.newThread())
            .subscribeOn(Schedulers.newThread())
            .subscribe({ result ->
                Log.d("docker", result.toString())
            }, { error ->
                Log.d("docker", error.toString())
            })
    }
}
