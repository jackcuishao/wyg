package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpOptions   implements Serializable{
	//自增唯一ID
	private Long optionId ;
	//在WordPress载入时自动载入（yes/no）
	private String autoload ;
	//键名
	private String optionName ;
	//键值
	private String optionValue ;
	
	public WpOptions() {
	}
	
	public Long getOptionId(){
		return  optionId;
	}
	public void setOptionId(Long optionId ){
		this.optionId = optionId;
	}
	
	public String getAutoload(){
		return  autoload;
	}
	public void setAutoload(String autoload ){
		this.autoload = autoload;
	}
	
	public String getOptionName(){
		return  optionName;
	}
	public void setOptionName(String optionName ){
		this.optionName = optionName;
	}
	
	public String getOptionValue(){
		return  optionValue;
	}
	public void setOptionValue(String optionValue ){
		this.optionValue = optionValue;
	}
	
	
	

}
