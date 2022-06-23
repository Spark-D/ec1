package com.plateer.ec1.member.repository;

import com.plateer.ec1.member.dto.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private Map<Long, Member> store = new HashMap<>(); // 동시성 이슈있을수 있다. todo. ConcurrentHashMap로 대체

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
