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
	public List<LicenseInfoVO> selectLicenseList(LicenseInfoVO vo) throws Exception {
		
		return dao.selectLicenseList(vo);
	}


	@Override
	public void insertLicenseList(LicenseInfoVO vo) throws Exception {
		dao.insertLicenseList(vo);
	}


	@Override
	public void updateLicenseList(LicenseInfoVO vo) throws Exception {
		dao.updateLicenseList(vo);
	}


	@Override
	public void deleteLicenseList(LicenseInfoVO vo) throws Exception {
		dao.deleteLicenseList(vo);
	}

}
