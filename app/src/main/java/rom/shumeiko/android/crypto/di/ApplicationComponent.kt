package rom.shumeiko.android.crypto.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import rom.shumeiko.android.crypto.presentation.CoinDetailFragment
import rom.shumeiko.android.crypto.presentation.CoinPriceListActivity

@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(activity: CoinPriceListActivity)

    fun inject(fragment: CoinDetailFragment)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}