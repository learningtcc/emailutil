package com.markliu.emailutil.emailsender;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.markliu.emailutil.entities.EmailServerHostAndPort;
import com.markliu.emailutil.entities.EmailServerInfo;
import com.markliu.emailutil.entities.ReadEmailInfo;
import com.markliu.emailutil.util.SendEmailTemplate;

/**
 * 
 * 
 * @auther SunnyMarkLiu
 * @time Apr 12, 2016 10:57:13 PM
 */
public class ReadEmailTest {

	@Test
	public void testReadEmailTemplate() throws FileNotFoundException {
		EmailServerInfo emailServerInfo = new EmailServerInfo();
		emailServerInfo.setMailServerHost(EmailServerHostAndPort.NetEase163_POP3_SERVER);
		emailServerInfo.setMailServerPort(EmailServerHostAndPort.POP3_PORT);
		emailServerInfo.setValidate(true);
		emailServerInfo.setUserName("SunnyMarkLiu@163.com");
		emailServerInfo.setPassword("sqmmjlqwd992101"); // 注意使用的是开通 SMTP 协议的授权码
		emailServerInfo.setMyEmailAddress("SunnyMarkLiu@163.com");		
		
		ReadEmailInfo emailInfo = SendEmailTemplate.getLatestOneEmailInfo(emailServerInfo);
		System.out.println(emailInfo.toString());
	}
}
