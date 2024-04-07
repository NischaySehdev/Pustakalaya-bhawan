document.getElementById("forgotPasswordButton").addEventListener("click", callForgotPasswordPage);
document.getElementById("createYourAccountButton").addEventListener("click", callCreateYourAccountPage);

function callForgotPasswordPage() {
    window.location.href = "../LibraryMangementSystem/forgot-password.html";
}

function callCreateYourAccountPage() {
    window.location.href = "../LibraryMangementSystem/create-an-account.html";
}
