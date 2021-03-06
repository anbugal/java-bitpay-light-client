package com.bitpay.sdk_light.model.Invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentTotal {

    private Double _btc;
    private Double _bch;

    public PaymentTotal() {
    }

    @JsonIgnore
    public Double getBTC() {
        return _btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Double btc) {
        this._btc = btc;
    }

    @JsonIgnore
    public Double getBCH() {
        return _bch;
    }

    @JsonProperty("BCH")
    public void setBch(Double bch) {
        this._bch = bch;
    }
}
