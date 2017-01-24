package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpTermmeta   implements Serializable{
	private Long metaId ;
	private String metaKey ;
	private String metaValue ;
	private Long termId ;
	
	public WpTermmeta() {
	}
	
	public Long getMetaId(){
		return  metaId;
	}
	public void setMetaId(Long metaId ){
		this.metaId = metaId;
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
	
	public Long getTermId(){
		return  termId;
	}
	public void setTermId(Long termId ){
		this.termId = termId;
	}
	
	
	

}
