package com.group3.cryptocurrencyprices.Model

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.group3.cryptocurrencyprices.Model.Room.CryptocurrencyPricesDatabase
import com.group3.cryptocurrencyprices.Model.Room.CryptocurrencyPricesEntityDb
import com.group3.cryptocurrencyprices.Model.WebAccess.CryptocurrencyPriceFromListApi
import com.group3.cryptocurrencyprices.Model.WebAccess.CryptocurrencyPricesWebService
import com.group3.cryptocurrencyprices.Model.WebAccess.RequestWithResponse
import java.util.*

class CryptocurrencyPricesRepository(application: Application) {

    val database: CryptocurrencyPricesDatabase? =
        CryptocurrencyPricesDatabase.getDatabase(application)
    val webService: CryptocurrencyPricesWebService = CryptocurrencyPricesWebService()

    fun addReading(reading: CryptocurrencyPricesEntityDb) {
        database?.userDao()?.addReading(reading)
    }

    fun clearAllRecords() {
        database?.userDao()?.deleteAllReadings()
    }

    fun getAllReadings(): LiveData<List<CryptocurrencyPricesEntityDb>>? {
        return database?.userDao()?.getAllReadings()
    }

    fun requestPriceData(
        currencySymbol: String,
        date: Date
    ): MutableLiveData<RequestWithResponse> {
        return webService.requestPriceData(currencySymbol, date)
    }

    fun requestCryptocurrenciesList(): MutableLiveData<ArrayList<CryptocurrencyPriceFromListApi>> {
        return webService.requestCryptocurrenciesList()
    }

    fun requestPriceHistoryForDateRange(
        currencySymbol: String, vs_currency: String, unixtimeFrom: Long,
        unixTimeTo: Long
    ): MutableLiveData<List<List<Double>>?> {
        return webService.requestPriceHistoryForDateRange(currencySymbol, vs_currency, unixtimeFrom, unixTimeTo)
    }

    fun getApiErrorCodeLiveData() = webService.mldErrorCode
}