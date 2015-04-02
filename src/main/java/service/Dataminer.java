package service;

import java.util.ArrayList;
import java.util.List;

import database.DBStrategy;
import database.InMemoryDB;
import domain.Transaction;

public class Dataminer {
	DBStrategy dbStrategy;
	
	public Dataminer(){
		dbStrategy = new InMemoryDB();
	}
	
	public List<Transaction> getAll() {
		return dbStrategy.getAll();
	}

	public List<Transaction> get(String region) {
		return dbStrategy.get(region);
	}

	public void add(Transaction transaction) {
		dbStrategy.add(transaction);
	}
}
