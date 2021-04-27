package org.example.calculator.services;

import org.example.calculator.models.Bill;
import org.example.calculator.models.BillResponse;

import java.util.Collection;

public interface BillService {

	//Get final bill
	Collection<BillResponse> getFinalBill(Bill bill) ;
}