package com.lab.spring.boot.infrastructure.projects.component.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Portal Controller
 * 
 * @author Martin
 * @since 1.0.0
 */
@Controller
public class PortalController {

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String index() {
        return "index";
    }
}
