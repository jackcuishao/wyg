package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpPostmeta   implements Serializable{
	//自增唯一ID
	private Long metaId ;
	//键名
	private String metaKey ;
	//键值
	private String metaValue ;
	//对应文章ID
	private Long postId ;
	
	public WpPostmeta() {
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
	
	public Long getPostId(){
		return  postId;
	}
	public void setPostId(Long postId ){
		this.postId = postId;
	}
	
	
	

}
