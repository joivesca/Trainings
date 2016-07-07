package mx.com.chilitech.controller;

import com.opensymphony.xwork2.ActionSupport;

import mx.com.chilitech.model.DefectsManager;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class DefectsList  {
    
    private List defects;
    private DefectsManager defectsManager;
    
    public List getDefects() {
        return defects;
    }
    
    public void setDefects(List defects) {
        this.defects = defects;
    }
    
    public void setDefectsManager(DefectsManager defectsManager) {
        this.defectsManager = defectsManager;
    }
    
    public String execute() {
    	//WebApplicationContext context =
    	//		WebApplicationContextUtils.getRequiredWebApplicationContext(
        //                                ServletActionContext.getServletContext());
    	
        //this.defects = ((DefectsManager)context.getBean("defectsManager")).getDefects();// this.defectsManager.getDefects();
        
        this.defects = this.defectsManager.getDefects();
        return  com.opensymphony.xwork2.ActionSupport.SUCCESS;
    }
    
}
