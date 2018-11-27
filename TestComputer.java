package homework2;

public class TestComputer {

	public static void main(String[] args) {
		Computer lenevo = new Computer();

		Computer.showOs();
		System.out.println();
		lenevo.showPrice();
		lenevo.showSize();
		lenevo.showWeight(1);

		Computer macbook = new Computer();
		System.out.println();
		macbook.Os = "IOS";
		macbook.showOs();
		System.out.println();
		
		
		Computer samsung = new Computer(8, 512);
        
		samsung.ram=32;
		samsung.price = 999;
		samsung.showPrice();

	}

}
