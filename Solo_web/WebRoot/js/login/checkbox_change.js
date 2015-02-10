$(function(){
function changeCheckBox(){
	$('div .clearfix').each(function(){
		var inputCheckbox = $(this).find('input[type="checkbox"]');
		$(this).find('i').click(function(){
			if(inputCheckbox!=null){
				var value = inputCheckbox.val();
				if(value.trim()=='on'){
					inputCheckbox.val('off');
					$(this).removeClass();
					$(this).addClass('checkboxui checkboxui-disabled');
				}else{
					inputCheckbox.val('on');
					$(this).removeClass();
					$(this).addClass('checkboxui checkboxui-checked');
				}
			}
		
		});
	});
}
changeCheckBox();

});