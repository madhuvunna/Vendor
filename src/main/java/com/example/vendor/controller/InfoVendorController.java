package com.example.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.vendor.model.InfoVendor;
import com.example.vendor.service.EmailService;
import com.example.vendor.service.InfoVendorService;

//@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping
@RestController
public class InfoVendorController {

	@Autowired
	private InfoVendorService infoVendorService;

	@Autowired
	private EmailService emailService;

	@GetMapping("/getVendor")
	public ResponseEntity<List<InfoVendor>> getAllVendors() {
		List<InfoVendor> ven = null;
		ven = infoVendorService.getAllVendors();
		return new ResponseEntity<List<InfoVendor>>(ven, HttpStatus.ACCEPTED);
}

	@PostMapping("/save")
	public ResponseEntity<InfoVendor> save(@RequestBody InfoVendor infoVendor) {
		infoVendor = infoVendorService.save(infoVendor);
		return ResponseEntity.ok(infoVendor);
	}

	@PostMapping("/send-email")
	public void sendEmailToVendors(@RequestBody List<String> vendorEmails) {
		List<InfoVendor> vendors = infoVendorService.getAllVendors();
		for (InfoVendor vendor : vendors) {
			if (vendorEmails.contains(vendor.getEmail())) {
				String subject = "payment Notification";
				String body = "Sending payments to vendor" + vendor.getName() + "at UPI" + vendor.getUpi();
				emailService.sendEmail(vendor.getEmail(), subject, body);
			}
		}
	}
}
