package com.plateer.ec1.member.service;

import com.plateer.ec1.member.dto.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
