package com.example.demo1.RealWorld;

import org.springframework.stereotype.Repository;
// import org.springframework.stereotype.Service;

//@component
@Repository
public class MySqlDataService implements Dataservice{
    @Override
	public int[] retrieveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
