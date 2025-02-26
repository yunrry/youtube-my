package io.goorm.youtubemy.service;

import io.goorm.youtubemy.mapper.MemberMapper;
import io.goorm.youtubemy.vo.DefaultVO;
import io.goorm.youtubemy.vo.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MemberService {


    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    public List<Member> findAll(DefaultVO defaultVO) {

        int totalCount = memberMapper.selectCount();
        defaultVO.setTotalCount(totalCount);
        defaultVO.setOffset();

        return memberMapper.selectAll(defaultVO);
    }

    public Member login(Member member) {

        return memberMapper.selectByMemberId(member.getMemberId());
    }

    public Member find(Long memberSeq) {

        return memberMapper.selectById(memberSeq);
    }

    public boolean existsById(String memberId) {
        return memberMapper.existsById(memberId);
    }

    public int save(Member member) {

        return memberMapper.insert(member);
    }

    public int update(Member member) {

        return memberMapper.update(member);
    }

    public int updatePublishYn(Member member) {

        return memberMapper.updateUseYn(member);
    }

}
