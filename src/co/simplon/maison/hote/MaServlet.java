package co.simplon.maison.hote;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.maison.resa.Jdbc;
import co.simplon.maison.resa.ListeResa;
import co.simplon.maison.resa.MaisonResa;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("resa", ListeResa.getInstance().getListe());
		getServletContext().getRequestDispatcher("/listeResa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String mail = request.getParameter("mail");
		String date = request.getParameter("date");
						
		int nbNuitee = Integer.parseInt(request.getParameter("nbNuitee"));
		int nbPersonne = Integer.parseInt(request.getParameter("nbPersonne"));
		String region = request.getParameter("region");

		boolean animal = false;
		if (request.getParameter("test1") != null) {
			animal = true;
		}

		boolean parking = false;
		if (request.getParameter("test2") != null) {
			parking = true;
		}

		boolean fumeur = false;
		if (request.getParameter("test3") != null) {
			fumeur = true;
		}
		
		String sejour = request.getParameter("radio");

		MaisonResa maison = new MaisonResa(nom, prenom, telephone, mail, date, nbNuitee, nbPersonne, region, animal,
				parking, fumeur, sejour);

		ListeResa.getInstance().getListe().add(maison);
		
		
		// Instance objet Jdbc et connection
		Jdbc base = new Jdbc();
		base.connection();
		
		try {
			base.ecrireEnBase2(nom, prenom, telephone, mail, nbNuitee, nbPersonne, animal, parking, fumeur, region, sejour);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		this.getServletContext().getRequestDispatcher("/validation.jsp").forward(request, response);

	}

}
