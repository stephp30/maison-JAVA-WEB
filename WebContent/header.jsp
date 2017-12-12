<jsp:directive.page contentType="text/html;charset=UTF-8" />

<!DOCTYPE html >
<html>

<head>
<!-- Entête de la page -->
<meta charset="UTF-8">

<title>Maison</title>
<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<!--Import materialize.css-->
<link type="text/css" rel="stylesheet" href="css/materialize.css"
	media="screen" />
<link type="text/css" rel="stylesheet" href="css/maison.css"
	media="screen" />

<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>

	<header>
		<div class="parallax-container">

			<h3 class="white-text text-darken-2">Bienvenue dans le Gard</h3>
			<h5 class="white-text text-darken-2">Venez profiter du soleil.</h5>
			<div class="parallax">
				<img src="img/pontdugard.jpg" alt="Pont du Gard">
			</div>
		</div>
		<nav>
			<div class="nav-wrapper amber">

				<a href="#!" class="brand-logo">Villa Romana</a> <a href="#"
					data-activates="mobile-demo" class="button-collapse"> <i
					class="material-icons">menu</i>
				</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="index.jsp"> <i class="material-icons left">home</i>Maison
					</a></li>
					<li><a href="region.jsp"> <i class="material-icons left">collections</i>Région
					</a></li>
					<li><a href="formulaire.jsp"> <i
							class="material-icons left">contacts</i>Formulaire
					</a></li>
				</ul>

				<ul class="side-nav amber" id="mobile-demo">
					<li><a href="index.jsp"> <i class="material-icons left">home</i>Maison
					</a></li>
					<li><a href="region.jsp"> <i class="material-icons left">collections</i>Région
					</a></li>
					<li><a href="formulaire.jsp"> <i
							class="material-icons left">contacts</i>Formulaire
					</a></li>

				</ul>
			</div>
		</nav>
	</header>