sample
===
* 注释

	select #use("cols")# from wp_posts where #use("condition")#

cols
===

	ID,post_author,post_date,post_date_gmt,post_content,post_title,post_excerpt,post_name,post_modified,post_modified_gmt,post_parent,menu_order,post_type,comment_count,promote_link,label,pic_url

updateSample
===

	`ID`=#id#,`post_author`=#postAuthor#,`post_date`=#postDate#,`post_date_gmt`=#postDateGmt#,`post_content`=#postContent#,`post_title`=#postTitle#,`post_excerpt`=#postExcerpt#,`post_name`=#postName#,`post_modified`=#postModified#,`post_modified_gmt`=#postModifiedGmt#,`post_parent`=#postParent#,`menu_order`=#menuOrder#,`post_type`=#postType#,`comment_count`=#commentCount#,`promote_link`=#promoteLink#,`label`=#label#,`pic_url`=#picUrl#

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
	@if(!isEmpty(postName)){
	 and `post_name`=#postName#
	@}
	@if(!isEmpty(postModified)){
	 and `post_modified`=#postModified#
	@}
	@if(!isEmpty(postModifiedGmt)){
	 and `post_modified_gmt`=#postModifiedGmt#
	@}
	@if(!isEmpty(postParent)){
	 and `post_parent`=#postParent#
	@}
	@if(!isEmpty(menuOrder)){
	 and `menu_order`=#menuOrder#
	@}
	@if(!isEmpty(postType)){
	 and `post_type`=#postType#
	@}
	@if(!isEmpty(commentCount)){
	 and `comment_count`=#commentCount#
	@}
	@if(!isEmpty(promoteLink)){
	 and `promote_link`=#promoteLink#
	@}
	@if(!isEmpty(label)){
	 and `label`=#label#
	@}
	@if(!isEmpty(picUrl)){
	 and `pic_url`=#picUrl#
	@}
	
