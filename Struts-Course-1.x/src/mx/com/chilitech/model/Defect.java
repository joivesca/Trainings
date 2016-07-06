package mx.com.chilitech.model;

import java.util.Date;

public class Defect {

	private long id;
	private String description;
	private int priority;
	private boolean isResolved;
	private String resolution;
	private String submittedBy;
	private Date submittedOn;
	private String resolvedBy;
	private Date resolvedOn;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isResolved() {
		return isResolved;
	}
	public void setIsResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	public Date getSubmittedOn() {
		return submittedOn;
	}
	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}
	public String getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public Date getResolvedOn() {
		return resolvedOn;
	}
	public void setResolvedOn(Date resolvedOn) {
		this.resolvedOn = resolvedOn;
	}
	
	public String getShortDescription() {
		if ( (this.description != null) && (this.description.length() > 40) ) {
			return this.description.substring(0,37) + "...";
		} else {
		    return this.description;
		}
	}
	
	public String getShortResolution() {
		if ( (this.resolution != null) && (this.resolution.length() > 40) ) {
			return this.resolution.substring(0,37) + "...";
		} else {
			return this.resolution;
		}
	}
}
