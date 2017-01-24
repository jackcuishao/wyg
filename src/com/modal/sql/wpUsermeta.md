sample
===
* 注释

	select #use("cols")# from wp_usermeta where #use("condition")#

cols
===

	umeta_id,user_id,meta_key,meta_value

updateSample
===

	`umeta_id`=#umetaId#,`user_id`=#userId#,`meta_key`=#metaKey#,`meta_value`=#metaValue#

condition
===

	1 = 1  
	@if(!isEmpty(userId)){
	 and `user_id`=#userId#
	@}
	@if(!isEmpty(metaKey)){
	 and `meta_key`=#metaKey#
	@}
	@if(!isEmpty(metaValue)){
	 and `meta_value`=#metaValue#
	@}
	
