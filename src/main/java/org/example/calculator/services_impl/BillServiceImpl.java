package org.example.calculator.services_impl;

import java.util.Collection;

import org.example.calculator.models.BillResponse;
import org.springframework.stereotype.Service;
import org.example.calculator.models.Bill;
import org.example.calculator.services.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Override
	public Collection<BillResponse> getFinalBill(Bill bill) {
		Collection<BillResponse> result = null;
		return result;
	}
}
