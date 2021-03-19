package com.ricktech.application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/tradingengine")
public class TradingEngineControler {
	
	@Autowired
    private TradingEngineServiceImpl tradingEngine;

	@GetMapping("/parseEventFiles")
	public void parseEventFiles() {
		tradingEngine.parseEventFiles();
		tradingEngine.printEvents();
	}

}

