package com.example.demo1.RealWorld;

import java.util.Arrays;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BusinessCalculation {
    private Dataservice dataService;
	
	public BusinessCalculation(Dataservice dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
