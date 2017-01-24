sample
===
* 注释

	select #use("cols")# from wp_comments where #use("condition")#

cols
===

	comment_ID,comment_post_ID,comment_author,comment_author_email,comment_author_url,comment_author_IP,comment_date,comment_date_gmt,comment_content,comment_karma,comment_approved,comment_agent,comment_type,comment_parent,user_id

updateSample
===

	`comment_ID`=#commentId#,`comment_post_ID`=#commentPostId#,`comment_author`=#commentAuthor#,`comment_author_email`=#commentAuthorEmail#,`comment_author_url`=#commentAuthorUrl#,`comment_author_IP`=#commentAuthorIp#,`comment_date`=#commentDate#,`comment_date_gmt`=#commentDateGmt#,`comment_content`=#commentContent#,`comment_karma`=#commentKarma#,`comment_approved`=#commentApproved#,`comment_agent`=#commentAgent#,`comment_type`=#commentType#,`comment_parent`=#commentParent#,`user_id`=#userId#

condition
===

	1 = 1  
	@if(!isEmpty(commentPostId)){
	 and `comment_post_ID`=#commentPostId#
	@}
	@if(!isEmpty(commentAuthor)){
	 and `comment_author`=#commentAuthor#
	@}
	@if(!isEmpty(commentAuthorEmail)){
	 and `comment_author_email`=#commentAuthorEmail#
	@}
	@if(!isEmpty(commentAuthorUrl)){
	 and `comment_author_url`=#commentAuthorUrl#
	@}
	@if(!isEmpty(commentAuthorIp)){
	 and `comment_author_IP`=#commentAuthorIp#
	@}
	@if(!isEmpty(commentDate)){
	 and `comment_date`=#commentDate#
	@}
	@if(!isEmpty(commentDateGmt)){
	 and `comment_date_gmt`=#commentDateGmt#
	@}
	@if(!isEmpty(commentContent)){
	 and `comment_content`=#commentContent#
	@}
	@if(!isEmpty(commentKarma)){
	 and `comment_karma`=#commentKarma#
	@}
	@if(!isEmpty(commentApproved)){
	 and `comment_approved`=#commentApproved#
	@}
	@if(!isEmpty(commentAgent)){
	 and `comment_agent`=#commentAgent#
	@}
	@if(!isEmpty(commentType)){
	 and `comment_type`=#commentType#
	@}
	@if(!isEmpty(commentParent)){
	 and `comment_parent`=#commentParent#
	@}
	@if(!isEmpty(userId)){
	 and `user_id`=#userId#
	@}
	
