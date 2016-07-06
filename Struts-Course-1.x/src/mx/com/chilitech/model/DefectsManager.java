package mx.com.chilitech.model;

import java.util.List;

public interface DefectsManager {
	public List getDefects();
	public Defect getDefect(long defectId);
	public void saveDefect(Defect defect);
	public void removeDefect(long defectId);
}
