package fr.epsi.service;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImpl;
import fr.epsi.dao.FactureDao;
import fr.epsi.dao.FactureDaoImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.FactureDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ComptabiliteServiceImpl implements FactureService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(FactureDTO f)  {
		
		Facture facture=new Facture();
		facture.setPrixtotalFacture(f.getPrixtotalFacture());
		facture.setDateFacture(f.getDateFacture());
		facture.setNumeroFacture(f.getNumeroFacture());
		FactureDao dao=new FactureDaoImpl(em, utx);
		
		dao.create(facture);
		
	}

}
