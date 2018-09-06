function addproduct(){
		var product=document.getElementById("product").value.trim().toLowerCase();
		var model=document.getElementById("model").value.trim();
		var os=document.getElementById("os").value.trim();
		var ram=document.getElementById("ram").value.trim();
		var camera=document.getElementById("camera").value.trim();
		var feature=document.getElementById("features").value.trim();
		var price=document.getElementById("price").value.trim();
		if(product==="" || model==="" || os==="" || ram==="" || camera==="" || feature==="" || price===""){
			window.alert("Fields cannot be Empty!");
			location.reload();
		} else{
			var temp=localStorage.getItem(product);
			if(temp == null){
			localStorage.setItem(product,model);
			var osname=model+" os";
			var ramdetail=model+" ram";
			var cameradetail=model+" camera";
			var featuress=model+" features";
			var cost=model+" price";
			localStorage.setItem(osname,os);
			localStorage.setItem(ramdetail,ram);
			localStorage.setItem(cameradetail,camera);
			localStorage.setItem(featuress,feature);
			localStorage.setItem(cost,price);
			window.alert("Product Added");
			location.reload();
			} else{
				var products=temp.split(" ");
				var flag=false;
				for(var i=0;i<products.length;i++){
					if(products[i] === model){
						flag=true;
						break;
					}
				}
				if(flag === true){
					window.alert("Model already exists!");
					location.reload();
				} else{
					temp=temp+" "+model;
					localStorage.setItem(product,temp);
					var osname=model+" os";
					var ramdetail=model+" ram";
					var cameradetail=model+" camera";
					var featuress=model+" features";
					var cost=model+" price";
					localStorage.setItem(osname,os);
					localStorage.setItem(ramdetail,ram);
					localStorage.setItem(cameradetail,camera);
					localStorage.setItem(featuress,feature);
					localStorage.setItem(cost,price);
					window.alert("Product Added!");
					location.reload();
				}
			}
		}
	}