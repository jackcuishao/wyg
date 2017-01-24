package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpPosts   implements Serializable{
	//自增唯一ID
	private Long id ;
	//排序ID
	private Integer menuOrder ;
	//评论总数
	private Long commentCount ;
	//评论状态（open/closed）
	private String commentStatus ;
	private String guid ;
	//PING状态（open/closed）
	private String pingStatus ;
	//已经PING过的链接
	private String pinged ;
	//对应作者ID
	private Long postAuthor ;
	//正文
	private String postContent ;
	private String postContentFiltered ;
	//摘录
	private String postExcerpt ;
	//MIME类型
	private String postMimeType ;
	//文章缩略名
	private String postName ;
	//父文章，主要用于PAGE
	private Long postParent ;
	//文章密码
	private String postPassword ;
	//文章状态（publish/auto-draft/inherit等）
	private String postStatus ;
	//标题
	private String postTitle ;
	//文章类型（post/page等）
	private String postType ;
	private String toPing ;
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
	
	public String getCommentStatus(){
		return  commentStatus;
	}
	public void setCommentStatus(String commentStatus ){
		this.commentStatus = commentStatus;
	}
	
	public String getGuid(){
		return  guid;
	}
	public void setGuid(String guid ){
		this.guid = guid;
	}
	
	public String getPingStatus(){
		return  pingStatus;
	}
	public void setPingStatus(String pingStatus ){
		this.pingStatus = pingStatus;
	}
	
	public String getPinged(){
		return  pinged;
	}
	public void setPinged(String pinged ){
		this.pinged = pinged;
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
	
	public String getPostContentFiltered(){
		return  postContentFiltered;
	}
	public void setPostContentFiltered(String postContentFiltered ){
		this.postContentFiltered = postContentFiltered;
	}
	
	public String getPostExcerpt(){
		return  postExcerpt;
	}
	public void setPostExcerpt(String postExcerpt ){
		this.postExcerpt = postExcerpt;
	}
	
	public String getPostMimeType(){
		return  postMimeType;
	}
	public void setPostMimeType(String postMimeType ){
		this.postMimeType = postMimeType;
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
	
	public String getPostPassword(){
		return  postPassword;
	}
	public void setPostPassword(String postPassword ){
		this.postPassword = postPassword;
	}
	
	public String getPostStatus(){
		return  postStatus;
	}
	public void setPostStatus(String postStatus ){
		this.postStatus = postStatus;
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
	
	public String getToPing(){
		return  toPing;
	}
	public void setToPing(String toPing ){
		this.toPing = toPing;
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
