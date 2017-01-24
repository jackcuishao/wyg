package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpComments   implements Serializable{
	//自增唯一ID
	private Long commentId ;
	private Integer commentKarma ;
	//评论者的USER AGENT
	private String commentAgent ;
	//评论是否被批准
	private String commentApproved ;
	//评论者
	private String commentAuthor ;
	//评论者IP
	private String commentAuthorIp ;
	//评论者邮箱
	private String commentAuthorEmail ;
	//评论者网址
	private String commentAuthorUrl ;
	//评论正文
	private String commentContent ;
	//父评论ID
	private Long commentParent ;
	//对应文章ID
	private Long commentPostId ;
	//评论类型(pingback/普通)
	private String commentType ;
	//评论者用户ID（不一定存在）
	private Long userId ;
	//评论时间
	private Date commentDate ;
	//评论时间（GMT+0时间）
	private Date commentDateGmt ;
	
	public WpComments() {
	}
	
	public Long getCommentId(){
		return  commentId;
	}
	public void setCommentId(Long commentId ){
		this.commentId = commentId;
	}
	
	public Integer getCommentKarma(){
		return  commentKarma;
	}
	public void setCommentKarma(Integer commentKarma ){
		this.commentKarma = commentKarma;
	}
	
	public String getCommentAgent(){
		return  commentAgent;
	}
	public void setCommentAgent(String commentAgent ){
		this.commentAgent = commentAgent;
	}
	
	public String getCommentApproved(){
		return  commentApproved;
	}
	public void setCommentApproved(String commentApproved ){
		this.commentApproved = commentApproved;
	}
	
	public String getCommentAuthor(){
		return  commentAuthor;
	}
	public void setCommentAuthor(String commentAuthor ){
		this.commentAuthor = commentAuthor;
	}
	
	public String getCommentAuthorIp(){
		return  commentAuthorIp;
	}
	public void setCommentAuthorIp(String commentAuthorIp ){
		this.commentAuthorIp = commentAuthorIp;
	}
	
	public String getCommentAuthorEmail(){
		return  commentAuthorEmail;
	}
	public void setCommentAuthorEmail(String commentAuthorEmail ){
		this.commentAuthorEmail = commentAuthorEmail;
	}
	
	public String getCommentAuthorUrl(){
		return  commentAuthorUrl;
	}
	public void setCommentAuthorUrl(String commentAuthorUrl ){
		this.commentAuthorUrl = commentAuthorUrl;
	}
	
	public String getCommentContent(){
		return  commentContent;
	}
	public void setCommentContent(String commentContent ){
		this.commentContent = commentContent;
	}
	
	public Long getCommentParent(){
		return  commentParent;
	}
	public void setCommentParent(Long commentParent ){
		this.commentParent = commentParent;
	}
	
	public Long getCommentPostId(){
		return  commentPostId;
	}
	public void setCommentPostId(Long commentPostId ){
		this.commentPostId = commentPostId;
	}
	
	public String getCommentType(){
		return  commentType;
	}
	public void setCommentType(String commentType ){
		this.commentType = commentType;
	}
	
	public Long getUserId(){
		return  userId;
	}
	public void setUserId(Long userId ){
		this.userId = userId;
	}
	
	public Date getCommentDate(){
		return  commentDate;
	}
	public void setCommentDate(Date commentDate ){
		this.commentDate = commentDate;
	}
	
	public Date getCommentDateGmt(){
		return  commentDateGmt;
	}
	public void setCommentDateGmt(Date commentDateGmt ){
		this.commentDateGmt = commentDateGmt;
	}
	
	
	

}
