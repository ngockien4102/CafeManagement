package com.example.demo.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailUtils {

    @Autowired
    JavaMailSender mailSender;



}
