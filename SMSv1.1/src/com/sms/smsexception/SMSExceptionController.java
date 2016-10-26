package com.sms.smsexception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SMSExceptionController {

	private Logger logger = Logger.getLogger(SMSExceptionController.class);
	
	@ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String internalServerErrorException(RuntimeException ex) {
		logger.error(ex.getMessage());
		ex.printStackTrace();
        return "error/page_500";
    }
	
}
