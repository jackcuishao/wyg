package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpTerms   implements Serializable{
	//分类ID
	private Long termId ;
	//分类名
	private String name ;
	//缩略名
	private String slug ;
	private Long termGroup ;
	
	public WpTerms() {
	}
	
	public Long getTermId(){
		return  termId;
	}
	public void setTermId(Long termId ){
		this.termId = termId;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public String getSlug(){
		return  slug;
	}
	public void setSlug(String slug ){
		this.slug = slug;
	}
	
	public Long getTermGroup(){
		return  termGroup;
	}
	public void setTermGroup(Long termGroup ){
		this.termGroup = termGroup;
	}
	
	
	

}
