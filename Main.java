package hamburger;

public class Main {
	
	public static void main(String[] args) {
		
		makeHamburger();
		
		System.out.println("\n---------------------------------------\n");
		makeHealthyHamburger();
		System.out.println("\n---------------------------------------\n");
		makeDeluxeBurger();
		
	}
	
	public static void makeHamburger() {
	
	Hamburger hamburger = new Hamburger("ベーシック", "ソーセージ", 350, "レギュラー");
		hamburger.baseBurger();
		hamburger.addTopping("トマト", 30);
		hamburger.addTopping("レタス", 75);
		hamburger.addTopping("チーズ", 100);
		hamburger.itemizeBurger();
		hamburger.showBurgersTopping();
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
		healthyHamburger.showBurgersTopping();
	}
	
	public static void makeDeluxeBurger() {
		DeluxeBurger deluxeBurger = new DeluxeBurger("デラックス", "ベーコン＆ソーセージ", 1000, "バンズ＆クラブ");
		deluxeBurger.baseBurger();
		deluxeBurger.showBurgersTopping();
	}
}
