package in.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import in.nadeem.bindings.StockPriceResponse;
import in.nadeem.repository.StockPriceRepository;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepo;

	@Autowired
	private Environment env;

	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		Double stockPrice = stockPriceRepo.findStockPriceByCompanyName(companyName);

		StockPriceResponse response = new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPrice);

		String port = env.getProperty("server.port");
		response.setPortNumber(Integer.parseInt(port));
		return response;
	}

}
