function UserAction() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
			document.getElementById("resultTextBox").value = this.responseText;
         }
    };
    xhttp.open("POST", "http://localhost:4567/API/PrettyPrint/"+document.getElementById("dataType").value, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(document.getElementById("inputTextBox").value);
}