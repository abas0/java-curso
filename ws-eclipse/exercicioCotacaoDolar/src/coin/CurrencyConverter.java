package coin;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double currencyconverter(double dollarPrice, double dollar) {
		return (1 + IOF) * dollarPrice * dollar;
	}
}
