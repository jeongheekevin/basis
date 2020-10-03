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
	 public List<LicenseInfoVO> selectLicenseList(LicenseInfoVO vo) throws Exception {
 
        return sqlSession.selectList(Namespace+".selectlisenseInfo",vo);
    }

	@Override
	public void insertLicenseList(LicenseInfoVO vo) throws Exception {
		
		  sqlSession.insert(Namespace+".insertLicenseInfo",vo);
	}

	@Override
	public void updateLicenseList(LicenseInfoVO vo) throws Exception {
		sqlSession.update(Namespace+".updateLicenseInfo",vo);
	}

	@Override
	public void deleteLicenseList(LicenseInfoVO vo) throws Exception {
		sqlSession.delete(Namespace+".deleteLicenseInfo",vo);
	}
	

}


