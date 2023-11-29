package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyHandler;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component("/front-controller/v5/v3/members/new-form")
@MyHandler
public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
