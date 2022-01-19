package com.hiberus.challenge;

public class Ejer1 {
	public static void main(String[] args) {
		Base1 b = new Derived1();
		;
		b.show();
	}
}

class Base1 {
	final public void show() {
		System.out.println("Base: Base::show()");
	}
}

class Derived1 extends Base1 {
	public void show() {
		System.out.println("Derived::show() called");
	}
}