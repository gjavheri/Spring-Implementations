package org.gsssoft.springkycapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class KYCController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getlogin(){
		return new ModelAndView("login");
	}

	
	@RequestMapping(value="/kycform",method=RequestMethod.GET)
	public ModelAndView getKYCform(){
		return new ModelAndView("CustomerKyc");
	}

	@RequestMapping(value="/kycform",method=RequestMethod.POST)
	public ModelAndView submitKYCform(){
		return new ModelAndView("CustomerKyc");
	}
	
	

}
