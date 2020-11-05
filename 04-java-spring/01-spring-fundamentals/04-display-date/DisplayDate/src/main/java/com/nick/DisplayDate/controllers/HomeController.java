package com.nick.DisplayDate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model dateModel) {
		Date dt = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, yyyy");
		dateModel.addAttribute("date", df.format(dt));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model timeModel) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("hh:mm a");
		timeModel.addAttribute("time", df.format(date));
		return "time.jsp";
	}
	
}

