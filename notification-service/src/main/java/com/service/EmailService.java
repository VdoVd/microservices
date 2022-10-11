package com.service;

import com.domain.NotificationType;
import com.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {
    void send(NotificationType type, Recipient recipient,String attachment)throws MessagingException, IOException;
}
