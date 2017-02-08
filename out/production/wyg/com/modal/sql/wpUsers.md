sample
===
* 注释

	select #use("cols")# from wp_users where #use("condition")#

cols
===

	ID,user_login,user_pass,user_nicename,user_email,user_url,user_registered,user_activation_key,user_status,display_name

updateSample
===

	`ID`=#id#,`user_login`=#userLogin#,`user_pass`=#userPass#,`user_nicename`=#userNicename#,`user_email`=#userEmail#,`user_url`=#userUrl#,`user_registered`=#userRegistered#,`user_activation_key`=#userActivationKey#,`user_status`=#userStatus#,`display_name`=#displayName#

condition
===

	1 = 1  
	@if(!isEmpty(userLogin)){
	 and `user_login`=#userLogin#
	@}
	@if(!isEmpty(userPass)){
	 and `user_pass`=#userPass#
	@}
	@if(!isEmpty(userNicename)){
	 and `user_nicename`=#userNicename#
	@}
	@if(!isEmpty(userEmail)){
	 and `user_email`=#userEmail#
	@}
	@if(!isEmpty(userUrl)){
	 and `user_url`=#userUrl#
	@}
	@if(!isEmpty(userRegistered)){
	 and `user_registered`=#userRegistered#
	@}
	@if(!isEmpty(userActivationKey)){
	 and `user_activation_key`=#userActivationKey#
	@}
	@if(!isEmpty(userStatus)){
	 and `user_status`=#userStatus#
	@}
	@if(!isEmpty(displayName)){
	 and `display_name`=#displayName#
	@}
	
queryWpUser
===
select * from wp_users where #use("condition")# order by id desc 

queryWpUser$count
===
select count(*) from wp_users where #use("condition")#
