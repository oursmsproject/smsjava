package com.sms.smsexception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SMSErrorController {

	@RequestMapping(value = "/error403", method = RequestMethod.GET)
	public String error403() {
		return "error/page_403";
	}
	
	@RequestMapping(value = "/error404", method = RequestMethod.GET)
	public String error404() {
		return "error/page_404";
	}
	
	@RequestMapping(value = "/error500", method = RequestMethod.GET)
	public String error500() {
		return "error/page_500";
	}
}
