package org.spring.sample.dao;

import java.util.List;

import org.spring.sample.dto.MemberVO;

public interface MemberDAO {
    
	public List<MemberVO> selectMember() throws Exception;
    
}
 

