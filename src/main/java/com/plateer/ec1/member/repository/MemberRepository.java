package com.plateer.ec1.member.repository;

import com.plateer.ec1.member.dto.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
