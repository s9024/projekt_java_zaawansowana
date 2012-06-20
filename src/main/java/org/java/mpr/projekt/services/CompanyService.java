package org.java.mpr.projekt.services;

import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.java.mpr.projekt.domain.Company;

@Stateful
@Named("companyService")
public class CompanyService {
    
    @PersistenceContext(unitName = "9024_PU")
    private EntityManager em;
    
    public List<Company> getAllComnpanies() {
        return em.createQuery("select c from Company c").getResultList();
    }
    
    public void remove(Company company) {
        company = em.merge(company);
        em.remove(company);
    }
 
    public void merge(Company company) {
        em.merge(company);
    }
}
