package com.sms.institutionModule.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sms.dto.InstitutionDto;
import com.sms.institutionModule.service.InstitutionService;
import com.sms.model.Institution;
import com.sms.utility.SMSUtility;

@Controller
public class InstitutionController {

	private Logger logger = Logger.getLogger(InstitutionController.class);
	
	@Autowired
	private InstitutionService institutionService;
	
	@Autowired
    private ReloadableResourceBundleMessageSource errorCodeSource;
	
	@Autowired
    private ReloadableResourceBundleMessageSource successCodeSource;

	@RequestMapping(value = "/institutionSetUp", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		org.springframework.security.core.userdetails.User user = (User) authentication.getPrincipal();
		model.put("institutionForm", new InstitutionDto());
		return "institution/institutionSetUp";
	}

	@RequestMapping(value = "/saveInstitution", method = RequestMethod.POST)
	public String saveInstitution(@ModelAttribute("institutionForm")@Validated InstitutionDto institutionDtoObj,ModelMap model) throws InstantiationException, IllegalAccessException, InvocationTargetException{
		String code = "InstitutionControllersaveInstitution";
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		org.springframework.security.core.userdetails.User user = (User) authentication.getPrincipal();
		Institution institutionObj = SMSUtility.convert(institutionDtoObj, Institution.class);
		institutionObj.setCreatedBy(0L);
		try {
			Map returnMap = institutionService.createInstituion(institutionObj);
			if(returnMap.get("errorCode")!=null && !((String)returnMap.get("errorCode")).equals("")){
				model.put("errMsg",errorCodeSource.getMessage(code,null,Locale.US));
			}	else{
				model.put("successMsg",successCodeSource.getMessage(code,null,Locale.US));
			}
		} catch (Exception e) {
			logger.error("Exception -"+code+"-"+e.getMessage());
			model.put("errMsg",errorCodeSource.getMessage(code,null,Locale.US));
		}
		model.put("institutionForm", new InstitutionDto());
		return "institution/institutionSetUp";
	}

	

}
