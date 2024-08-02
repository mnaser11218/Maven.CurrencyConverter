package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
  //  CurrencyConverter c = new CurrencyConverter();
    default Double convert(CurrencyType currencyType) {

        return currencyType.getRate() / this.getCurrencyType().getRate();
    }
    public CurrencyType getCurrencyType();
}
