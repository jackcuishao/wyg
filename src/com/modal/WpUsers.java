package com.modal;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2017-01-23
*/
public class WpUsers   implements Serializable{
	//自增唯一ID
	private Long id ;
	//用户状态
	private Integer userStatus ;
	//显示名称
	private String displayName ;
	//激活码
	private String userActivationKey ;
	//Email
	private String userEmail ;
	//登录名
	private String userLogin ;
	//昵称
	private String userNicename ;
	//密码
	private String userPass ;
	//网址
	private String userUrl ;
	//注册时间
	private Date userRegistered ;
	
	public WpUsers() {
	}
	
	public Long getId(){
		return  id;
	}
	public void setId(Long id ){
		this.id = id;
	}
	
	public Integer getUserStatus(){
		return  userStatus;
	}
	public void setUserStatus(Integer userStatus ){
		this.userStatus = userStatus;
	}
	
	public String getDisplayName(){
		return  displayName;
	}
	public void setDisplayName(String displayName ){
		this.displayName = displayName;
	}
	
	public String getUserActivationKey(){
		return  userActivationKey;
	}
	public void setUserActivationKey(String userActivationKey ){
		this.userActivationKey = userActivationKey;
	}
	
	public String getUserEmail(){
		return  userEmail;
	}
	public void setUserEmail(String userEmail ){
		this.userEmail = userEmail;
	}
	
	public String getUserLogin(){
		return  userLogin;
	}
	public void setUserLogin(String userLogin ){
		this.userLogin = userLogin;
	}
	
	public String getUserNicename(){
		return  userNicename;
	}
	public void setUserNicename(String userNicename ){
		this.userNicename = userNicename;
	}
	
	public String getUserPass(){
		return  userPass;
	}
	public void setUserPass(String userPass ){
		this.userPass = userPass;
	}
	
	public String getUserUrl(){
		return  userUrl;
	}
	public void setUserUrl(String userUrl ){
		this.userUrl = userUrl;
	}
	
	public Date getUserRegistered(){
		return  userRegistered;
	}
	public void setUserRegistered(Date userRegistered ){
		this.userRegistered = userRegistered;
	}
	
	
	

}
