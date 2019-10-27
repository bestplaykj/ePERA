$(function(){
	
	var date = new Date();
	
	var oriIdate = new Date($("#RSViDate").val());
	var oriM = oriIdate.getMonth()+1;
	if(oriM < 10){
		oriM = "0"+oriM;
	}
	var oriD = oriIdate.getDate();
	if(oriD < 10){
		oriD = "0"+oriD;
	}
	var oriI = oriIdate.getFullYear()+"-"+oriM+"-"+oriD;
	
	var oriOdate = new Date($("#RSVoDate").val());
	var oriOM = oriOdate.getMonth()+1;
	if(oriOM < 10){
		oriOM = "0"+oriOM;
	}
	var oriOD = oriOdate.getDate();
	if(oriOD < 10){
		oriOD = "0"+oriOD;
	}
	var oriO = oriIdate.getFullYear()+"-"+oriOM+"-"+oriOD;
	
	
	$("#RSViDate").on("change", function(){
		
		var idate = new Date($("#RSViDate").val());
		
		var diff = (idate.getTime() - date.getTime()) / (1000*60*60*24);
		if(diff < 0){
			alert("unable to select")
			$("#RSViDate").val(oriI);
		}else{
			var odate = new Date($("#RSVoDate").val());
			var diff = odate.getTime() - idate.getTime();
			var night = diff / (1000*60*60*24);
			
			if(diff < 1){
				alert("unable to select");
				$("#RSViDate").val(oriI);
			}else{
				$("#RSVnight").val(night);
				var price = $("#RSVprice").val();
				$("#RSVsales").val(price*night);
			}
		}
		
	});
	
	
	$("#RSVoDate").on("change", function(){
		
		var idate = new Date($("#RSViDate").val());
		var odate = new Date($("#RSVoDate").val());
		
		var diff = odate.getTime() - idate.getTime();
		var night = diff / (1000*60*60*24);
		
		if(diff < 1){
			alert("unable to select");
			$("#RSVoDate").val(oriO);
		}else{
			$("#RSVnight").val(night);
			var price = $("#RSVprice").val();
			$("#RSVsales").val(price*night);
		}
				
	});
	
	
	$("#roomSel").on("change", function(){
		
		var sel = $("#roomSel option:selected").val();
		var night = $("#RSVnight").val();
		
		$.ajax({
			url:"getRSVpirce.do",
			data:{type:sel},
			type:"post",
			success:function(data){
				if(data > 0){
					var price = data;
					$("#RSVprice").val(price);
					$("#RSVsales").val(price*night);
				}else{
					alert("응 안됨");
				}
			},
			error:function(){console.log("응 안됨");}
		});
		
	});
	
	
	$("#RSVnight").on("change", function(){
		
		var night = $("#RSVnight").val();
		var price = $("#RSVprice").val();
		
		$("#RSVsales").val(price*night);
		
	});
	
		
});