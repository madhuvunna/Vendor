package com.example.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vendor.dao.InfoVendorRepository;
import com.example.vendor.model.InfoVendor;
@Service
public class InfoVendorServiceImpl implements InfoVendorService{
	
	@Autowired
	private InfoVendorRepository infoVendorRepository;

	@Override
	public List<InfoVendor> getAllVendors() {
		return infoVendorRepository.findAll();
	}
	
	@Override
	public InfoVendor save(InfoVendor infoVendor) {
		return infoVendorRepository.save(infoVendor);
	}

	@Override
	public InfoVendor createVendor(InfoVendor vendor) {
		return infoVendorRepository.save(vendor);
	}

	

}
