package database;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Transaction;

public class InMemoryDB implements DBStrategy{
	private Map<String, Transaction> database;
	
	public InMemoryDB() {
		database = new HashMap<String, Transaction>();
		for (int i = 0; i < 10; i++) 
			database.put(Integer.toString(i), new Transaction((double)i*i*10000000, "Belgium", "BE", "Germany", Integer.toString(i)));
	}
	
	@Override
	public List<Transaction> getAll() {
		return new ArrayList<Transaction>(database.values());
	}

	@Override
	public List<Transaction> get(String region) {
		List<Transaction> regionList = new ArrayList<Transaction>();
		for (Transaction t : database.values())
			if(t.getRegion().equals(region))
				regionList.add(t);
		return regionList;
	}

	@Override
	public void add(Transaction transaction) {
		database.put(transaction.getRegion(),transaction);
	}
}
