package com.group3.cryptocurrencyprices.ViewModel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.group3.cryptocurrencyprices.Model.CryptocurrencyPricesRepository
import com.group3.cryptocurrencyprices.Model.Room.CryptocurrencyPricesEntityDb
import com.group3.cryptocurrencyprices.Model.WebAccess.CryptocurrencyPriceFromListApi
import java.util.*

class CryptocurrencyPricesViewModel(application: Application) : ViewModel() {
    var repository: CryptocurrencyPricesRepository = CryptocurrencyPricesRepository(application)
    var lastAddedObject: CryptocurrencyPricesEntityDb? = null

    fun requestPriceData(
        currencySymbol: String,
        date: Date
    ) {
        repository.requestPriceData(currencySymbol, date)
            .observeForever(androidx.lifecycle.Observer {
                if (it.entity != null && it.flagDataSet) {
                    it.flagDataSet = false
                    addReading(
                        it.currencySymbol,
                        it.date,
                        it.entity!!.market_data!!.current_price!!.usd
                    )
                }

            })
    }

    fun requestCryptocurrenciesList(): LiveData<ArrayList<CryptocurrencyPriceFromListApi>> {
        return repository.requestCryptocurrenciesList()
    }

    fun requestPriceHistoryForDateRange(
        currencySymbol: String,
        vs_currency: String,
        unixtimeFrom: Long,
        unixTimeTo: Long
    ): MutableLiveData<List<List<Double>>?> {
        return repository.requestPriceHistoryForDateRange(
            currencySymbol,
            vs_currency,
            unixtimeFrom,
            unixTimeTo
        )
    }

    fun clearAllRecords() {
        repository.clearAllRecords()
    }

    private fun addReading(cryptocurrencyIdArg: String, dateArg: Date, priceUsdArg: Double) {
        lastAddedObject = CryptocurrencyPricesEntityDb(
            cryptocurrencyId = cryptocurrencyIdArg,
            date = dateArg,
            priceUsd = priceUsdArg
        )

        repository.addReading(lastAddedObject!!)
    }

    fun getAllReadings(): LiveData<List<CryptocurrencyPricesEntityDb>>? {
        return repository.getAllReadings()
    }

    fun getApiErrorCodeLiveData() = repository.getApiErrorCodeLiveData()
}