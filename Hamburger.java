package hamburger;

public class Hamburger {
	
	private String    name;                 //バーガーの名前       
	private String    typesOfMeat;          //肉の種類
	private int        basePrice;           //初期の値段
	private String    typesOfBuns;          //バンズの種類   
	private Topping[] burgersTopping;      //トッピング内容
	private int        numberOfTopping;     //現在のトッピング数
	private int        totalPrice;          //バーガー全体の値段
	private final int MAXIMUM_TOPPING = 4; //トッピングの最大数
	
	//ハンバーガーのコンストラクタ
	public Hamburger(String name, String typesOfMeat, int basePrice, String typesOfBuns) {
		super();
		this.name             = name;
		this.typesOfMeat      = typesOfMeat;
		this.basePrice        = basePrice;
		this.typesOfBuns      = typesOfBuns;
		this.burgersTopping   = new Topping[MAXIMUM_TOPPING]; //トッピングの最大数分、配列を用意
		this.numberOfTopping  = 0;
		this.totalPrice       = basePrice;
	}
	
	//トッピング追加
	public void addTopping(String name, int basePrice){
		//トッピングが4つを超えた時
		if(moreThan4Toppings()){ 
			System.out.println("これ以上トッピング出来ません。");
		}else{
			//引数からトッピングをインスタンス化し、トッピング配列に格納する
			Topping topping = new Topping(name, basePrice);
			this.burgersTopping[numberOfTopping] = topping;
			//トッピングの金額をバーガーの総合代金にプラス
			this.totalPrice += basePrice; 
			System.out.println(name + "を" + basePrice + "円で加えます。");
			this.numberOfTopping++;
		}
	}
	
	//初期のバーガーの設定
	public void baseBurger(){
		System.out.println("「" + this.typesOfBuns + "」バンズと「" + this.typesOfMeat +
				"」からなる、「" + this.name + "」ハンバーガーの値段は、" + this.basePrice + "円です。");
	}
	
	//バーガーの総合値段
	public void itemizeBurger(){
		System.out.println("トッピングを加えたバーガーの金額は、" + this.totalPrice + "円です。");
	}
	
	//バーガーのトッピング内容表示
	public void showBurgersTopping(){
		
		int toppingCount = 0; //ループカウンター
		
		System.out.println(this.name + "バーガーのトッピング一覧");
		//カウンターが現在のトッピング数と同じになれば終了する
		while(ToppingsNumIsCounter(toppingCount)){
			//トッピング配列内のトッピングオブジェクトのgetterを呼び出し、結果を定数に格納
			final String toppingName = this.burgersTopping[toppingCount].getName();
			final int     toppingPrice = this.burgersTopping[toppingCount].getPrice();
			System.out.println("トッピング:" + toppingName + " " + toppingPrice + "円");
			toppingCount++;
		}
	}
	
	//addToppingのif文の条件式の結果を返すメソッド
	public boolean moreThan4Toppings() {
		return numberOfTopping >= MAXIMUM_TOPPING;
	}
	
	//showBurgersToppingのwhile文の条件式の結果を返すメソッド
	public boolean ToppingsNumIsCounter(int toppingCount) {
		return toppingCount < numberOfTopping;
	}
	
	public void setTotalPrice(int totalbasePrice) {
		this.totalPrice = totalbasePrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	public String getName() {
		return name;
	}
}
