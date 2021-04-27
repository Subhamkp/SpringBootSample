package org.example.calculator.controlers;

import org.example.calculator.models.BillResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;

import org.example.calculator.models.Bill;
import org.example.calculator.services_impl.BillServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/bills")
public class BillController {

	@Autowired
	BillServiceImpl billService;

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<BillResponse>> getBills() {
		HttpHeaders headers = new HttpHeaders();
		Collection<BillResponse> finalBill = billService.getFinalBill((Bill)null);
		headers.add("response-code", "00");
		headers.add("response-desc", "Success");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(finalBill);
	}
}
