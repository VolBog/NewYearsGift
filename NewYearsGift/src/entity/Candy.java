package entity;

public abstract class Candy {

	private int id;
	private String name;
	private int weight;
	private int sugarAmount;

	public Candy() {}
	
	
	public Candy(int id, String name, int weight, int sugarAmount) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.sugarAmount = sugarAmount;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) throws Exception {
		if(weight > 0){
		this.weight = weight;
		}else{
			throw new Exception("Weight is not < 0");
		}
	}

	public int getSugarAmount() {
		return sugarAmount;
	}

	public void setSugarAmount(int sugarAmount) throws Exception {
		if(sugarAmount > 0) {
			this.sugarAmount = sugarAmount;
		}else{
			throw new Exception("Sugar amount < 0");
		}
	}
}