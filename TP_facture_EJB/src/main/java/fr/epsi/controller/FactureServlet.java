package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.FactureService;
import fr.epsi.dto.FactureDTO;

//Couche WEB
public class FactureServlet extends HttpServlet{
	
	@EJB
	private FactureService service;
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/createFacture.jsp").forward(req, resp);
	    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		
			FactureDTO fDTO=new FactureDTO();
			fDTO.setDateFacture(req.getParameter("dateFacture"));
			fDTO.setNumeroFacture(req.getParameter("numeroFacture"));
			fDTO.setPrixtotalFacture(req.getParameter("prixtotalFacture"));
			service.create(fDTO);
			
	    }

}
