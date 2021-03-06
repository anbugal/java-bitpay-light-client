package com.bitpay.sdk_light.model.Invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportedTransactionCurrencies {

    private SupportedTransactionCurrency _btc = new SupportedTransactionCurrency();
    private SupportedTransactionCurrency _bch = new SupportedTransactionCurrency();

    public SupportedTransactionCurrencies() {
    }

    @JsonIgnore
    public SupportedTransactionCurrency getBtc() {
        return _btc;
    }

    @JsonProperty("BTC")
    public void setBtc(SupportedTransactionCurrency btc) {
        this._btc = btc;
    }

    @JsonIgnore
    public SupportedTransactionCurrency getBch() {
        return _bch;
    }

    @JsonProperty("BCH")
    public void setBch(SupportedTransactionCurrency bch) {
        this._bch = bch;
    }
}
