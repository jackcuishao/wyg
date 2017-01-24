sample
===
* 注释

	select #use("cols")# from wp_terms where #use("condition")#

cols
===

	term_id,name,slug,term_group

updateSample
===

	`term_id`=#termId#,`name`=#name#,`slug`=#slug#,`term_group`=#termGroup#

condition
===

	1 = 1  
	@if(!isEmpty(name)){
	 and `name`=#name#
	@}
	@if(!isEmpty(slug)){
	 and `slug`=#slug#
	@}
	@if(!isEmpty(termGroup)){
	 and `term_group`=#termGroup#
	@}
	
