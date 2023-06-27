package javaforBeginners;

public class ObjectRefrence {
	static ObjectRefrence obj;
	static {
		System.out.println(ObjectRefrence.obj);

		ObjectRefrence.obj = new ObjectRefrence();

	}

	public static void main(String[] args) {
		System.out.println(ObjectRefrence.obj);
	}

}
