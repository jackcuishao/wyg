sample
===
* 注释

	select #use("cols")# from wp_term_relationships where #use("condition")#

cols
===

	object_id,term_taxonomy_id,term_order

updateSample
===

	`object_id`=#objectId#,`term_taxonomy_id`=#termTaxonomyId#,`term_order`=#termOrder#

condition
===

	1 = 1  
	@if(!isEmpty(termOrder)){
	 and `term_order`=#termOrder#
	@}
	
