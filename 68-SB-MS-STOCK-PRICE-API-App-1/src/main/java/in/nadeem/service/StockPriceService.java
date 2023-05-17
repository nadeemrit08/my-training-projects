package in.nadeem.service;

import in.nadeem.bindings.StockPriceResponse;

public interface StockPriceService {

	public StockPriceResponse getStockPrice(String companyName);
}
