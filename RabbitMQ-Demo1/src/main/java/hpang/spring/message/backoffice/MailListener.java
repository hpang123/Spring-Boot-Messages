package hpang.spring.message.backoffice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hpang.spring.message.model.Mail;

public class MailListener {
	private static final Logger log = LoggerFactory.getLogger(BackOfficeRunner.class);
	
    public void displayMail(Mail mail) {
        log.info("Received: " + mail);
    }
}
