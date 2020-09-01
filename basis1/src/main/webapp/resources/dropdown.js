$("div.select > a").click(function() {
    $(this).next("ul").toggle();
    return false;
});
 
$("div.select > ul > li").click(function() {
    $(this).parent().hide().parent("div.select").children("a").text($(this).text());
    $(this).prependTo($(this).parent());
});


$(function(){
	
	  $(".Type").on("change", function(){
	  
		 if($(this).val() != "AURIX"){
	    	//$(".serial").show();
	      $(".serial").removeAttr("disabled");
	    }
	    else{
	    		 $(".serial").attr("disabled", "disabled");
	    	}
		
	    $(".name").attr("disabled", "disabled");
	    
	  });
	  
	  
	  
	  $(".serial").on("change", function(){
	    if($(this).val() != ""){
	    	//$(".begin-time").show();
	      $(".name").removeAttr("disabled");
	    }
	    else{
	      $(".name").attr("disabled", "disabled");
	    }
	  });
	  
	  
	  
	  $(".serial").attr("disabled", "disabled");
	  $(".name").attr("disabled", "disabled");
	  
	});