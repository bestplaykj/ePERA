$(function(){
	
	$("#yMonthSel").on("change", function(){
		
		var yMonth = $("#yMonthSel option:selected").val();
		location.href = "getAllExpensesByyMonth.do?yMonth="+yMonth;
		
	});
	
});