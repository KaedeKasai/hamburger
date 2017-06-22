package hamburger;

/*
 * 
 * ----- オブジェクト指向を使い、色んなハンバーガーを作ってみよう！ -----
 * 
 * 
 * 大まかな内容について
 * 
 * ハンバーガーは「名前」、「肉の種類」、「肉とバンズの値段」、「バンズの種類」の値を受け取ってインスタンス化される
 * 他には、トッピングが四つまで付け足すことができ、ハンバーガーのまとめた値段を表示したり、トッピングの内容を表示するメソッドなどがある。
 * 
 * ヘルシーハンバーガーは、ハンバーガーを継承していて、新たにヘルシートッピングを二つ追加できる。
 * デラックスハンバーガーは、ハンバーガーを継承していて、トッピングとしてポテトとドリンクが自動追加され、それ以外のトッピングはできない。
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		
		//レッツクッキング♪
		//普通のハンバーガーを作ろう！
		makeHamburger();
		System.out.println("\n---------------------------------------\n");
		//ヘルシーなハンバーガーを作ろう！
		makeHealthyHamburger();
		System.out.println("\n---------------------------------------\n");
		//デラックスなハンバーガーを作ろう！
		makeDeluxeBurger();
		
	}
	public static void makeHamburger() {
	
		Hamburger hamburger = new Hamburger("ベーシック", "ソーセージ", 350, "レギュラー");
		
		hamburger.baseBurger();
		hamburger.addTopping("トマト", 30); //トッピングの名前と値段を引数にする
		hamburger.addTopping("レタス", 75);
		hamburger.addTopping("チーズ", 100);
		hamburger.itemizeBurger();
		hamburger.showBurgerToppings();
		
	}
	
	public static void makeHealthyHamburger() {
		
		HealthyBurger healthyHamburger = new HealthyBurger("ヘルシー", "ベーコン", 500, "ライ麦");
		
		healthyHamburger.baseBurger();
		healthyHamburger.addTopping("トマト", 30);
		healthyHamburger.addTopping("レタス", 75);
		healthyHamburger.addTopping("チーズ", 100);
		healthyHamburger.addTopping("タマゴ", 50);
		healthyHamburger.itemizeBurger();
		healthyHamburger.addHealthyTopping("アボカド", 80);
		healthyHamburger.addHealthyTopping("ゴマ", 30);
		healthyHamburger.itemizeBurger();
		healthyHamburger.showBurgerToppings();
	}
	
	public static void makeDeluxeBurger() {
		
		DeluxeBurger deluxeBurger = new DeluxeBurger("デラックス", "ベーコン＆ソーセージ", 1000, "バンズ＆クラブ");
		
		deluxeBurger.baseBurger();
		deluxeBurger.showBurgerToppings();
	}
}
