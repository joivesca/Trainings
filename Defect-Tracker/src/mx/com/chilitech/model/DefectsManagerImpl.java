package mx.com.chilitech.model;

import java.util.List;

import mx.com.chilitech.model.dao.DefectsDAO;


/**
 * Default implementation of DefectsManager interface.
 */

public class DefectsManagerImpl implements DefectsManager {
    private DefectsDAO dao;
    
    public void setDefectsDAO(DefectsDAO dao) {
        this.dao = dao;
    }
    
    public List getDefects() {
        return dao.getDefects();
    }
    
    public Defect getDefect(long defectId) {
        return dao.getDefect(defectId);
    }
    
    public void saveDefect(Defect defect) {
        
        //Audit new records (who/when):
        if (defect.getId() == 0) {
            defect.setSubmittedBy("Smith,John");
            defect.setSubmittedOn(new java.util.Date());
        }
        
        //If record is being saved with resolution text, audit and flag as resolved:
        if (defect.getResolution() != null && defect.getResolution().trim() != "") {
            defect.setIsResolved(true);
            defect.setResolvedBy("Smith,John");
            defect.setResolvedOn(new java.util.Date());
        }
        
        dao.saveDefect(defect);
    }
    
    public void removeDefect(long defectId) {
        dao.removeDefect(defectId);
    }
}
