package org.spring.sample.service;

import java.util.List;

import org.spring.sample.dto.LicenseInfoVO;
import org.springframework.stereotype.Service;

public interface LicenseInfoService {

	 public List<LicenseInfoVO> selectLicenseList() throws Exception;
	 public List<LicenseInfoVO> insertLicenseList() throws Exception;
	 public List<LicenseInfoVO> updateLicenseList() throws Exception;
	 public List<LicenseInfoVO> deleteLicenseList() throws Exception;
	 
	 
	 
	 
	
}
