$(function(){
	
	$("#yMonthSel").on("change", function(){
		
		var yMonth = $("#yMonthSel option:selected").val();
		location.href = "getAllRevenueByyMonth.do?yMonth="+yMonth;
		
	});
	
});