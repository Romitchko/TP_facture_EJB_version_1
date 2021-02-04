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
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ChoseServiceImpl implements ArticleService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(ArticleDTO a)  {
		
		Article article=new Article();
		article.setPrix(a.getPrix());
		article.setNom(a.getNom());
		article.setCodebarre(a.getCodebarre());
		ArticleDao dao=new ArticleDaoImpl(em, utx);
		
		dao.create(article);
		
	}

}
