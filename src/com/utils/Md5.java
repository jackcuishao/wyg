package com.utils;

import java.security.MessageDigest;

/**
 * Created by tinshen on 14-5-7.
 */
public class Md5 {
	
	/** 
	* @Title: getMD5 
	* @Description: TODO(使用MD5算法进行加密) 
	* @param s - 源字符串
	* @return  加密后的字符串
	* @date 2014年10月30日 下午2:57:36 
	* @author 谭志伟 
	*/ 
	public final static String getMD5(String s) {
		char hexDigits[] = { '8', '6' , '2', '1', '6', '1', '6', '0', '5', '9', '6',
				'9', 'd', 'o', 'n', 'g'};
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
	

}
