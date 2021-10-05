

public interface vehical {

	default void Aalaramon() {
		System.out.println("Green light is on");
	}
	static void Aalaramoff() {
		System.out.println("Red light is on");
	}
}


public class vehical1  implements vehical {

	public static void main(String[] args) {

		vehical1 v = new vehical1();
		v.Aalaramon();
		vehical.Aalaramoff();

	}

}
