package hamburger;

public class HealthyBurger extends Hamburger{
	
	private Topping[] healthyTopping;               //ヘルシートッピングの内容
	private int        healthyToppingNum;           //ヘルシートッピング数
	private final int MAXIMUM_HEALTHY_TOPPING = 2; //ヘルシートッピングの最大数
	
	//ヘルシーバーガーのコンストラクタ
	public HealthyBurger(String name, String typesOfMeat, int price, String typesOfBuns) {
		super(name, typesOfMeat, price, typesOfBuns);
		healthyTopping = new Topping[MAXIMUM_HEALTHY_TOPPING];
		healthyToppingNum = 0;
	}
	
	//ヘルシートッピング追加
	public void addHealthyTopping(String name, int price){
		//ヘルシートッピングが2つを超えた時
		if(moreThan2HealthyToppings()){ 
			System.out.println("これ以上トッピング出来ません。");
		}else{
			//引数からトッピングをインスタンス化し、ヘルシートッピング配列に格納する
			Topping topping = new Topping(name, price);
			this.healthyTopping[healthyToppingNum] = topping;
			this.healthyToppingNum++;
			//トッピングの金額をバーガーの総合代金にプラス
			this.setTotalPrice(this.getTotalPrice() + price);
			System.out.println(name + "を" + price + "円でヘルシートッピングとして加えます。");
		}
	}
	
	//トッピング、ヘルシートッピングの内容表示
	@Override
	public void showBurgerToppings(){
		
		int toppingCount = 0; //ループカウンタ
		
		//継承元のハンバーガーのshowBurgerToppingsを呼び出す
		super.showBurgerToppings();
		System.out.println(this.getName() + "バーガーのヘルシートッピング一覧");
		//カウンターが現在のトッピング数以上になれば終了する
		while(healthyToppingsNumIsCounter(toppingCount)){
			//トッピング配列内のトッピングオブジェクトのgetterを呼び出し、結果を定数に格納
			final String toppingName = this.healthyTopping[toppingCount].getName();
			final int     toppingPrice = this.healthyTopping[toppingCount].getPrice();
			
			System.out.println("ヘルシートッピング:" + toppingName + " " + toppingPrice + "円");
			toppingCount++;
		}
	}
	
	//addHealthyToppingメソッドのif文の条件式の結果を返すメソッド
	private boolean moreThan2HealthyToppings(){
		return healthyToppingNum >= MAXIMUM_HEALTHY_TOPPING;
	}
	
	//showBurgersToppingメソッドのwhile文の条件式の結果を返すメソッド
	private boolean healthyToppingsNumIsCounter(int toppingCount){
		return toppingCount < healthyToppingNum;
	}
}
