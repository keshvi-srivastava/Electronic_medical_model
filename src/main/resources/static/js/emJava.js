function showCustomer() {
	
  var obj, dbParam, xmlhttp, myObj, x, txt = "";	
  obj = { "table":"Successful", "limit":20 };
  dbParam = JSON.stringify(obj); 
  xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
    	myObj = JSON.parse(xmlhttp.responseText);
    	
    	
    	console.log(myObj);
    	//console.log(myObj[0]);
    	document.getElementById("userId").innerHTML = myObj.id;
    	document.getElementById("DOB").innerHTML = myObj.dob;
    	document.getElementById("bloodGroup").innerHTML = myObj.bloodGroup;
    	document.getElementById("aadhar").innerHTML = myObj.aadharCard;
    	document.getElementById("allergies").innerHTML = myObj.allergies;
    	document.getElementById("insurances").innerHTML = myObj.insuranceDetails;
    	document.getElementById("name1").innerHTML = myObj.contact1[0].name;
    	document.getElementById("relation1").innerHTML = myObj.contact1[0].relation;
    	document.getElementById("number1").innerHTML = myObj.contact1[0].number;
    	document.getElementById("name2").innerHTML = myObj.contact2[0].name;
    	document.getElementById("relation2").innerHTML = myObj.contact2[0].relation;
    	document.getElementById("number2").innerHTML = myObj.contact2[0].number;
    	//document.getElementById("emergencyNo").innerHTML = contact1.name;
    	
    }
  };
  xmlhttp.open("POST", "http://localhost:8090/Emergency", true);
  xmlhttp.setRequestHeader("Content-type", "application/JSON");
  xmlhttp.send("x=" + dbParam);
  
}

