async function loadHistory() {

    const response = await fetch("http://localhost:8081/api/customers/history");

    const customers = await response.json();

    let rows = "";

    customers.forEach(customer => {

        rows += `
        <tr>

        <td>${customer.id}</td>

        <td>${customer.name}</td>

        <td>${customer.email}</td>

        <td>${customer.mobile}</td>

        <td>${customer.pan}</td>

        <td>${customer.aadhaar}</td>

        </tr>
        `;

    });

    document.getElementById("historyTable").innerHTML = rows;

}

loadHistory();