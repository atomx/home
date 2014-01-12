$(document).ready(function(){
	  	  $("#b1").click(function(){
		     $("p").hide(1000);
		  });
		  
		  $("#b2").click(function(){
			  $("p").toggle(1000);
		  });
		  
		  $("#b3").click(function(){
			  $("p").fadeToggle("slow");

		  });
		  $("#b4").click(function(){
			    $("p").slideToggle("slow");
		  });
		  $("#b5").click(function(){
			    $("#div1").animate({			    	
			    	left:'250px',
			        opacity:'0.5',
			        height:'150px',
			        width:'150px'
		            });
		 });	    
		 $("#b6").click(function(){
			        var div=$("#div1");
			        div.animate({height:'300px',opacity:'0.4'},"slow");
			        div.animate({width:'300px',opacity:'0.8'},"slow");
			        div.animate({height:'100px',opacity:'0.4'},"slow");
			        div.animate({width:'100px',opacity:'0.8'},"slow");
			      });	    
		
		  $("#b7").click(function(){
		        var div=$("#div2");
		        div.animate({height:'200px',top:'200px'},"slow");   
		        div.animate({height:'180px',top:'220px'},"slow");
		        
		      });
		  
		  $("#b8").click(function(){
		        var div=$("#div3");
		     
		        div.animate({height:div.attr("h"),top:div.attr("t")},"slow");   
		        //div.animate({height:'180px',top:'220px'},"slow");
		        
		      });
		  $("#b9").click(function(){
			    $("#div9").empty();
		  });
		  $("#b10").click(function(){
			    $("#div9").append("<p>new content</p>");
		  });

});
		  




