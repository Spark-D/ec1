package com.plateer.ec1.member.service.impl;

import com.plateer.ec1.member.dto.Member;
import com.plateer.ec1.member.repository.MemberRepository;
import com.plateer.ec1.member.repository.MemoryMemberRepository;
import com.plateer.ec1.member.service.MemberService;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
