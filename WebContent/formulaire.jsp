<jsp:directive.page contentType="text/html;charset=ISO-8859-15"
	pageEncoding="UTF-8" />
--%>


<jsp:include page="header.jsp" />

<h1 class="amber-text text-darken-1">Enregistrer votre réservation</h1>


<!-- Formulaire -->
<div class="container">
	<form class="col s12" method="post" action="MaServlet">
		<div class="row">

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">account_circle</i> <input
					id="testNom" type="text" name="nom" class="validate"
					pattern="^[a-zA-Záàâäãåçéèêëíìîïñóòôöõúùûü]+$"
					title="Le nom ne doit contenir que des lettres" required> <label
					for="testNom">Nom</label>
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">account_circle</i> <input
					id="icon_prefix" type="text" name="prenom" class="validate"
					pattern="^[a-zA-Záàâäãåçéèêëíìîïñóòôöõúùûü]+$"
					title="Le prénom ne doit contenir que des lettres" required>
				<label for="icon_prefix">Prénom</label>
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">phone</i> <input
					id="icon_telephone" type="tel" name="telephone" class="validate"
					pattern="^[0-9]{10}$" required> <label for="icon_telephone">Téléphone</label>
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">mail</i> <input id="mail"
					type="email" name="mail" class="validate"
					pattern="(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$)"
					title="Entrer un mail valide" required> <label for="mail">E-mail</label>
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">today</i> <label>Début du
					Séjour</label> <input type="date" name="date" class="datepicker" />
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">hotel</i> <input value=""
					id="nuitee" type="number" name="nbNuitee" class="validate"
					title="Entrer un nombre" required> <label>Nombre de
					nuitée</label>
			</div>

			<div class="input-field col s12 m6">
				<i class="material-icons prefix">accessibility</i> <select
					name="nbPersonne">
					<option value="" disabled selected>Nombre de personnes</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
				</select> <label></label>
			</div>

			<!-- combo region -->
			<div class="input-field col s12 m6">
				<i class="material-icons prefix">add_location</i> <select
					name="region">
					<option value="" disabled selected>Région</option>
					<option value="Auvergne-Rhône-Alpes">Auvergne-Rhône-Alpes</option>
					<option value="Bourgogne-Franche-Comté">Bourgogne-Franche-Comté</option>
					<option value="Bretagne">Bretagne</option>
					<option value="Centre-Val de Loire">Centre-Val de Loire</option>
					<option value="Corse">Corse</option>
					<option value="Grand Est">Grand Est</option>
					<option value="Hauts-de-France">Hauts-de-France</option>
					<option value="Île-de-France">Île-de-France</option>
					<option value="Normandie">Normandie</option>
					<option value="Nouvelle-Aquitaine">Nouvelle-Aquitaine</option>
					<option value="Occitanie">Occitanie</option>
					<option value="Pays de la Loire">Pays de la Loire</option>
					<option value="Provence-Alpes-Côte d'Azur">Provence-Alpes-Côte
						d'Azur</option>
					<option value="Outre-Mer">Outre-Mer</option>
					<option value="International">International</option>
				</select> <label></label>
			</div>

			<div class="col s12 ">

				<!-- option -->
				<div class="col s6" id="options">

					<h5>Option 10€ par jour et par Option</h5>

					<br> <input type="checkbox" name="test1" id="test1" /> <label
						class="col s12 m4" for="test1">&nbsp;&nbsp;&nbsp;Animal</label> <input
						type="checkbox" name="test2" id="test2" /> <label
						class="col s12 m4 " for="test2">&nbsp;&nbsp;&nbsp;Parking</label>

					<input type="checkbox" name="test3" id="test3" /> <label
						class="col s12 m4" for="test3">&nbsp;&nbsp;&nbsp;Fumeur</label>
				</div>

				<!-- type sejour -->
				<div class="col s6" id="type">

					<h5>Type de Sejour</h5>

					<br> <label class="col s12 m4 "></label> <input name="radio"
						type="radio" id="test4" value="Loisir" checked /> <label
						class="col s12 m4 " for="test4">Loisir</label> <input
						name="radio" type="radio" id="test5" value="Professionnel" /> <label
						class="col s12 m4 " for="test5">Professionnel</label>
				</div>

			</div>

			<!-- Boutons -->
			<div class="col s12 ">
				<br> <br> <br> <a
					class="waves-effect waves-light btn amber accent-2" id="view">
					<i class="material-icons right">attach_money</i>Vérifier le tarif
				</a>
				<button class="btn waves-effect waves-light amber accent-2"
					type="submit" value="Envoyer">
					Valider <i class="material-icons right">send</i>
				</button>

				<!-- Resultat -->
				<input value="99€" id="tarif" type="text"> <label>Tarif</label>
				<input value=" " id="total" type="text"> <label>Total</label>
			</div>
		</div>
	</form>
</div>

<jsp:include page="footer.jsp" />