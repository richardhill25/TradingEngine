package com.ricktech.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Entry point for the Trading Engine application. Run the main to launch the application.
@SpringBootApplication
public class TradingEngineMain {
    public static void main(String[] args) {
        SpringApplication.run(TradingEngineMain.class, args);
    }
}
