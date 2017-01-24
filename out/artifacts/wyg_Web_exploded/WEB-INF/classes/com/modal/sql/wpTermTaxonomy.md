sample
===
* 注释

	select #use("cols")# from wp_term_taxonomy where #use("condition")#

cols
===

	term_taxonomy_id,term_id,taxonomy,description,parent,count

updateSample
===

	`term_taxonomy_id`=#termTaxonomyId#,`term_id`=#termId#,`taxonomy`=#taxonomy#,`description`=#description#,`parent`=#parent#,`count`=#count#

condition
===

	1 = 1  
	@if(!isEmpty(termId)){
	 and `term_id`=#termId#
	@}
	@if(!isEmpty(taxonomy)){
	 and `taxonomy`=#taxonomy#
	@}
	@if(!isEmpty(description)){
	 and `description`=#description#
	@}
	@if(!isEmpty(parent)){
	 and `parent`=#parent#
	@}
	@if(!isEmpty(count)){
	 and `count`=#count#
	@}
	
