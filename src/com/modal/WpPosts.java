package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-25
*/
public class WpPosts   implements Serializable{
	//自增唯一ID
	private Long id ;
	//排序ID
	private Integer menuOrder ;
	//评论总数
	private Long commentCount ;
	//标签
	private String label ;
	//特色图URL
	private String picUrl ;
	//对应作者ID
	private Long postAuthor ;
	//正文
	private String postContent ;
	//摘录
	private String postExcerpt ;
	//文章缩略名
	private String postName ;
	//父文章，主要用于PAGE
	private Long postParent ;
	//标题
	private String postTitle ;
	//文章类型（post/page等）
	private String postType ;
	//推广链接
	private String promoteLink ;
	//发布时间
	private Date postDate ;
	//发布时间（GMT+0时间）
	private Date postDateGmt ;
	//修改时间
	private Date postModified ;
	//修改时间（GMT+0时间）
	private Date postModifiedGmt ;
	
	public WpPosts() {
	}
	
	public Long getId(){
		return  id;
	}
	public void setId(Long id ){
		this.id = id;
	}
	
	public Integer getMenuOrder(){
		return  menuOrder;
	}
	public void setMenuOrder(Integer menuOrder ){
		this.menuOrder = menuOrder;
	}
	
	public Long getCommentCount(){
		return  commentCount;
	}
	public void setCommentCount(Long commentCount ){
		this.commentCount = commentCount;
	}
	
	public String getLabel(){
		return  label;
	}
	public void setLabel(String label ){
		this.label = label;
	}
	
	public String getPicUrl(){
		return  picUrl;
	}
	public void setPicUrl(String picUrl ){
		this.picUrl = picUrl;
	}
	
	public Long getPostAuthor(){
		return  postAuthor;
	}
	public void setPostAuthor(Long postAuthor ){
		this.postAuthor = postAuthor;
	}
	
	public String getPostContent(){
		return  postContent;
	}
	public void setPostContent(String postContent ){
		this.postContent = postContent;
	}
	
	public String getPostExcerpt(){
		return  postExcerpt;
	}
	public void setPostExcerpt(String postExcerpt ){
		this.postExcerpt = postExcerpt;
	}
	
	public String getPostName(){
		return  postName;
	}
	public void setPostName(String postName ){
		this.postName = postName;
	}
	
	public Long getPostParent(){
		return  postParent;
	}
	public void setPostParent(Long postParent ){
		this.postParent = postParent;
	}
	
	public String getPostTitle(){
		return  postTitle;
	}
	public void setPostTitle(String postTitle ){
		this.postTitle = postTitle;
	}
	
	public String getPostType(){
		return  postType;
	}
	public void setPostType(String postType ){
		this.postType = postType;
	}
	
	public String getPromoteLink(){
		return  promoteLink;
	}
	public void setPromoteLink(String promoteLink ){
		this.promoteLink = promoteLink;
	}
	
	public Date getPostDate(){
		return  postDate;
	}
	public void setPostDate(Date postDate ){
		this.postDate = postDate;
	}
	
	public Date getPostDateGmt(){
		return  postDateGmt;
	}
	public void setPostDateGmt(Date postDateGmt ){
		this.postDateGmt = postDateGmt;
	}
	
	public Date getPostModified(){
		return  postModified;
	}
	public void setPostModified(Date postModified ){
		this.postModified = postModified;
	}
	
	public Date getPostModifiedGmt(){
		return  postModifiedGmt;
	}
	public void setPostModifiedGmt(Date postModifiedGmt ){
		this.postModifiedGmt = postModifiedGmt;
	}
	
	
	

}
