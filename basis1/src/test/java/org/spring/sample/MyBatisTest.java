package org.spring.sample;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.sample.dto.LicenseInfoVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest 
{
    @Inject
    private SqlSessionFactory sqlFactory;
    
    @Test
    public void testFactory(){
        System.out.println("\n >>>>>>>>>> sqlFactory 출력 : "+sqlFactory);
    }
    
    @Test
    public void testSession() throws Exception{
        
        try(SqlSession session = sqlFactory.openSession()){
            
            System.out.println(" >>>>>>>>>> session 출력 : "+session+"\n");
            
            LicenseInfoVO vo = new LicenseInfoVO();
            vo.setLicenseName("testName");
            vo.setLicenseType("testType");
            vo.setSerialNumber("testserial");
            
            session.insert("org.spring.sample.T32Mapper.insertLicenseInfo", vo);
            session.commit();

        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
