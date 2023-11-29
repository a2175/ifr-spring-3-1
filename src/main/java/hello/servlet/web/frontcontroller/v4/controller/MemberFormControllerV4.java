package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.MyHandler;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("/front-controller/v5/v4/members/new-form")
@MyHandler
public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
