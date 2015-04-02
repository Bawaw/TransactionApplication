package database;

import java.util.List;

import domain.Transaction;

public interface DBStrategy {
	List<Transaction> getAll();
	List<Transaction> get(String region);
	void add(Transaction transaction);
}
