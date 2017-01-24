sample
===
* 注释

	select #use("cols")# from wp_termmeta where #use("condition")#

cols
===

	meta_id,term_id,meta_key,meta_value

updateSample
===

	`meta_id`=#metaId#,`term_id`=#termId#,`meta_key`=#metaKey#,`meta_value`=#metaValue#

condition
===

	1 = 1  
	@if(!isEmpty(termId)){
	 and `term_id`=#termId#
	@}
	@if(!isEmpty(metaKey)){
	 and `meta_key`=#metaKey#
	@}
	@if(!isEmpty(metaValue)){
	 and `meta_value`=#metaValue#
	@}
	
