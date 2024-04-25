$(function () {
    hentAlleFilmer();
});

function hentAlleFilmer() {
    $.get("/hentFilm", function (filmer) {
        formaterFilmer(filmer); // Pass the received films to the formatting function
    });
}

function formaterFilmer(filmerData) {
    let ut = "<select id='valgtFilm'>";
    let forrigeFilm = "";
    ut += "<option>Velg Film</option>";

    for (const film of filmerData) {
        if (film.filmName != forrigeFilm) {
            ut += "<option>" + film.filmName + "</option>";
        }
        forrigeFilm = film.filmName;
    }
    ut += "</select>";
    $("#chooseFilm").html(ut); // Update the dropdown menu in the HTML
}

// Array to store orders
var ticketOrders = [];

// Function for the button to check if input text is right
function searchFail() {
    // Get input values
    var nrOfTickets = $("#nrOfTickets").val();
    var name = $("#name").val();
    var surname = $("#surname").val();
    var phonenr = $("#phonenr").val();
    var email = $("#email").val();

    // Perform input validation
    if (isNaN(nrOfTickets) || nrOfTickets === "" || name === "" || surname === "" || !/^\d{8}$/.test(phonenr) || !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        // Display validation errors if any
        if (isNaN(nrOfTickets) || nrOfTickets === "") {
            $("#errorNumbers").text("Du må velge antall biletter.");
        }
        if (name === "") {
            $("#needToWriteSomething").text("Navnet må fylles ut.");
        }
        if (surname === "") {
            $("#needToWriteSomething2").text("Etternavnet må fylles ut.");
        }
        if (!/^\d{8}$/.test(phonenr)) {
            $("#needNumber").text("Skriv inn riktig mobilnummer.");
        }
        if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
            $("#validEmail").text("Skriv inn riktig e-post.");
        }
    } else {
        // Create a ticket order object
        var ticketOrder = {
            nrOfTickets: nrOfTickets,
            name: name,
            surname: surname,
            phonenr: phonenr,
            email: email
        };

        // Push filled form into the ticketOrders array
        ticketOrders.push(ticketOrder);

        // Clear input fields
        $("#nrOfTickets, #name, #surname, #phonenr, #email").val("");

        // Update ticket list
        displayTicketOrders();
    }
}

// Function to show orders
function displayTicketOrders() {
    var output = "<table class='table table-striped'><tr><th>Navn</th><th>Etternavn</th><th>Antall billetter</th><th>Telefonnr</th><th>E-post</th></tr>";

    // Loop through each ticket order in the ticketOrders array
    for (var i = 0; i < ticketOrders.length; i++) {
        output += "<tr>";
        output += "<td>" + ticketOrders[i].name + "</td>";
        output += "<td>" + ticketOrders[i].surname + "</td>";
        output += "<td>" + ticketOrders[i].nrOfTickets + "</td>";
        output += "<td>" + ticketOrders[i].phonenr + "</td>";
        output += "<td>" + ticketOrders[i].email + "</td>";
        output += "</tr>";
    }

    output += "</table>";

    // Display the order table in the HTML
    $("#ticketOrderTable").html(output);
}

// Function to delete all ticket orders
function deleteAllOrders() {
    // Clear the ticketOrders array
    ticketOrders = [];

    // Update ticket list display
    displayTicketOrders();
}