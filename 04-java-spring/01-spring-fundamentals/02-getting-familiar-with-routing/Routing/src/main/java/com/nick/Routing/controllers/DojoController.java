package com.nick.Routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	
		@RequestMapping("")
		public String dojo() {
			return "the dojo is awesome";
		}
		
		@RequestMapping(value="/{location}", method=RequestMethod.GET)
		private String location(@PathVariable("location") String location) {
				if(location.equals("burbank")) {
					return "Burbank Dojo is located in Souther California";
				}
				else if (location.equals("san-jose")) {
					return "SJ dojo is the headquarters";
				}
				else {
					return "invalid location";
				}	
		}		
}
