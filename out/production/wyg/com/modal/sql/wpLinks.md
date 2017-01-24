sample
===
* 注释

	select #use("cols")# from wp_links where #use("condition")#

cols
===

	link_id,link_url,link_name,link_image,link_target,link_description,link_visible,link_owner,link_rating,link_updated,link_rel,link_notes,link_rss

updateSample
===

	`link_id`=#linkId#,`link_url`=#linkUrl#,`link_name`=#linkName#,`link_image`=#linkImage#,`link_target`=#linkTarget#,`link_description`=#linkDescription#,`link_visible`=#linkVisible#,`link_owner`=#linkOwner#,`link_rating`=#linkRating#,`link_updated`=#linkUpdated#,`link_rel`=#linkRel#,`link_notes`=#linkNotes#,`link_rss`=#linkRss#

condition
===

	1 = 1  
	@if(!isEmpty(linkUrl)){
	 and `link_url`=#linkUrl#
	@}
	@if(!isEmpty(linkName)){
	 and `link_name`=#linkName#
	@}
	@if(!isEmpty(linkImage)){
	 and `link_image`=#linkImage#
	@}
	@if(!isEmpty(linkTarget)){
	 and `link_target`=#linkTarget#
	@}
	@if(!isEmpty(linkDescription)){
	 and `link_description`=#linkDescription#
	@}
	@if(!isEmpty(linkVisible)){
	 and `link_visible`=#linkVisible#
	@}
	@if(!isEmpty(linkOwner)){
	 and `link_owner`=#linkOwner#
	@}
	@if(!isEmpty(linkRating)){
	 and `link_rating`=#linkRating#
	@}
	@if(!isEmpty(linkUpdated)){
	 and `link_updated`=#linkUpdated#
	@}
	@if(!isEmpty(linkRel)){
	 and `link_rel`=#linkRel#
	@}
	@if(!isEmpty(linkNotes)){
	 and `link_notes`=#linkNotes#
	@}
	@if(!isEmpty(linkRss)){
	 and `link_rss`=#linkRss#
	@}
	
