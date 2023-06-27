package javaforBeginners;

class Student {
	static int computeCount;

	int id;
	String name;
	int age;
	char degree;
	double gpa;
	long phone;
	boolean international;
	double tutionFees;
	double internationalFees;

	void compute() {
		computeCount++;
		int nextId = id + 1;

		if (international) {
			tutionFees += internationalFees;
		}

		System.out.println("id= " + id);
		System.out.println("name= " + name);
		System.out.println("age= " + age);
		System.out.println("gpa= " + gpa);
		System.out.println("phone= " + phone);
		System.out.println("tutionFees= " + tutionFees);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.age = 24;
		s.id = 1000;
		s.degree = 'B';
		s.gpa = 84.5;
		s.name = "ujjwal";
		s.internationalFees = 5000;
		s.international = true;
		s.phone = 2224_654_870l;
		s.tutionFees = 17000;
		s.compute();
		s.compute();

		System.out.println("ComputeCount= " + Student.computeCount);
	}
}
