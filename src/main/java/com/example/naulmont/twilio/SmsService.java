package com.example.naulmont.twilio;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SmsService {

    private final SmsSender smsSender;

    public void sendSms(@Qualifier("twilio") SmsRequest smsRequest){
        smsSender.sendSms(smsRequest);
    }
}
