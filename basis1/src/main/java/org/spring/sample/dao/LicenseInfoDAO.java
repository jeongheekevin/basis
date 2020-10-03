package org.spring.sample.dao;

import java.util.List;

import org.spring.sample.dto.LicenseInfoVO;

public interface LicenseInfoDAO {

	 public List<LicenseInfoVO> selectLicenseList(LicenseInfoVO vo) throws Exception;
	 public void insertLicenseList(LicenseInfoVO vo) throws Exception;
	 public void updateLicenseList(LicenseInfoVO vo) throws Exception;
	 public void deleteLicenseList(LicenseInfoVO vo) throws Exception;
		
	 
	 
}
