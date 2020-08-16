package org.spring.sample.service;

import java.util.List;

import javax.inject.Inject;

import org.spring.sample.dao.MemberDAO;
import org.spring.sample.dto.MemberVO;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember() throws Exception {
 
        return dao.selectMember();
    }
 
}
