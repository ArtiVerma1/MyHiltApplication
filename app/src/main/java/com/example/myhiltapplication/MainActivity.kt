package com.example.myhiltapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myhiltapplication.Adapter.UserAdapter
import com.example.myhiltapplication.ui.main.MainFragment
import com.example.myhiltapplication.ui.main.MainViewModel
import com.example.myhiltapplication.ui.main.Module.APIModule
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val mainViewModel : MainViewModel by viewModels()
    private lateinit var adapter: UserAdapter
//    @Inject
//    lateinit var navigator: APIModule
@Inject
lateinit var retrofit: Retrofit
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, MainFragment.newInstance())
//                .commitNow()
//        }
//        val repository by lazy { UserRepos(db.userDao()) }
//        var factory = object : ViewModelProvider.Factory {
//            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//                return  MainViewModel(retrofit,repository) as T
//            }
//        }
        mainViewModel.users.observe(this, Observer {

        })
    }
}