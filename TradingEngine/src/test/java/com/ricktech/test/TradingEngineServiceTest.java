package com.ricktech.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ricktech.application.TradingEngineMain;
import com.ricktech.application.TradingEngineServiceImpl;
import com.ricktech.event.model.RequestConfirmation;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TradingEngineMain.class) 
@SpringBootTest
public class TradingEngineServiceTest {
	
	@Autowired
    private TradingEngineServiceImpl tradingEngine;
	
	@Before
	public void setUp() {
		tradingEngine.parseEventFiles();
	}
	
	@Test
	public void testNumEvents() {
		List<RequestConfirmation> requests = tradingEngine.getRequests();
		assert(8 == requests.size());
	}

	@Test
	public void testEvent0() {
		List<RequestConfirmation> requests = tradingEngine.getRequests();
		assert("BIC16C".equals(requests.get(0).getHeader().getSendTo()));
		assert("BIC1".equals(requests.get(0).getHeader().getSentBy()));
		assert("AUD".equals(requests.get(0).getTrade().getVarianceOptionTransactionSupplement().getEquityPremium().getPaymentAmount().getCurrency()));
		assert("LEFT_BANK".equals(requests.get(0).getTrade().getVarianceOptionTransactionSupplement().getBuyerPartyReference().getHref()));
		assert("EMU_BANK".equals(requests.get(0).getTrade().getVarianceOptionTransactionSupplement().getSellerPartyReference().getHref()));
	}

}
