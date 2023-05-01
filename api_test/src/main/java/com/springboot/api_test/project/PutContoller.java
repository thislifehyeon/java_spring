package com.springboot.api_test.project;

import dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.Map;
import java.util.Objects;

/*
@RestController
@RequestMapping("/api/v1/put-api")
public class PutContoller {
    //http://localhost:8080/api/v1/put-api/member

    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " +map.getValue() + "\n");
        });
        return sb.toString();
    }
}


 */

//DTO이용한 PUT구현

//1. return 값이 String 타입

@RestController
@RequestMapping("/api/v1/put-api")
public class PutContoller {
    //http://localhost:8080/api/v1/put-api/member1
    @PutMapping(value = "/member1")
    public String postMemberDTO1(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
    //return 값이 DTO객체타입
    //http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/member2")
    public MemberDto postMemberDTO2(@RequestBody MemberDto memberDto){
        return memberDto;
    }
    //RestController 어노테이션이 지정된 클래스는 ResponseBody를 생략할 수 있는데 이 ResponseBody는 자동으로 JSOSN으로 변환해줌
}


