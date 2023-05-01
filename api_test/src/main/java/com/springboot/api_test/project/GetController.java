package com.springboot.api_test.project;

import dto.MemberDto;
import org.springframework.web.bind.annotation.*;


/*
//1.단순 요청 테스트
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World_get api";
    }
}

*/


//2.uri에 값 전달하기
/*
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/var1/{String 값}
    @GetMapping(value = "/var1/{var}")
    public String getVar1(@PathVariable String var) {
        return var;
    }
}
 */
//GetMapping 어노테이션으로 URl을 입력할 때 중괄호로 어느 위치에서 값을 받을 지 정해야 한다.
//매개변수와 값을 연결하기 위해 @PathVariabe을 명시한다


//3.만약 GetMapping 어노테이션의 변수와 메서드 매개변수의 이름이 동일하기 어렵다면 PathVariable 뒤에 괄호로 GetMapping 변수명을 지정한다.
/*
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/var2/{String 값}
    @GetMapping(value = "/var2/{var}")
    public String getVar2(@PathVariable("var") String var2) {  //var -> var2
        return var2;
    }
}
*/

//4.@RequestParam으로 Get매서드 구현
//URI 경로에 값을 담지 않고 쿼리 형식으로 요청 보내기
//? 를 기준으로 우측에 키 = 값
/*
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/req1?name=value1&email=value2&organization=value3/
    @GetMapping(value = "/req1")
    public String getReqParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

}
*/

//5.쿼리 스트링에 어떤 값이 올지 모르면 Map 객체를 이용 가능

/*
@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/req2?key1=value1&key2=value2/
    @GetMapping(value = "/req2")
    public String getReqParam2(@RequestParam Map<String, String> param)
    {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }
}
//매개 변수 항목이 일정하지 않을 경우 ex)선택 사항에 공란 - Map 객체로 값을 받는 것이 효율적이다
 */



//6. DTO객체를 활용한 GET메서드 구현
// DTO Data Transfer Object 의 약자 - 클래스 및 인터페이스를 호출하면서 전달하는 매개변수로 사용되는 데이터 객체. 데이터를 교환하는 용도로만 이용된다.
//DTO와 VO(Value Object) - Vo는 읽기전용으로 만들어 신뢰성을 유지



@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/req3?name=value1&email=value2&organization=value3
    @GetMapping(value = "/req3")
    public String getReqParam3(MemberDto memberDto) {
        //return memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
        return memberDto.toString();
    }
}