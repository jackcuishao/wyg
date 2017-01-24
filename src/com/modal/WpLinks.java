package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpLinks   implements Serializable{
	private Long linkId ;
	private Integer linkRating ;
	private String linkDescription ;
	private String linkImage ;
	private String linkName ;
	private String linkNotes ;
	private Long linkOwner ;
	private String linkRel ;
	private String linkRss ;
	private String linkTarget ;
	private String linkUrl ;
	private String linkVisible ;
	private Date linkUpdated ;
	
	public WpLinks() {
	}
	
	public Long getLinkId(){
		return  linkId;
	}
	public void setLinkId(Long linkId ){
		this.linkId = linkId;
	}
	
	public Integer getLinkRating(){
		return  linkRating;
	}
	public void setLinkRating(Integer linkRating ){
		this.linkRating = linkRating;
	}
	
	public String getLinkDescription(){
		return  linkDescription;
	}
	public void setLinkDescription(String linkDescription ){
		this.linkDescription = linkDescription;
	}
	
	public String getLinkImage(){
		return  linkImage;
	}
	public void setLinkImage(String linkImage ){
		this.linkImage = linkImage;
	}
	
	public String getLinkName(){
		return  linkName;
	}
	public void setLinkName(String linkName ){
		this.linkName = linkName;
	}
	
	public String getLinkNotes(){
		return  linkNotes;
	}
	public void setLinkNotes(String linkNotes ){
		this.linkNotes = linkNotes;
	}
	
	public Long getLinkOwner(){
		return  linkOwner;
	}
	public void setLinkOwner(Long linkOwner ){
		this.linkOwner = linkOwner;
	}
	
	public String getLinkRel(){
		return  linkRel;
	}
	public void setLinkRel(String linkRel ){
		this.linkRel = linkRel;
	}
	
	public String getLinkRss(){
		return  linkRss;
	}
	public void setLinkRss(String linkRss ){
		this.linkRss = linkRss;
	}
	
	public String getLinkTarget(){
		return  linkTarget;
	}
	public void setLinkTarget(String linkTarget ){
		this.linkTarget = linkTarget;
	}
	
	public String getLinkUrl(){
		return  linkUrl;
	}
	public void setLinkUrl(String linkUrl ){
		this.linkUrl = linkUrl;
	}
	
	public String getLinkVisible(){
		return  linkVisible;
	}
	public void setLinkVisible(String linkVisible ){
		this.linkVisible = linkVisible;
	}
	
	public Date getLinkUpdated(){
		return  linkUpdated;
	}
	public void setLinkUpdated(Date linkUpdated ){
		this.linkUpdated = linkUpdated;
	}
	
	
	

}
