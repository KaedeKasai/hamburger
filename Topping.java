package hamburger;

public class Topping {
	
	private String name; //トッピング名
	private int    price; //トッピングの価格
	
	//トッピングのコンストラクタ
	public Topping(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}