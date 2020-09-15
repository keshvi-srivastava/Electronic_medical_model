function showCustomer(str) {
	
  var obj, dbParam, xmlhttp, myObj, x, txt = "";	
  obj = { "table":str, "limit":20 };
  dbParam = JSON.stringify(obj); 
  if (str == "") {
    document.getElementById("demo").innerHTML = "";
    return;
  }
  xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
    	var hello = xmlhttp.responseText;
    	myObj = JSON.parse(xmlhttp.responseText);
    	console.log(myObj);
    	var col = [];
        for (var key in myObj[0]) {
        	if (col.indexOf(key) === -1) {
        		col.push(key);
            }
        }
        var table = document.createElement("table");
        console.log(col);
        var tr = table.insertRow(-1);
        for (var i = 0; i < col.length; i++) {
            var th = document.createElement("th");      // TABLE HEADER.
            th.innerHTML = col[i];
            tr.appendChild(th);
        }
        tr = table.insertRow(-1);

        for (var j = 0; j < col.length; j++) {
            var tabCell = tr.insertCell(-1);
            tabCell.innerHTML = myObj[0][col[j]];
        }
        var divContainer = document.getElementById("showData");
        divContainer.innerHTML = "";
        divContainer.appendChild(table);
    }
  };
  if (str == "Thy")
	  xmlhttp.open("POST", "http://localhost:8090/thyroidReport", true);
  else if (str == "Dia")
	  xmlhttp.open("POST", "http://localhost:8090/diabetesReport", true);	  
  else if (str == "Vit")
	  xmlhttp.open("POST", "http://localhost:8090/vitaminReport", true);
  xmlhttp.setRequestHeader("Content-type", "application/JSON");
  xmlhttp.send("x=" + dbParam);
}