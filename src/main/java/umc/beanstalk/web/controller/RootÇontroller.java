package umc.beanstalk.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootÇontroller {

    @GetMapping("health")
    public String healthCheck(){
        return "I'm healthy sibal gae siba gesibal ahahah!";
    }
}


