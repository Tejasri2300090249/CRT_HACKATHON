async function validateAadhaar() {

    const aadhaar = document.getElementById("aadhaar").value;

    try {

        const response = await fetch("http://localhost:8081/api/validate/aadhaar", {

            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify({
                aadhaar: aadhaar
            })

        });

        const data = await response.json();

        if (data.valid === true) {

            document.getElementById("result").innerHTML = `
            <div class="alert alert-success mt-4">
                <h4>✅ Aadhaar Valid</h4>
                <hr>
                <b>Aadhaar :</b> ${data.aadhaarNumber}<br>
                <b>Status :</b> ${data.message}
            </div>
            `;

        } else {

            document.getElementById("result").innerHTML = `
            <div class="alert alert-danger mt-4">
                <h4>❌ Invalid Aadhaar</h4>
                <hr>
                <b>Aadhaar :</b> ${data.aadhaarNumber}<br>
                <b>Status :</b> ${data.message}
            </div>
            `;

        }

    } catch (error) {

        console.error(error);

        document.getElementById("result").innerHTML = `
        <div class="alert alert-danger mt-4">
            <h4>❌ Unable to connect to Backend</h4>
            Check whether Spring Boot is running.
        </div>
        `;

    }

}