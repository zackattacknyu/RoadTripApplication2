/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zdestefano.roadtrip.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */

/**
 *
 * @author Zach
 */
@Controller
public class HelloWorld {
    
    @RequestMapping("/index2")
    public ModelAndView helloWorld() {

            String message = "<br><div style='text-align:center;'>"
                            + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
            return new ModelAndView("index2", "message", message);
    }
    
    
}
