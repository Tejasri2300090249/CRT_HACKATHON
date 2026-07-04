async function loadDashboard() {

    try {

        const response = await fetch("http://localhost:8081/api/dashboard/stats");

        const data = await response.json();

        document.getElementById("customers").innerHTML = data.customers;

        document.getElementById("pan").innerHTML = data.panValidations;

        document.getElementById("aadhaar").innerHTML = data.aadhaarValidations;

        document.getElementById("history").innerHTML = data.history;

    } catch (error) {

        console.log(error);

    }

}

loadDashboard();