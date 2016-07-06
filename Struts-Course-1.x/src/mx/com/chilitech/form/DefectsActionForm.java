package mx.com.chilitech.form;

import org.apache.struts.validator.ValidatorForm;

import mx.com.chilitech.model.Defect;

public class DefectsActionForm extends ValidatorForm {
    private Defect defect = new Defect();
    
    public Defect getDefect() {
        return this.defect;
    }
    
    public void setDefect(Defect defect) {
        this.defect = defect;
    }
}
