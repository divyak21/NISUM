package com.nisum.divyak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/scope")
public class MyController {

    @Autowired
    private MyBean singletonBean;

    @Autowired
    @Scope("prototype")
    private MyBean prototypeBean;

    @Autowired
    @Scope("request")
    private MyBean requestBean;

    @Autowired
    @Scope("session")
    private MyBean sessionBean;

    @GetMapping
    @ResponseBody
    public String showBeans(HttpSession session) {
        return "<pre>"
                + "Singleton Bean ID: " + singletonBean.getId() + "\n"
                + "Prototype Bean ID: " + prototypeBean.getId() + "\n"
                + "Request Bean ID: " + requestBean.getId() + "\n"
                + "Session Bean ID: " + sessionBean.getId() + "\n"
                + "</pre>";
    }
}
