sample
===
* 注释

	select #use("cols")# from wp_postmeta where #use("condition")#

cols
===

	meta_id,post_id,meta_key,meta_value

updateSample
===

	`meta_id`=#metaId#,`post_id`=#postId#,`meta_key`=#metaKey#,`meta_value`=#metaValue#

condition
===

	1 = 1  
	@if(!isEmpty(postId)){
	 and `post_id`=#postId#
	@}
	@if(!isEmpty(metaKey)){
	 and `meta_key`=#metaKey#
	@}
	@if(!isEmpty(metaValue)){
	 and `meta_value`=#metaValue#
	@}
	
