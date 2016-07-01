package mx.com.chilitech.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import mx.com.chilitech.validation.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class TestController {

	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String addCustomer(@Valid Customer customer, BindingResult result){
		if(result.hasErrors()) {
			return "signUpForm";
		} else {
			return "Done";
		}
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String displayCustomerForm(ModelMap model){
		model.addAttribute("customer", new Customer());
		return "SignUpForm";
	}
}
