package org.spring.sample.service;

import java.util.List;

import org.spring.sample.dto.MemberVO;

public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}

