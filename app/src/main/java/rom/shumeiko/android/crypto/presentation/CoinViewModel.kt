package rom.shumeiko.android.crypto.presentation

import androidx.lifecycle.ViewModel
import rom.shumeiko.android.crypto.domain.GetCoinInfoListUseCase
import rom.shumeiko.android.crypto.domain.GetCoinInfoUseCase
import rom.shumeiko.android.crypto.domain.LoadDataUseCase
import javax.inject.Inject

class CoinViewModel @Inject constructor(
    private val getCoinInfoListUseCase: GetCoinInfoListUseCase,
    private val getCoinInfoUseCase: GetCoinInfoUseCase,
    private val loadDataUseCase: LoadDataUseCase,
) : ViewModel() {

    val coinInfoList = getCoinInfoListUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }
}