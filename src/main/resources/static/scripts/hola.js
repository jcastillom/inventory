function obtenerDatos(){
	$.ajax({
		url: 'localhost:8080/ejemplo',
		type: "GET",
		done: function (data) {
		                    let x = JSON.stringify(data);
		                    console.log(x);
							$('#valor').val(x);
		                }
	});
}