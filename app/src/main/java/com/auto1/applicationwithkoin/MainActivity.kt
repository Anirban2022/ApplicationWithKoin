package com.auto1.applicationwithkoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.koin.androidx.scope.ScopeActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.core.qualifier.named
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

class MainActivity : ScopeActivity() {
    val viewModel: MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res = viewModel.getResult()
        Log.e("###", "onCreate: $res")
    }

//    companion object {
//        val mainModule = module {
//            factory {
//                MyViewModel(get(named(MY_USE_CASE)))
//            }
//            singleOf(::Repository) {
//                bind<MyRepo>()
//                named("MainRepo")
//            }
//            single(named("MainRepo")) {
//                Repository()
//            } bind MyRepo::class

//            factory(named(MY_USE_CASE)) {
//                MyUserCase(get(named("MainRepo")))
//            } bind BaseUseCase::class
//        }
//    }
}
