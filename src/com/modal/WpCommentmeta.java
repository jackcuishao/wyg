package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpCommentmeta   implements Serializable{
	private Long metaId ;
	private Long commentId ;
	private String metaKey ;
	private String metaValue ;
	
	public WpCommentmeta() {
	}
	
	public Long getMetaId(){
		return  metaId;
	}
	public void setMetaId(Long metaId ){
		this.metaId = metaId;
	}
	
	public Long getCommentId(){
		return  commentId;
	}
	public void setCommentId(Long commentId ){
		this.commentId = commentId;
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
	
	
	

}
