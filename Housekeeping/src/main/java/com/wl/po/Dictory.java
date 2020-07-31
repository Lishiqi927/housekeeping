package com.wl.po;

public class Dictory {
	private String ID;
	private String TABLENAME;
	private String FIELDNAME;
	private Integer VALUE;
	private String SERVICETYPE;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTABLENAME() {
		return TABLENAME;
	}
	public void setTABLENAME(String tABLENAME) {
		TABLENAME = tABLENAME;
	}
	public String getFIELDNAME() {
		return FIELDNAME;
	}
	public void setFIELDNAME(String fIELDNAME) {
		FIELDNAME = fIELDNAME;
	}
	public Integer getVALUE() {
		return VALUE;
	}
	public void setVALUE(Integer vALUE) {
		VALUE = vALUE;
	}
	public String getSERVICETYPE() {
		return SERVICETYPE;
	}
	public void setSERVICETYPE(String sERVICETYPE) {
		SERVICETYPE = sERVICETYPE;
	}
	@Override
	public String toString() {
		return "Dictory [ID=" + ID + ", TABLENAME=" + TABLENAME + ", FIELDNAME=" + FIELDNAME + ", VALUE=" + VALUE
				+ ", SERVICETYPE=" + SERVICETYPE + "]";
	}
	
}
