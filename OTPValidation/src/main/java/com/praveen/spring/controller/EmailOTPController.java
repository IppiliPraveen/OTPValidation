package com.praveen.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveen.spring.service.EmailSenderService;
import com.praveen.spring.vo.EmailOTPRequestVO;
import com.praveen.spring.vo.OTPVO;

@RestController
@RequestMapping("/otpAPI/email")
public class EmailOTPController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/send")
    public OTPVO sendMail(@RequestBody EmailOTPRequestVO emailRequest) {
    	
    	OTPVO otpVO = new OTPVO();
    	otpVO = emailSenderService.sendMail(emailRequest.getToMail(), emailRequest.getSubject(), emailRequest.getBody());
    	
    	if(otpVO!=null)
    		return otpVO;
        return null;
    }
    
    @PostMapping("/validate")
    public String validateOTP(@RequestBody EmailOTPRequestVO emailRequest) {
    	
        return "Validating OTP";
    }
}
