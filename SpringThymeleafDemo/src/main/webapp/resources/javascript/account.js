/**
 *  Spring AJAX 
 */
function doAjaxPostDelete(id){
		var idNo = id;
		var page = ${numOfPage};
		var $dialog = $('<div></div>').html('Are you sure delete ID = '+idNo).dialog({
	    	title: "Delete Account ?",
	    	height: 200,
	    	width: 350,
	    	modal: true, 
	    	buttons: [
	    	          {
	    	            text: "No",
	    	            icons: {
	    	              primary: "ui-icon-heart"
	    	            },
	    	            click: function() {
	    	            	$( this ).dialog( "close" );
	    	            	
	    	            } 
	    	          },
	    	          {
	      	            text: "Yes",
	      	            icons: {
	      	              primary: "ui-icon-heart"
	      	            },
	      	            click: function() {
	      	            	$.ajax({
		    	      			  type: "POST",
		    	      			  url: "delete",
		    	      			  data: "id="+idNo + "&record=" + page, 
		    	      			  success: function(response){   
		    	      				  alert(response );  
		    	      	 		  }, 
		    	      	 		  error: function(e){ 
		    	      	 				alert('Error: ' + e); 
		    	      	 		  } 
		    	      			}); 
	      	            	$( this ).dialog( "close" );
	      	            	window.location.replace("${pageContext.request.contextPath}/account/getList");
	      	            } 
	      	          }
	    	        ]
	    	}); 
	} 