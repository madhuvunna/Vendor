package com.example.vendor.service;

import java.util.List;

import com.example.vendor.model.InfoVendor;

public interface InfoVendorService {
	
	public List<InfoVendor> getAllVendors();
	
	public InfoVendor save(InfoVendor infoVendor);
	
	public InfoVendor createVendor(InfoVendor vendor);
}
