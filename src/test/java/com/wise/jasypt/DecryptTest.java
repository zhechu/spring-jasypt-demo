package com.wise.jasypt;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecryptTest extends BaseTest {

	@Value("${pwd:}")
	private String pwd;

	@Test
	public void jasypt() {
		// 打印 pwd 明文
		log.debug("\n\npwd : {}\n", pwd);
	}

}
