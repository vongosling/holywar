package com.fasheng.service.service.interfaces;

import java.util.List;

import com.fasheng.service.dto.ProvinceDTO;

public interface ProvinceService {
	/**
	 * get all provinces.
	 * @return
	 */
	public List<ProvinceDTO> getAllProvinces();
	
	public ProvinceDTO getProvinceById(Integer id);
}
