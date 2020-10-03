package org.spring.sample.service;

import java.util.List;

import org.spring.sample.dto.LicenseInfoVO;
import org.springframework.stereotype.Service;

public interface LicenseInfoService {

	 public List<LicenseInfoVO> selectLicenseList(LicenseInfoVO vo) throws Exception;
	 public void insertLicenseList(LicenseInfoVO vo) throws Exception;
	 public void updateLicenseList(LicenseInfoVO vo) throws Exception;
	 public void deleteLicenseList(LicenseInfoVO vo) throws Exception;
	 
	 
	 
	 
	
}
