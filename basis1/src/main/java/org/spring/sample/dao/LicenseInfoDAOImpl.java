package org.spring.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring.sample.dto.LicenseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LicenseInfoDAOImpl implements LicenseInfoDAO{

	@Autowired
    private SqlSession sqlSession;
    
    private static final String Namespace = "org.spring.sample.T32Mapper";
    
    @Override
	 public List<LicenseInfoVO> selectLicenseList() throws Exception {
 
        return sqlSession.selectList(Namespace+".lisenseInfoList");
    }

	@Override
	public List<LicenseInfoVO> insertLicenseList() throws Exception {
		
		   return sqlSession.selectList(Namespace+".insertLicenseInfo");
	}

	@Override
	public List<LicenseInfoVO> updateLicenseList() throws Exception {
		return sqlSession.selectList(Namespace+".updateLicenseInfo");
	}

	@Override
	public List<LicenseInfoVO> deleteLicenseList() throws Exception {
		return sqlSession.selectList(Namespace+".deleteLicenseInfo");
	}
	

}


