interface MyIF {
	// This is a 'normal' interface method declaration.
	// It does not define a default implementaiton.
	int getNumber();

	// This is a default. method. Notice that it provides
	// a default implementation.
	default String getString() {
		return "Default String";
	}
}

// Implement MyIF
class MyIFImp implements MyIF {
	// Only getNumber() defined by MyIF needs to be implement.
	// getString9) can be allowed to default.
	public int getNumber() {
		return 100;
	}
}

// Use the default method
class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIFImp obj = new MyIFImp();

		// Can call getNumber() because it is explicitly implement by MyIFImp
		System.out.println(obj.getNumber());

		// Can also call getString(), because of default implementation
		System.out.println(obj.getString());
	}
}