package com.practice.microservice.v1.currencyconversion.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class CurrencyConversion {

    @Id
    private long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmt;
    private BigDecimal quantity;
    private String env;

    public CurrencyConversion(long id, String from, String to, BigDecimal quantity,  BigDecimal conversionMultiple, BigDecimal totalCalculatedAmt, String env) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalCalculatedAmt = totalCalculatedAmt;
        this.env = env;
    }

    public CurrencyConversion() {
    }
}
