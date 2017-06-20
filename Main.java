package hamburger;

public class Main {
	
	public static void main(String[] args) {
	
	Hamburger hamburger = new Hamburger("ベーシック", "ソーセージ", 350, "レギュラー");
	hamburger.baseBurger();
	hamburger.addTopping("トマト", 30);
	hamburger.addTopping("レタス", 75);
	hamburger.addTopping("チーズ", 100);
	System.out.println();
	hamburger.itemizeBurger();
	System.out.println();
	hamburger.showBurgersTopping();
	
	System.out.println("----------------------------------------------");
	System.out.println();
	
	HealthyBurger healthyHamburger = new HealthyBurger("ヘルシー", "ベーコン", 500, "ライ麦");
	healthyHamburger.baseBurger();
	System.out.println();
	healthyHamburger.addTopping("トマト", 30);
	healthyHamburger.addTopping("レタス", 75);
	healthyHamburger.addTopping("チーズ", 100);
	healthyHamburger.addTopping("タマゴ", 50);
	healthyHamburger.addTopping("カレー", 50);
	
	System.out.println();
	healthyHamburger.itemizeBurger();
	System.out.println();
	healthyHamburger.addHealthyTopping("アボカド", 80);
	healthyHamburger.addHealthyTopping("ゴマ", 30);
	healthyHamburger.addHealthyTopping("牛脂", 30);
	
	System.out.println();
	healthyHamburger.itemizeBurger();
	System.out.println();
	healthyHamburger.showBurgersTopping();
	
	System.out.println("----------------------------------------------");
	System.out.println();
	
	DeluxeBurger deluxeBurger = new DeluxeBurger("デラックス", "ベーコン＆ソーセージ", 1000, "バンズ＆クラブ");
	System.out.println();
	deluxeBurger.baseBurger();
	System.out.println();
	deluxeBurger.addTopping("トマト", 30);
	System.out.println();
	deluxeBurger.showBurgersTopping();
	
	
	System.out.println();
	
	}
}
