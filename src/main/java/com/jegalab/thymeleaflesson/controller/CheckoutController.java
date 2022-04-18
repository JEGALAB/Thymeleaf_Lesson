package com.jegalab.thymeleaflesson.controller;

import com.jegalab.thymeleaflesson.comands.CheckoutCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CheckoutController {

    @RequestMapping("/checkoutform")
    public String checkoutFrom(Model model){
        model.addAttribute("checkoutCommand", new CheckoutCommand());
        return "checkoutForm";
    }


    @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "checkoutForm";
        }

        return "checkoutComplete";
    }
}
