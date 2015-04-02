package controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.Dataminer;
import domain.Transaction;

@RestController
public class TransactionController {
	
	Dataminer service; 
	
	public TransactionController() {
		service = new Dataminer();
	}
	
    @RequestMapping("/get")
    public List<Transaction> greeting(@RequestParam(value="region", defaultValue="Belgium") String region) {
        return service.get(region);
    }
}
