package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpTermRelationships   implements Serializable{
	//对应文章ID/链接ID
	private Long objectId ;
	//对应分类方法ID
	private Long termTaxonomyId ;
	//排序
	private Integer termOrder ;
	
	public WpTermRelationships() {
	}
	
	public Long getObjectId(){
		return  objectId;
	}
	public void setObjectId(Long objectId ){
		this.objectId = objectId;
	}
	
	public Long getTermTaxonomyId(){
		return  termTaxonomyId;
	}
	public void setTermTaxonomyId(Long termTaxonomyId ){
		this.termTaxonomyId = termTaxonomyId;
	}
	
	public Integer getTermOrder(){
		return  termOrder;
	}
	public void setTermOrder(Integer termOrder ){
		this.termOrder = termOrder;
	}
	
	
	

}
