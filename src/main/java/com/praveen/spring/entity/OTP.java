package com.praveen.spring.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "otp")
@NamedQueries({
    @NamedQuery(
        name = "OTP.findLatestValidOtpByEmail",
        query = "SELECT ot FROM OTP ot WHERE ot.email = :email AND ot.expirationTime >= CURRENT_TIMESTAMP ORDER BY ot.sentTime DESC"
    )
})
public class OTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "otp")
    private String otp;

    @Column(name = "email")
    private String email;
    
    @Column(name = "sent_time")
    private LocalDateTime sentTime;

    @Column(name = "expiration_time")
    private LocalDateTime expirationTime;

    @PrePersist
    public void prePersist() {
        this.sentTime = LocalDateTime.now();
        this.expirationTime = this.sentTime.plusMinutes(10);
    }
}
