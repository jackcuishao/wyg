sample
===
* 注释

	select #use("cols")# from wp_options where #use("condition")#

cols
===

	option_id,option_name,option_value,autoload

updateSample
===

	`option_id`=#optionId#,`option_name`=#optionName#,`option_value`=#optionValue#,`autoload`=#autoload#

condition
===

	1 = 1  
	@if(!isEmpty(optionName)){
	 and `option_name`=#optionName#
	@}
	@if(!isEmpty(optionValue)){
	 and `option_value`=#optionValue#
	@}
	@if(!isEmpty(autoload)){
	 and `autoload`=#autoload#
	@}
	
