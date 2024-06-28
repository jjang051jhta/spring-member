package com.jjang051.member.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private int idx;
    private String userId;
    private String userName;
    private String userPw;
    private String birth;
}
