package com.olx.advertise.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.advertise.dto.Advertise;

@Service
public class AdvertiseServiceImple implements AdvertiseService {

	@Override
	public Advertise postAdvertise(Advertise Advertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise updateAdvertise(Advertise Advertise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> getAllAdvertiseByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> getAdvertiseByUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertise> filterAdvertise(String searchText, int categoryId, String postedBy,String dateCondition, LocalDate onDate,LocalDate fromDate,
			LocalDate toDate, String sortedBy, int startIndex, int records) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise SearchAdvertiseByText(String searchText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Advertise returnAdvertise(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
