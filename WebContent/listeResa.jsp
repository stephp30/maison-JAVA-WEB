<jsp:directive.page contentType="text/html;charset=UTF-8" />
<%@page import="co.simplon.maison.resa.MaisonResa"%>
<%@page import="co.simplon.maison.resa.ListeResa"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Collection"%>

<jsp:include page="header.jsp" />

<h1 class="amber-text text-darken-1">Liste des Réservations</h1>


<table id="tableau" class="responsive-table">
	<tr id="entete">
		<th>Nom</th>
		<th>Prénom</th>
		<th>Téléphone</th>
		<th>Mail</th>
		<th>Date d'Arrivée</th>
		<th>Nb Nuitées</th>
		<th>Nb Personnes</th>
		<th>Région</th>
		<th>Animal</th>
		<th>Parking</th>
		<th>Fumeur</th>
		<th>Type de Séjour</th>

	</tr>
	<%
		Collection<MaisonResa> liste = ListeResa.getInstance().getListe();
		if (liste != null) {
			Iterator it = liste.iterator();
			while (it.hasNext()) {
				MaisonResa serveur = (MaisonResa) it.next();
				
	%>
	<tr id="ligne">
		<td><%=serveur.getNom()%></td>
		<td><%=serveur.getPrenom()%></td>
		<td><%=serveur.getTelephone()%></td>
		<td><%=serveur.getMail()%></td>
		<td><%=serveur.getDate()%></td>
		<td><%=serveur.getNbNuitee()%></td>
		<td><%=serveur.getNbPersonne()%></td>
		<td><%=serveur.getRegion()%></td>
		<td><%=serveur.getAnimal()%></td>
		<td><%=serveur.getParking()%></td>
		<td><%=serveur.getFumeur()%></td>
		<td><%=serveur.getSejour()%></td>

		<%-- <td>${telephone}</td>
		<td>${mail}</td>
		<td>${date}</td>
		<td>${nbNuitee}</td>
		<td>${nbPersonne}</td>
		<td>${region}</td>
		<td>${animal}</td>
		<td>${parking}</td>
		<td>${fumeur}</td>
		<td>${sejour}</td> --%>

	</tr>
	<%
		}
		}
	%>

</table>

<br>

<jsp:include page="footer.jsp" />