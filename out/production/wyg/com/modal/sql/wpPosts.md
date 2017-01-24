sample
===
* 注释

	select #use("cols")# from wp_posts where #use("condition")#

cols
===

	ID,post_author,post_date,post_date_gmt,post_content,post_title,post_excerpt,post_status,comment_status,ping_status,post_password,post_name,to_ping,pinged,post_modified,post_modified_gmt,post_content_filtered,post_parent,guid,menu_order,post_type,post_mime_type,comment_count

updateSample
===

	`ID`=#id#,`post_author`=#postAuthor#,`post_date`=#postDate#,`post_date_gmt`=#postDateGmt#,`post_content`=#postContent#,`post_title`=#postTitle#,`post_excerpt`=#postExcerpt#,`post_status`=#postStatus#,`comment_status`=#commentStatus#,`ping_status`=#pingStatus#,`post_password`=#postPassword#,`post_name`=#postName#,`to_ping`=#toPing#,`pinged`=#pinged#,`post_modified`=#postModified#,`post_modified_gmt`=#postModifiedGmt#,`post_content_filtered`=#postContentFiltered#,`post_parent`=#postParent#,`guid`=#guid#,`menu_order`=#menuOrder#,`post_type`=#postType#,`post_mime_type`=#postMimeType#,`comment_count`=#commentCount#

condition
===

	1 = 1  
	@if(!isEmpty(postAuthor)){
	 and `post_author`=#postAuthor#
	@}
	@if(!isEmpty(postDate)){
	 and `post_date`=#postDate#
	@}
	@if(!isEmpty(postDateGmt)){
	 and `post_date_gmt`=#postDateGmt#
	@}
	@if(!isEmpty(postContent)){
	 and `post_content`=#postContent#
	@}
	@if(!isEmpty(postTitle)){
	 and `post_title`=#postTitle#
	@}
	@if(!isEmpty(postExcerpt)){
	 and `post_excerpt`=#postExcerpt#
	@}
	@if(!isEmpty(postStatus)){
	 and `post_status`=#postStatus#
	@}
	@if(!isEmpty(commentStatus)){
	 and `comment_status`=#commentStatus#
	@}
	@if(!isEmpty(pingStatus)){
	 and `ping_status`=#pingStatus#
	@}
	@if(!isEmpty(postPassword)){
	 and `post_password`=#postPassword#
	@}
	@if(!isEmpty(postName)){
	 and `post_name`=#postName#
	@}
	@if(!isEmpty(toPing)){
	 and `to_ping`=#toPing#
	@}
	@if(!isEmpty(pinged)){
	 and `pinged`=#pinged#
	@}
	@if(!isEmpty(postModified)){
	 and `post_modified`=#postModified#
	@}
	@if(!isEmpty(postModifiedGmt)){
	 and `post_modified_gmt`=#postModifiedGmt#
	@}
	@if(!isEmpty(postContentFiltered)){
	 and `post_content_filtered`=#postContentFiltered#
	@}
	@if(!isEmpty(postParent)){
	 and `post_parent`=#postParent#
	@}
	@if(!isEmpty(guid)){
	 and `guid`=#guid#
	@}
	@if(!isEmpty(menuOrder)){
	 and `menu_order`=#menuOrder#
	@}
	@if(!isEmpty(postType)){
	 and `post_type`=#postType#
	@}
	@if(!isEmpty(postMimeType)){
	 and `post_mime_type`=#postMimeType#
	@}
	@if(!isEmpty(commentCount)){
	 and `comment_count`=#commentCount#
	@}
	
