package com.example.naulmont.twilio;

import com.example.naulmont.configuration.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("TwilioSms")
public class TwilioSmsSender  implements SmsSender{

    private final TwilioConfiguration twilioConfiguration;
    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {
        if(isPhoneNumberValid(smsRequest.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator messageCreator = Message.creator(to, from, message);
            messageCreator.create();
        } else {
            throw new IllegalArgumentException(
                    "Phone number [" + smsRequest.getPhoneNumber() + "] is not valid"
            );
        }
        LOGGER.info("Send sms {}" + smsRequest);
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return true;
    }
}
