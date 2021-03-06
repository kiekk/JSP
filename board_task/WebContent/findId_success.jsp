<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Generic - Prototype by Pixelarity</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<h1><a href="index.html">Prototype</a></h1>
				<a href="#menu">Menu</a>
			</header>

		<!-- Menu -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.html">Home</a></li>
					<li><a href="generic.html">Generic</a></li>
					<li><a href="elements.html">Elements</a></li>
				</ul>
				<ul class="actions stacked">
					<li><a href="join.html" class="button primary fit">Sign Up</a></li>
					<li><a href="login.html" class="button fit">Log In</a></li>
				</ul>
			</nav>

		<!-- Main -->
			<section id="main" class="wrapper">
				<header>
					<h2>아이디 찾기</h2>
					<p>Lorem justo in tellus aenean lacinia felis.</p>
				</header>
				<!-- contents -->
				<form method="post" action="login.html" style="width:40%; margin:0 auto;">
					<div class="row gtr-uniform">
						<div class="col-7 col-8-xlarge" style="margin:0 auto;">
							<input type="text" name="id" id="id" value="<%= request.getAttribute("user_id") %>" readonly />
						</div>
						<div class="col-7 col-8-xlarge" style="text-align:right; margin:0 auto; font-size:12px">
							<a href="find_pw.html">PW 찾기</a>
							<a href="join.html" style="margin-left:10px">회원 가입</a>
						</div>
						<div class="col-12">
							<ul class="actions">
								<li style="margin:0 auto;">
									<input type="submit" value="Login" class="primary" />
								</li>
							</ul>
						</div>
					</div>
				</form>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<ul class="icons">
						<li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
						<li><a href="#" class="icon brands fa-github"><span class="label">GitHub</span></a></li>
						<li><a href="#" class="icon brands fa-linkedin-in"><span class="label">LinkedIn</span></a></li>
						<li><a href="#" class="icon solid fa-envelope"><span class="label">Envelope</span></a></li>
					</ul>
					<ul class="contact">
						<li>12345 Somewhere Road</li>
						<li>Nashville, TN 00000</li>
						<li>(000) 000-0000</li>
					</ul>
					<ul class="links">
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Support</a></li>
						<li><a href="#">Terms</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
					<p class="copyright">&copy; Untitled. All rights reserved. Lorem ipsum dolor.</p>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>