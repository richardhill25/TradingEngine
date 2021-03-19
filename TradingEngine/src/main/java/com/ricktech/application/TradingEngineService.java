package com.ricktech.application;

import org.springframework.stereotype.Service;

@Service
public interface TradingEngineService{
    public void parseEventFiles();
    public void printEvents();
}
