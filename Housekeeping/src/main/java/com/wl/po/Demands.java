package com.wl.po;

public class Demands {
	private String DEMANDSID;
	private String USERID;
	private String SERVICEID;
	private Double DEMANDSAMOUNT;
	private Integer DEMANDSDAYCOUNT;
	public String getDEMANDSID() {
		return DEMANDSID;
	}
	public void setDEMANDSID(String dEMANDSID) {
		DEMANDSID = dEMANDSID;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getSERVICEID() {
		return SERVICEID;
	}
	public void setSERVICEID(String sERVICEID) {
		SERVICEID = sERVICEID;
	}
	public Double getDEMANDSAMOUNT() {
		return DEMANDSAMOUNT;
	}
	public void setDEMANDSAMOUNT(Double dEMANDSAMOUNT) {
		DEMANDSAMOUNT = dEMANDSAMOUNT;
	}
	public Integer getDEMANDSDAYCOUNT() {
		return DEMANDSDAYCOUNT;
	}
	public void setDEMANDSDAYCOUNT(Integer dEMANDSDAYCOUNT) {
		DEMANDSDAYCOUNT = dEMANDSDAYCOUNT;
	}
	@Override
	public String toString() {
		return "Demands [DEMANDSID=" + DEMANDSID + ", USERID=" + USERID + ", SERVICEID=" + SERVICEID
				+ ", DEMANDSAMOUNT=" + DEMANDSAMOUNT + ", DEMANDSDAYCOUNT=" + DEMANDSDAYCOUNT + "]";
	}
	
}
