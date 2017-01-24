sample
===
* 注释

	select #use("cols")# from wp_commentmeta where #use("condition")#

cols
===

	meta_id,comment_id,meta_key,meta_value

updateSample
===

	`meta_id`=#metaId#,`comment_id`=#commentId#,`meta_key`=#metaKey#,`meta_value`=#metaValue#

condition
===

	1 = 1  
	@if(!isEmpty(commentId)){
	 and `comment_id`=#commentId#
	@}
	@if(!isEmpty(metaKey)){
	 and `meta_key`=#metaKey#
	@}
	@if(!isEmpty(metaValue)){
	 and `meta_value`=#metaValue#
	@}
	
