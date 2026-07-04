async function validatePAN(){

const pan=document.getElementById("pan").value;

const response=await fetch("http://localhost:8081/api/validate/pan",{

method:"POST",

headers:{

"Content-Type":"application/json"

},

body:JSON.stringify({

pan:pan

})

});

const data=await response.json();

if(data.valid){

document.getElementById("result").innerHTML=`

<div class="alert alert-success mt-4">

<h4>✅ PAN Valid</h4>

<hr>

<b>PAN :</b> ${data.panNumber}<br>

<b>Category :</b> ${data.category}<br>

<b>Status :</b> ${data.message}

</div>

`;

}

else{

document.getElementById("result").innerHTML=`

<div class="alert alert-danger mt-4">

<h4>❌ Invalid PAN</h4>

<hr>

${data.message}

</div>

`;

}

}