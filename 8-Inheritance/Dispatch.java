// Dynamic Method Dispatch
class A {
	void callme() {
		System.out.println("Inside A's callme method.");
	}
}

class B extends A {
	// override callme()
	void callme() {
		System.out.println("Inside B's callme method.");
	}
}

class C extends A {
	// override callme()
	void callme() {
		System.out.println("Inside C's callme method.");
	}
}

class Dispatch {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		A r;	// obtain a reference of type A

		r = a;	// r refers to an A object
		r.callme();	// Calls A's version

		r = b;	// r refers to a B object
		r.callme();	// Calls B's version

		r = c;	// r refers to a C object
		r.callme();	// Calls C's version
	}
}