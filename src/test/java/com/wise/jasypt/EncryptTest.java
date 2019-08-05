package com.wise.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.intf.service.JasyptStatelessService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class EncryptTest {

	final static JasyptStatelessService service = new JasyptStatelessService();

	/**
	 * 秘钥
	 */
	final static String password = "9e5eb701949a152dabb25af9a21b764f2439fa9dd76437d4209bbee8088a1be5";

	/**
	 * 加密方式
	 */
	final static String algorithm = "PBEWithMD5AndDES";

	@Test
	public void encode() {
		String param = "123456";

		log.debug("加密前的原文：{}", param);

		// 加密
		String result = service.encrypt(
				param,
				password,
				null,
				null,
				algorithm,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null);

		log.debug("加密后的密文：{}", result);
	}

	@Test
	public void decode(){
		String param = "1EnLd3e1TMY2pifbPKVXZg==";

		log.debug("解密前的密文：{}", param);

		// 解密
		String deResult = service.decrypt(
				param,
				password,
				null,
				null,
				algorithm,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null);

		log.debug("解密后的原文：{}", deResult);
	}

}
