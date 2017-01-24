package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpTermTaxonomy   implements Serializable{
	//分类方法ID
	private Long termTaxonomyId ;
	//文章数统计
	private Long count ;
	private String description ;
	//所属父分类方法ID
	private Long parent ;
	//分类方法(category/post_tag)
	private String taxonomy ;
	private Long termId ;
	
	public WpTermTaxonomy() {
	}
	
	public Long getTermTaxonomyId(){
		return  termTaxonomyId;
	}
	public void setTermTaxonomyId(Long termTaxonomyId ){
		this.termTaxonomyId = termTaxonomyId;
	}
	
	public Long getCount(){
		return  count;
	}
	public void setCount(Long count ){
		this.count = count;
	}
	
	public String getDescription(){
		return  description;
	}
	public void setDescription(String description ){
		this.description = description;
	}
	
	public Long getParent(){
		return  parent;
	}
	public void setParent(Long parent ){
		this.parent = parent;
	}
	
	public String getTaxonomy(){
		return  taxonomy;
	}
	public void setTaxonomy(String taxonomy ){
		this.taxonomy = taxonomy;
	}
	
	public Long getTermId(){
		return  termId;
	}
	public void setTermId(Long termId ){
		this.termId = termId;
	}
	
	
	

}
