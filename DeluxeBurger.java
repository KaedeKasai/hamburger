package hamburger;

public class DeluxeBurger extends Hamburger{
	
	//デラックスバーガーのコンストラクタ
	public DeluxeBurger(String name, String typesOfMeat, int price, String typesOfBuns) {
		super(name, typesOfMeat, price, typesOfBuns);
		super.addTopping("ドリンク", 100);
		super.addTopping("ポテト", 100);
	}
	
	//トッピングの追加をオーバーライドで不可能にする
	@Override
	public void addTopping(String name, int price){
		System.out.println("このバーガーは、トッピングが出来ません");
	}
}
