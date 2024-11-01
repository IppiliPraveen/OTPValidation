package com.praveen.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.praveen.spring.entity.OTP;

public interface EmailOTPValidationRepository extends JpaRepository<OTP, Long>{

	@Query(name = "OTP.findLatestValidOtpByEmail")
	OTP findLatestValidOtpByEmail(@Param("email") String email);
	
}
