package org.spring.sample.dao;

import java.util.List;

import org.spring.sample.dto.LicenseInfoVO;

public interface LicenseInfoDAO {

	 public List<LicenseInfoVO> selectLicenseList() throws Exception;
	 public List<LicenseInfoVO> insertLicenseList() throws Exception;
	 public List<LicenseInfoVO> updateLicenseList() throws Exception;
	 public List<LicenseInfoVO> deleteLicenseList() throws Exception;
		
	 
	 
}
