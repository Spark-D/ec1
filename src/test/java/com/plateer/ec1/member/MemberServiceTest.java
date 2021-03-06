package com.plateer.ec1.member;

import com.plateer.ec1.member.dto.Member;
import com.plateer.ec1.member.enums.Grade;
import com.plateer.ec1.member.service.MemberService;
import com.plateer.ec1.member.service.impl.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    // todo. ocp, dip 원칙을 준수하는가? 개방폐쇄원칙, 의존역전원칙
    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "spark", Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
