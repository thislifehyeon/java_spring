package com.springboot.api_test.project;

import dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

/*
@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }
}
*/

/*
@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    //http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }
}

 */

//DTO객체를 이용한 POST API

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    //http://localhost:8080/api/v1/post-api/member2
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}