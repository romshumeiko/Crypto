package rom.shumeiko.android.crypto.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import rom.shumeiko.android.crypto.data.database.AppDatabase
import rom.shumeiko.android.crypto.data.database.CoinInfoDao
import rom.shumeiko.android.crypto.data.repository.CoinRepositoryImpl
import rom.shumeiko.android.crypto.domain.CoinRepository

@Module
interface DataModule {

    @Binds
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        @Provides
        fun provideCoinInfoDao(
            application: Application
        ): CoinInfoDao {
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }
    }
}