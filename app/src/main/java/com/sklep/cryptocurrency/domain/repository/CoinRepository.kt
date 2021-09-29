package com.sklep.cryptocurrency.domain.repository

import com.sklep.cryptocurrency.data.remote.dto.CoinDetailDto
import com.sklep.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}