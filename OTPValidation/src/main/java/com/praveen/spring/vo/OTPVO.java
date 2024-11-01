package com.praveen.spring.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OTPVO {
	
	    private Long id;

	    private String otp;

	    private String email;
	    
	    private LocalDateTime sentTime;

	    private LocalDateTime expirationTime;

}
