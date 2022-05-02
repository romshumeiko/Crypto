package rom.shumeiko.android.crypto.domain

import javax.inject.Inject

class LoadDataUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    operator fun invoke() = repository.loadData()
}