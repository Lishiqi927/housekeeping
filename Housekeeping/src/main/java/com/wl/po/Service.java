package com.wl.po;

public class Service {

	private String SERVICEID;
	private String USERID;
	private int TYPE;
	private String TYPETEXT;
	private String SERVICEDAYTIMESTA;
	private String SERVICEDAYTIMEEND;
	private String SERVICEDAYTIMESTA1;
	private String SERVICEDAYTIMEEND1;
	private String SERVICEDAYTIMESTA2;
	private String SERVICEDAYTIMEEND2;
	private String SERVICEDAYCOUNT;
	private Double MONEY;
	private String EXPLAINS;
	private String ADDRESS;
	
	
	public String getTYPETEXT() {
		return TYPETEXT;
	}
	public void setTYPETEXT(String tYPETEXT) {
		TYPETEXT = tYPETEXT;
	}
	public String getSERVICEID() {
		return SERVICEID;
	}
	public void setSERVICEID(String sERVICEID) {
		SERVICEID = sERVICEID;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public int getTYPE() {
		return TYPE;
	}
	public void setTYPE(int tYPE) {
		TYPE = tYPE;
	}
	public String getSERVICEDAYTIMESTA() {
		return SERVICEDAYTIMESTA;
	}
	public void setSERVICEDAYTIMESTA(String sERVICEDAYTIMESTA) {
		SERVICEDAYTIMESTA = sERVICEDAYTIMESTA;
	}
	public String getSERVICEDAYTIMEEND() {
		return SERVICEDAYTIMEEND;
	}
	public void setSERVICEDAYTIMEEND(String sERVICEDAYTIMEEND) {
		SERVICEDAYTIMEEND = sERVICEDAYTIMEEND;
	}
	public String getSERVICEDAYTIMESTA1() {
		return SERVICEDAYTIMESTA1;
	}
	public void setSERVICEDAYTIMESTA1(String sERVICEDAYTIMESTA1) {
		SERVICEDAYTIMESTA1 = sERVICEDAYTIMESTA1;
	}
	public String getSERVICEDAYTIMEEND1() {
		return SERVICEDAYTIMEEND1;
	}
	public void setSERVICEDAYTIMEEND1(String sERVICEDAYTIMEEND1) {
		SERVICEDAYTIMEEND1 = sERVICEDAYTIMEEND1;
	}
	public String getSERVICEDAYTIMESTA2() {
		return SERVICEDAYTIMESTA2;
	}
	public void setSERVICEDAYTIMESTA2(String sERVICEDAYTIMESTA2) {
		SERVICEDAYTIMESTA2 = sERVICEDAYTIMESTA2;
	}
	public String getSERVICEDAYTIMEEND2() {
		return SERVICEDAYTIMEEND2;
	}
	public void setSERVICEDAYTIMEEND2(String sERVICEDAYTIMEEND2) {
		SERVICEDAYTIMEEND2 = sERVICEDAYTIMEEND2;
	}
	public String getSERVICEDAYCOUNT() {
		return SERVICEDAYCOUNT;
	}
	public void setSERVICEDAYCOUNT(String sERVICEDAYCOUNT) {
		SERVICEDAYCOUNT = sERVICEDAYCOUNT;
	}
	public Double getMONEY() {
		return MONEY;
	}
	public void setMONEY(Double mONEY) {
		MONEY = mONEY;
	}
	public String getEXPLAINS() {
		return EXPLAINS;
	}
	public void setEXPLAINS(String eXPLAINS) {
		EXPLAINS = eXPLAINS;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	@Override
	public String toString() {
		return "Service [SERVICEID=" + SERVICEID + ", USERID=" + USERID + ", TYPE=" + TYPE + ", SERVICEDAYTIMESTA="
				+ SERVICEDAYTIMESTA + ", SERVICEDAYTIMEEND=" + SERVICEDAYTIMEEND + ", SERVICEDAYTIMESTA1="
				+ SERVICEDAYTIMESTA1 + ", SERVICEDAYTIMEEND1=" + SERVICEDAYTIMEEND1 + ", SERVICEDAYTIMESTA2="
				+ SERVICEDAYTIMESTA2 + ", SERVICEDAYTIMEEND2=" + SERVICEDAYTIMEEND2 + ", SERVICEDAYCOUNT="
				+ SERVICEDAYCOUNT + ", MONEY=" + MONEY + ", EXPLAINS=" + EXPLAINS + ", ADDRESS=" + ADDRESS + "]";
	}
	
	
	
}
