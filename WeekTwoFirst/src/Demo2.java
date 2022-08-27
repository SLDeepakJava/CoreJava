
class P {

	P() {
		System.out.println("p const");
	}

}

class Q extends P {
	Q() {
		System.out.println("q const");
	}

}

class R extends Q {
	R() {
		super();
		System.out.println("r const");
	}
}

public class Demo2 {

	public static void main(String[] args) {

		R r = new R();
	}

}
