function showCustomer() {
	
  var obj, dbParam, xmlhttp, myObj, x, txt = "",tabCell;	
  var btnUpdate, btnSave, btnNew, btnDel;
  var row=13;
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
        key="Update";
        col.push(key);
        // CREATE DYNAMIC TABLE.
        var table = document.createElement("table");
        table.id = "myTable";

        // CREATE HTML TABLE HEADER ROW USING THE EXTRACTED HEADERS ABOVE.

        var tr = table.insertRow(-1);                   // TABLE ROW.

        for (var i = 0; i < col.length; i++) {
            var th = document.createElement("th");      // TABLE HEADER.
            th.innerHTML = col[i];
            tr.appendChild(th);
        }

        // ADD JSON DATA TO THE TABLE AS ROWS.
        myObj.forEach(function(curr, i) {

            tr = table.insertRow(-1);
            tabCell = null;
            for (var j = 0; j < col.length-1; j++) {
                tabCell = tr.insertCell(-1);
                tabCell.innerHTML = curr[col[j]];
            }
            tabCell = tr.insertCell(-1);
            btnUpdate = document.createElement("BUTTON");
            var t = document.createTextNode("Update");
            btnUpdate.setAttribute("id", "updateBtn"+i);
            btnUpdate.appendChild(t);
            tabCell.appendChild(btnUpdate);
            btnUpdate.addEventListener("click", function () {
            	
            	edit_row(i);
            	
            });
            btnSave = document.createElement("BUTTON");
            var t = document.createTextNode("Save");
            btnSave.setAttribute("id", "saveBtn"+i);
            btnSave.appendChild(t);
            tabCell.appendChild(btnSave);
            btnSave.addEventListener("click", function () {
            	
            	save_row(i);
            	
            });
            btnDel = document.createElement("BUTTON");
            var t = document.createTextNode("Delete");
            btnDel.setAttribute("id", "delBtn"+i);
            btnDel.appendChild(t);
            tabCell.appendChild(btnDel);
            btnDel.addEventListener("click", function () {
            	
            	delete_row(i+1);
            	
            });
        });
        tr = table.insertRow(-1);
        
            tabCell = null;
            for (var j = 0; j < col.length-1; j++) {
            	tabCell = tr.insertCell(-1);
            	tabCell.innerHTML = " ";
            }
            tabCell = tr.insertCell(-1);
            btnNew = document.createElement("BUTTON");
            var t = document.createTextNode("Add Row");
            btnNew.setAttribute("id", "NewBtn"+i);
            btnNew.appendChild(t);
            tabCell.appendChild(btnNew);
            btnNew.addEventListener("click", function () {
            	
            	add_row(row,col.length);
            	row++;
            	
            });
            
          
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

function edit_row(no)
{
	document.getElementById("updateBtn"+no).style.display="none";
	document.getElementById("saveBtn"+no).style.display="block";
	console.log(no);
	var data = document.getElementById("myTable").rows[no+1].innerHTML;
	console.log(data);
	
	var Row = document.getElementById("myTable").rows[no+1];
	var Cells = Row.getElementsByTagName("td");
	
	var dueDate = Cells[1]; 
	var dateGiven = Cells[2]; 
	var age = Cells[4]; 
	var weight = Cells[5]; 
	var height = Cells[6]; 
	var placeName = Cells[7]; 
	var bmi = Cells[8]; 
	
	
	var dueDate_data=Cells[1].innerText;
	var dateGiven_data = Cells[2].innerText; 
	var age_data = Cells[4].innerText; 
	var weight_data = Cells[5].innerText; 
	var height_data = Cells[6].innerText; 
	var placeName_data = Cells[7].innerText; 
	var bmi_data = (weight_data*100*100)/(height_data*height_data);
	
	dueDate.innerHTML="<input type='text' id='dueDate_text"+no+"'>";
	dateGiven.innerHTML="<input type='text' id='dateGiven_text"+no+"'>";
	age.innerHTML="<input type='text' id='age_text"+no+"'>";
	weight.innerHTML="<input type='text' id='weight_text"+no+"'>";
	height.innerHTML="<input type='text' id='height_text"+no+"'>";
	placeName.innerHTML="<input type='text' id='placeName_text"+no+"'>";
	bmi.innerHTML= null;
}

function save_row(no)
{
	var Row = document.getElementById("myTable").rows[no+1];
	var Cells = Row.getElementsByTagName("td");
	console.log(no);
	var dueDate_val=document.getElementById("dueDate_text"+no).value;
	var dateGiven_val=document.getElementById("dateGiven_text"+no).value;
	var age_val=document.getElementById("age_text"+no).value;
	var weight_val=document.getElementById("weight_text"+no).value;
	var height_val=document.getElementById("height_text"+no).value;
	var placeName_val=document.getElementById("placeName_text"+no).value;
	var bmi_val=(weight_val*100*100)/(height_val*height_val);
	
	
	Cells[1].innerHTML=dueDate_val;
	Cells[2].innerHTML=dateGiven_val;
	Cells[4].innerHTML=age_val;
	Cells[5].innerHTML=weight_val;
	Cells[6].innerHTML=height_val;
	Cells[7].innerHTML=placeName_val;
	Cells[8].innerHTML=bmi_val;
	
	document.getElementById("updateBtn"+no).style.display="block";
	document.getElementById("saveBtn"+no).style.display="none";
	
	
	
	
	
}
function add_row(no,col_len)
{
	var table = document.getElementById("myTable");
    var tr = table.insertRow(no); 
        tabCell = null;
        for (var j = 0; j < col_len-1; j++) {
            tabCell = tr.insertCell(-1);
            tabCell.innerHTML = "";
        }
        tabCell = tr.insertCell(-1);
        btnUpdate = document.createElement("BUTTON");
        var t = document.createTextNode("Update");
        btnUpdate.setAttribute("id", "updateBtn"+no);
        btnUpdate.appendChild(t);
        tabCell.appendChild(btnUpdate);
        btnUpdate.addEventListener("click", function () {
        	
        	edit_row(no);
        	
        });
        btnSave = document.createElement("BUTTON");
        var t = document.createTextNode("Save");
        btnSave.setAttribute("id", "saveBtn"+no);
        btnSave.appendChild(t);
        tabCell.appendChild(btnSave);
        btnSave.addEventListener("click", function () {
        	
        	save_row(no);
        	
        });
        btnDel = document.createElement("BUTTON");
        var t = document.createTextNode("Delete");
        btnDel.setAttribute("id", "delBtn"+no);
        btnDel.appendChild(t);
        tabCell.appendChild(btnDel);
        btnDel.addEventListener("click", function () {
        	
        	delete_row(no);
        	
        });
    
}
function delete_row(no)
{
	document.getElementById("myTable").rows[no].outerHTML="";
}

function convert()
{

	var convertTableToJson = function()
	{
	    var rows = [];
	    $('table tr').each(function(i, n){
	        var $row = $(n);
	        rows.push({
	        	"id": $row.find('td:eq(0)').text(),
	        	"dueDate":   $row.find('td:eq(1)').text(),
	        	"dateGiven":    $row.find('td:eq(2)').text(),
	        	"vaccine":       $row.find('td:eq(3)').text(),
	        	"age":         $row.find('td:eq(4)').text(),
	        	"weight":        $row.find('td:eq(5)').text(),
	        	"heigth":          $row.find('td:eq(6)').text(),
	        	"placeName":          $row.find('td:eq(7)').text(),
	        	"bmi":          $row.find('td:eq(8)').text()
	        });
	    });
	    rows.shift();
	    return rows;
	};
	
	console.log(convertTableToJson());
	
	 $.ajax({
	   url: "http://localhost:8090/DocVaccine",
	   contentType: "application/json",
	   headers : {
           'Accept' : 'application/json',
           'Content-Type' : 'application/json'
       },
       type: 'POST',
	   data: JSON.stringify(convertTableToJson()),
	   success: function (data) {
		   alert("DATA SENT");
       }
	 });
	

}
