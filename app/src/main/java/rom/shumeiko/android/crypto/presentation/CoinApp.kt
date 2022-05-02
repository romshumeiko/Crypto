package rom.shumeiko.android.crypto.presentation

import android.app.Application
import rom.shumeiko.android.crypto.di.DaggerApplicationComponent

class CoinApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}