
package org.java.mpr.projekt.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.java.mpr.projekt.domain.Company;
import org.java.mpr.projekt.services.CompanyService;


@SessionScoped
@Named("companyWeb")
public class CompanyWeb implements Serializable {
   
    private ListDataModel<Company> companys = new ListDataModel<Company>();
    private Company company;
    
    @Inject
    private CompanyService cs;
    
    public String create() { 
        company = new Company("", "");
        return "create";
    }
    
    public String update() { 
        company = companys.getRowData();
        return "update";
    }
    
    public String delete() {  
        company = companys.getRowData();
        cs.remove(company);
        return "all";
    }
        
    public String retrive() {
        company = companys.getRowData();
        return "retrive";
    }

    public String merge() {
        cs.merge(company);
        return "all";
    }
    
    public ListDataModel<Company> getAllCompany() {
        companys.setWrappedData(cs.getAllComnpanies());
        return companys;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}