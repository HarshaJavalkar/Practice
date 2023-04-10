package begining.learning;

public class Builder {

	private int id ;
	private String builderName ;
	private String age ;
	private String contact ;
	private String Adhar ;
	private String Bank ;
	private String AcctNo ;
	private String IFC ;
	private  Exp exp ;
	public Builder(int id, String builderName, String age, String contact, String adhar, String bank, String acctNo,
			String iFC, Exp exp) {
		super();
		this.id = id;
		this.builderName = builderName;
		this.age = age;
		this.contact = contact;
		Adhar = adhar;
		Bank = bank;
		AcctNo = acctNo;
		IFC = iFC;
		this.exp = exp;
	}
	public Builder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbuilderName() {
		return builderName;
	}
	public void setbuilderName(String builderName) {
		this.builderName = builderName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAdhar() {
		return Adhar;
	}
	public void setAdhar(String adhar) {
		Adhar = adhar;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getAcctNo() {
		return AcctNo;
	}
	public void setAcctNo(String acctNo) {
		AcctNo = acctNo;
	}
	public String getIFC() {
		return IFC;
	}
	public void setIFC(String iFC) {
		IFC = iFC;
	}
	public Exp getExp() {
		return exp;
	}
	public void setExp(Exp exp) {
		this.exp = exp;
	}
	
	
	

}
