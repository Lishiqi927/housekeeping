package com.wl.po;


public class User{
	private String USERID;
	private String USERNUMBER;
	private String USERPASSWORD;
	private String USERNAME;
	private String USERPHONE;
	private int USERTYPE;
	private int USERAGE;
	private int USERSTATUS;
	private String REMAKE;
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	
	public String getUSERNUMBER() {
		return USERNUMBER;
	}
	public void setUSERNUMBER(String uSERNUMBER) {
		USERNUMBER = uSERNUMBER;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getUSERPASSWORD() {
		return USERPASSWORD;
	}
	public void setUSERPASSWORD(String uSERPASSWORD) {
		USERPASSWORD = uSERPASSWORD;
	}
	public String getUSERPHONE() {
		return USERPHONE;
	}
	public void setUSERPHONE(String uSERPHONE) {
		USERPHONE = uSERPHONE;
	}
	public int getUSERTYPE() {
		return USERTYPE;
	}
	public void setUSERTYPE(int uSERTYPE) {
		USERTYPE = uSERTYPE;
	}
	public int getUSERAGE() {
		return USERAGE;
	}
	public void setUSERAGE(int uSERAGE) {
		USERAGE = uSERAGE;
	}
	public int getUSERSTATUS() {
		return USERSTATUS;
	}
	public void setUSERSTATUS(int uSERSTATUS) {
		USERSTATUS = uSERSTATUS;
	}
	public String getREMAKE() {
		return REMAKE;
	}
	public void setREMAKE(String rEMAKE) {
		REMAKE = rEMAKE;
	}
	@Override
	public String toString() {
		return "User [USERID=" + USERID + ", USERNAME=" + USERNAME + ", USERPASSWORD=" + USERPASSWORD + ", USERPHONE="
				+ USERPHONE + ", USERTYPE=" + USERTYPE + ", USERAGE=" + USERAGE + ", USERSTATUS=" + USERSTATUS
				+ ", REMAKE=" + REMAKE + "]";
	}
	
	
	
	
}
