package com.nick.Counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//...
    public String count(HttpSession session){
    	  // check if a key exists in session with the name "count"
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);}
        // first retrieve the current value in session, casting from Object to Integer
        Integer currentCount = (Integer) session.getAttribute("count");
        // increment count by 1
        currentCount++;
        // set the updated count value back into session
        session.setAttribute("count", currentCount);
        return currentCount.toString();
    }
    // ...
    @RequestMapping("/")
    public String welcome() {
    	return "index.jsp";
    }
    
    @RequestMapping("/counter")
    public String counter() {
    	return "counter.jsp";
    }
    
}
