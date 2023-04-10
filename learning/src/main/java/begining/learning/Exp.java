package begining.learning;

public class Exp {

	
	private int id ;
	private String owner ;
	private String  location ;
	private String Disputes;
	private String Rating;
	private String exptdCost ;
	private String settldCost ;
	public Exp(int id, String owner, String location, String disputes, String rating, String exptdCost,
			String settldCost) {
		super();
		this.id = id;
		this.owner = owner;
		this.location = location;
		Disputes = disputes;
		Rating = rating;
		this.exptdCost = exptdCost;
		this.settldCost = settldCost;
	}
	public Exp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDisputes() {
		return Disputes;
	}
	public void setDisputes(String disputes) {
		Disputes = disputes;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	public String getExptdCost() {
		return exptdCost;
	}
	public void setExptdCost(String exptdCost) {
		this.exptdCost = exptdCost;
	}
	public String getSettldCost() {
		return settldCost;
	}
	public void setSettldCost(String settldCost) {
		this.settldCost = settldCost;
	}
	

		    
}
