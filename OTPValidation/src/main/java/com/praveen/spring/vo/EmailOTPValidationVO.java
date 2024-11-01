package com.praveen.spring.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailOTPValidationVO {
	
	private String email;
	
	private String otp;

}
