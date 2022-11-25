function restt(pForm) {
	var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("demo").innerHTML = this.responseText;
    }
  };
xhttp.open("GET", "http://localhost:8071/spring_webmvc_war_exploded/hello/currency/rate/"+pForm.text.value+"/from/"+pForm.con.value+"/to/"+pForm.conto.value, true);
xhttp.send();

}