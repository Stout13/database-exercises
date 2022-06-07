// Display a "loading..." message ==================...that disappears after loading is complete(see below)


// Fetch and display all movies after loading

// Make an AJAX request to get a listing of all the movies ====== BY TITLE
// When the initial AJAX request comes back, remove the "loading..." message and replace it with HTML generated from the
// json response your code receives




// Allow users to add new movies ================ ADD FORM WITH TITLE FIELD

// Create a form for adding a new movie that has fields for the movie's
    // title
    // and rating
// When the form is submitted,
    // the page should not reload / refresh, instead,
    // your javascript should make a POST request
        // to /movies with the information the user put into the form

// Allow users to edit existing movies ========== EDIT FORM WITH TITLE FIELD

// A form should be pre-populated with
    // the selected movie's details
// Like creating a movie, this should not involve any page reloads, instead
    // your javascript code should make an ajax request when the form is submitted.

// Delete movies ================================ DELETE FORM WITH TITLE FIELD

// Each movie should have a "delete" button
// When this button is clicked, your javascript should send a DELETE request






// Bonuses
// Add a disabled attribute to buttons while their corresponding ajax request is still pending.
//     Show a loading animation instead of just text that says "loading...".
//     Use modals for the creating and editing movie forms.
//     Add a genre property to every movie.
//     Allow users to sort the movies by rating, title, or genre (if you have it).
// Allow users to search through the movies by rating, title, or genre (if you have it).
// Use a free movie API like OMDB to include extra info or render movie posters.
//     Helpful Hints
// The id property of every movie should not be edited by hand. The purpose of this property is to uniquely identify that
// particular movie. That is, if we want to delete or modify an existing movie, we can specify what movie we want to change
// by referencing it'\''s id. When a new movie is created (i.e. when you send a POST request to /movies with a
//     title and a rating), the server will respond with the movie object that was created, including a generated id.
// Take a look at the other branches in this repository, as they have configuration/setup for common scenarios, such as
// including bootstrap in your application.



// Loading Message

// Movie Cards === TILES

// Bootsrap Nav Cards for editing
    //  3 cards under tabs hidden while inactive
        //  Add, Edit, Delete
        //  e.preventDefault()



// var selectedRow = null

function onFormSubmit() {
//     if (validate()) {
//         var formData = readFormData();
//         if (selectedRow == null)
//             insertNewRecord(formData);
//         else
//             updateRecord(formData);
//         resetForm();
//     }
// }

function readFormData() {
//     var formData = {};
//     formData["fullName"] = document.getElementById("fullName").value;
//     formData["email"] = document.getElementById("email").value;
//     formData["salary"] = document.getElementById("salary").value;
//     formData["city"] = document.getElementById("city").value;
//     return formData;
// }

function insertNewRecord(data) {
//     var table = document.getElementById("employeeList").getElementsByTagName('tbody')[0];
//     var newRow = table.insertRow(table.length);
//     cell1 = newRow.insertCell(0);
//     cell1.innerHTML = data.fullName;
//     cell2 = newRow.insertCell(1);
//     cell2.innerHTML = data.email;
//     cell3 = newRow.insertCell(2);
//     cell3.innerHTML = data.salary;
//     cell4 = newRow.insertCell(3);
//     cell4.innerHTML = data.city;
//     cell4 = newRow.insertCell(4);
//     cell4.innerHTML = `<a onClick="onEdit(this)">Edit</a>
//                        <a onClick="onDelete(this)">Delete</a>`;
// }

function resetForm() {
//     document.getElementById("fullName").value = "";
//     document.getElementById("email").value = "";
//     document.getElementById("salary").value = "";
//     document.getElementById("city").value = "";
//     selectedRow = null;
// }

function onEdit(td) {
//     selectedRow = td.parentElement.parentElement;
//     document.getElementById("fullName").value = selectedRow.cells[0].innerHTML;
//     document.getElementById("email").value = selectedRow.cells[1].innerHTML;
//     document.getElementById("salary").value = selectedRow.cells[2].innerHTML;
//     document.getElementById("city").value = selectedRow.cells[3].innerHTML;
// }
function updateRecord(formData) {
//     selectedRow.cells[0].innerHTML = formData.fullName;
//     selectedRow.cells[1].innerHTML = formData.email;
//     selectedRow.cells[2].innerHTML = formData.salary;
//     selectedRow.cells[3].innerHTML = formData.city;
// }

function onDelete(td) {
//     if (confirm('Are you sure to delete this record ?')) {
//         row = td.parentElement.parentElement;
//         document.getElementById("employeeList").deleteRow(row.rowIndex);
//         resetForm();
//     }
// }
function validate() {
//     isValid = true;
//     if (document.getElementById("fullName").value == "") {
//         isValid = false;
//         document.getElementById("fullNameValidationError").classList.remove("hide");
//     } else {
//         isValid = true;
//         if (!document.getElementById("fullNameValidationError").classList.contains("hide"))
//             document.getElementById("fullNameValidationError").classList.add("hide");
//     }
//     return isValid;
// }

