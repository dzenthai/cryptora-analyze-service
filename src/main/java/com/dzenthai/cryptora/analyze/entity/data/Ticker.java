package com.dzenthai.cryptora.analyze.entity.data;

import lombok.Getter;

import java.util.List;
import java.util.stream.Stream;


@Getter
public enum Ticker {

    /**
     * Indicates the option to incorporate additional cryptocurrencies.
     */

    BTC,
    ETH,
    TON;

    public String getSymbol() {
        return this.name() + "USDT";
    }

    public static List<String> getAllSymbols() {
        return Stream.of(Ticker.values())
                .map(Ticker::getSymbol)
                .toList();
    }
}


