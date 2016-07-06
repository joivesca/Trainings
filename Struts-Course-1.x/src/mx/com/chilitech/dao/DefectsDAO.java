package mx.com.chilitech.dao;

import java.util.List;

import mx.com.chilitech.model.Defect;

public interface DefectsDAO {

	public List getDefects();
	public Defect getDefect(long defectId);
	public void saveDefect(Defect defect);
	public void removeDefect(long defectId);
	
}
