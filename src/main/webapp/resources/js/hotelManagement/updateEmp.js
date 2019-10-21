$(function(){
	
	$("#promoBtn").on("click", function(){
		$("#promotionEmp").css("visibility", "visible");
		$("#cancelDiv").css("visibility", "visible");
	});
	
	$("#cancelBtn").on("click", function(){
		$("#promotionEmp").css("visibility", "hidden");
		$("#cancelDiv").css("visibility", "hidden");
	});
	
});