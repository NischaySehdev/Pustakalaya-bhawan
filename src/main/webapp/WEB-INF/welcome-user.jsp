<%--
  Created by IntelliJ IDEA.
  User: nisch
  Date: 3/10/2024
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Welcome, ${pageContext.request.getAttribute("username")}</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
<jsp:useBean id="clientPage" class="in.sarvshiksha.lms.client.Client">
    <div id="carouselExampleCaptions" class="carousel slide">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                    aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                    aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../Images/Pustkalya-bhavan-image_1.png" class="d-block w-100" alt="Pustakalya bhawan">
                <div class="carousel-caption d-none d-md-block">
                    <h5>First slide label</h5>
                    <p>Some representative placeholder content for the first slide.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../Images/Pustkalya-bhavan-image_2.png" class="d-block w-100" alt="Pustakalya bhawan">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Second slide label</h5>
                    <p>Some representative placeholder content for the second slide.</p>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../Images/Pustkalya-bhavan-image_3.png" class="d-block w-100" alt="Pustakalya bhawan">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Third slide label</h5>
                    <p>Some representative placeholder content for the third slide.</p>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <div class="container text-center mt-10">
        <div class="row">
            <div class="col">
                <div class="card">
                    <img src="../Images/My_profile.png" class="card-img-top" alt="My profile">
                    <div class="card-body">
                        <h5 class="card-title">My profile</h5>
                        <p class="card-text">Manage your personal profile with a few clicks like personal information,
                            account details etc.</p>
                        <a href="#" class="btn btn-primary">${clientPage.clientMenuItemsList}</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <img src="../Images/Search_book.png" class="card-img-top" alt="Search the books">
                    <div class="card-body">
                        <h5 class="card-title">Search your book</h5>
                        <p class="card-text">Get your book details by just knowing a few things.</p>
                        <a href="#" class="btn btn-primary">Click here !!</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <img src="../Images/E-book.png" class="card-img-top" alt="E-book store">
                    <div class="card-body">
                        <h5 class="card-title">E-book store</h5>
                        <p class="card-text">Download and save your favourite book in soft copy easily.</p>
                        <a href="#" class="btn btn-primary">Click here !!</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col">
                <div class="card">
                    <img src="../Images/Buy-a-book.png" class="card-img-top" alt="Buy your book">
                    <div class="card-body">
                        <h5 class="card-title">Buy your book</h5>
                        <p class="card-text">Checkout your favourite book at lowest price.</p>
                        <a href="#" class="btn btn-primary">Click here !!</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <img src="../Images/Request-a-book.png" class="card-img-top" alt="Request a book">
                    <div class="card-body">
                        <h5 class="card-title">Request a book</h5>
                        <p class="card-text">Help us to know about your favorite book.</p>
                        <a href="#" class="btn btn-primary">Click here !!</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <img src="../Images/Report-an-issue.png" class="card-img-top" alt="Report an issue">
                    <div class="card-body">
                        <h5 class="card-title">Report an issue</h5>
                        <p class="card-text">Help us to correct ourselves.</p>
                        <a href="#" class="btn btn-primary">Click here !!</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</jsp:useBean>
</body>
</html>
