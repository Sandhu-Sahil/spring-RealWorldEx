package com.example.demo1.RealWorld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements Dataservice {

	@Override
	public int[] retrieveData() {
		return new int[] { 11, 22, 33, 44, 55 };
	}

}