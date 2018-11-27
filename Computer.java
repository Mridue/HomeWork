package homework2;

class Computer {

	static String Os = "Windows";
	int price = 1200;
	int size = 15;
	int weight = 5;
	int ram ;

	public Computer() {
	}

	public Computer(int ram, int ssd) {
		this.ram = ram;
		ram=16;
		System.out.println(ram + " GB is only Available.\nHard Drive " + ssd);
	}

	public static void showOs() {
		System.out.println("The Operating System is: "+Os);
	}

	public  void showPrice() {
		System.out.println("The Price is: $"+price );
	}

	public int showSize() {
		System.out.println(size+" inches");
		return size;
	}

	public void showWeight(int option) {
		if (option ==1) {
		System.out.println(weight+" pounds");}
		else {System.out.println("Not Available");}
	}

}
