package com.sklep.cryptocurrency.presentation.coin_list

import com.sklep.cryptocurrency.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = "",
)