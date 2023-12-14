package com.service;

import com.bean.EmailDetials;

public interface EmailService {
	String sendSimpleMail(EmailDetials details);
	 
    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetials details);

}
