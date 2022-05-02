package rom.shumeiko.android.crypto.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import rom.shumeiko.android.crypto.presentation.CoinViewModel

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CoinViewModel::class)
    fun bindCoinViewModel(viewModel: CoinViewModel): ViewModel
}
