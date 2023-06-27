package javaforBeginners;

public final class Keyword_final {  //this class cannot be inherited as it is a final class

	final float pi=3.14f;   //value cannot be changed as it is a final variable....
	
	public static void main(String[] args) {
     
		Keyword_final obj=new Keyword_final();
//		obj.pi=3.21f;
		System.out.println(obj.pi);
	}

}
