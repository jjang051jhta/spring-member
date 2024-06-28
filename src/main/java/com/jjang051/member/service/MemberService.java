package com.jjang051.member.service;

import com.jjang051.member.dto.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberService {
    public static final Map<Integer, Member> memberStore = new HashMap<>();
    private static Integer sequence = 0;
    //1, new Member("jjang051","장성호","1234","2024/06/27");
    public Member saveMember(Member member) {
        member.setIdx(++sequence);
        memberStore.put(member.getIdx(), member);
        return  member;
    }
}
