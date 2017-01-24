package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpUsermeta   implements Serializable{
	//自增唯一ID
	private Long umetaId ;
	//键名
	private String metaKey ;
	//键值
	private String metaValue ;
	//对应用户ID
	private Long userId ;
	
	public WpUsermeta() {
	}
	
	public Long getUmetaId(){
		return  umetaId;
	}
	public void setUmetaId(Long umetaId ){
		this.umetaId = umetaId;
	}
	
	public String getMetaKey(){
		return  metaKey;
	}
	public void setMetaKey(String metaKey ){
		this.metaKey = metaKey;
	}
	
	public String getMetaValue(){
		return  metaValue;
	}
	public void setMetaValue(String metaValue ){
		this.metaValue = metaValue;
	}
	
	public Long getUserId(){
		return  userId;
	}
	public void setUserId(Long userId ){
		this.userId = userId;
	}
	
	
	

}
