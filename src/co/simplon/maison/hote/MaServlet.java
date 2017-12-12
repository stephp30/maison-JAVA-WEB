package co.simplon.maison.hote;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("resa", ListeResa.getInstance().getListe());
		getServletContext().getRequestDispatcher("/listeResa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
			
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String mail = request.getParameter("mail");
		String date = request.getParameter("date");
		String nbNuitee = request.getParameter("nbNuitee");
		String nbPersonne = request.getParameter("nbPersonne");
		String region = request.getParameter("region");
		String animal= request.getParameter("test1");
		if (animal == null){
			animal = "non";			
		}
		else
			animal ="oui";
		
		String parking= request.getParameter("test2");
		if (parking == null){
			parking = "non";			
		}
		else
			parking ="oui";
		
		String fumeur= request.getParameter("test3");
		if (fumeur == null){
			fumeur = "non";			
		}
		else
			fumeur ="oui";
				
		String sejour= request.getParameter("radio");

       MaisonResa maison = new MaisonResa(nom,prenom,telephone,mail,date,nbNuitee,nbPersonne,region,animal,parking,fumeur,sejour);
       
       ListeResa.getInstance().getListe().add(maison);
       
      System.out.println(ListeResa.getInstance().getListe());
       
		/*HttpSession session = request.getSession(true);
		session.setAttribute("nom", nom);		
		session.setAttribute("prenom", prenom);		
		session.setAttribute("telephone", telephone);
		session.setAttribute("mail", mail);
		session.setAttribute("date", date);
		session.setAttribute("nbNuitee", nbNuitee);
		session.setAttribute("nbPersonne", nbPersonne);
		session.setAttribute("region", region);
		session.setAttribute("animal", animal);
		session.setAttribute("parking", parking);
		session.setAttribute("fumeur", fumeur);
		session.setAttribute("sejour", sejour);*/
		
		
       
		this.getServletContext().getRequestDispatcher("/listeResa.jsp").forward(request, response);
	
	}

}
