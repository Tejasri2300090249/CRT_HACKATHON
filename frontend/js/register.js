function registerCustomer() {

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;
    const pan = document.getElementById("pan").value;
    const aadhaar = document.getElementById("aadhaar").value;

    document.getElementById("result").innerHTML = `
    <div class="alert alert-success">

        <h4>✅ Customer Registered Successfully</h4>

        <hr>

        <b>Name :</b> ${name}<br>
        <b>Email :</b> ${email}<br>
        <b>Mobile :</b> ${mobile}<br>
        <b>PAN :</b> ${pan}<br>
        <b>Aadhaar :</b> ${aadhaar}

    </div>
    `;

}