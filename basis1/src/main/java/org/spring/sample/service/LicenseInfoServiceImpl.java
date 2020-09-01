package org.spring.sample.service;

import java.util.List;

import org.spring.sample.dao.LicenseInfoDAO;
import org.spring.sample.dto.LicenseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseInfoServiceImpl implements LicenseInfoService {

	@Autowired
    private LicenseInfoDAO dao;
    
    
	@Override
	public List<LicenseInfoVO> selectLicenseList() throws Exception {
		
		return dao.selectLicenseList();
		
	}

}
