function showCustomer() {
	
  var obj, dbParam, xmlhttp, myObj, x, txt = "";	
  obj = { "table":"Successful", "limit":20 };
  dbParam = JSON.stringify(obj); 
  xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
    	myObj = JSON.parse(xmlhttp.responseText);
    	console.log(myObj);
    	var col = [];
        for (var i = 0; i < myObj.length; i++) {
            for (var key in myObj[i]) {
                if (col.indexOf(key) === -1) {
                    col.push(key);
                }
            }
        }
        console.log(col);
        // CREATE DYNAMIC TABLE.
        var table = document.createElement("table");

        // CREATE HTML TABLE HEADER ROW USING THE EXTRACTED HEADERS ABOVE.

        var tr = table.insertRow(-1);                   // TABLE ROW.

        for (var i = 0; i < col.length; i++) {
            var th = document.createElement("th");      // TABLE HEADER.
            th.innerHTML = col[i];
            tr.appendChild(th);
        }

        // ADD JSON DATA TO THE TABLE AS ROWS.
        for (var i = 0; i < myObj.length; i++) {

            tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) {
                var tabCell = tr.insertCell(-1);
                tabCell.innerHTML = myObj[i][col[j]];
            }
        }

        // FINALLY ADD THE NEWLY CREATED TABLE WITH JSON DATA TO A CONTAINER.
        var divContainer = document.getElementById("showData");
        divContainer.innerHTML = "";
        divContainer.appendChild(table);
    }
  };
  xmlhttp.open("POST", "http://localhost:8090/Vaccine", true);
  xmlhttp.setRequestHeader("Content-type", "application/JSON");
  xmlhttp.send("x=" + dbParam);  
}

