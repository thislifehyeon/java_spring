package com.springboot.api_test.project;

import dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {
    //http://localhost:8080/api/v1/delete-api/{String값}
    @DeleteMapping(value = "/{var}")
    public String DeleteVariable(@PathVariable String var){
        return var;
    }
}