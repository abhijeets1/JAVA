/*
	If a interface is implemented it means only that interface is 
	implemented not the inherited interfaces but it have that features
	of inherited interfaces
*/
import java.lang.reflect.*;
class mainclass {

	public static void main(String[] args) {
		A obj = new A();
		Class co = obj.getClass();
		System.out.println(co.getName());
		System.out.println();

		Method methods[] = co.getDeclaredMethods();
		for(Method a : methods) System.out.println(a);
		System.out.println();

		Field fields[] = co.getDeclaredFields();
		for(Field a : fields) System.out.println(a);
		System.out.println();

		Class s = co.getSuperclass();
		System.out.println(s.getName());	
		System.out.println();

		Class i[] = co.getInterfaces();
		for(Class a : i) System.out.println(a);
		System.out.println();
	}

}

interface I1 {}
interface I2 extends I1{}
interface I3 extends I2{}
class B {}

class A extends B implements I3,I2,I1 { 
	int num;
	float f;
	Double d;
	Long l;
	void fun() {}
	void fun(int a) {}
	static void fun_2() {}
}

/* 
OP :-
A

void A.fun(int)
void A.fun()
static void A.fun_2()

int A.num
float A.f
java.lang.Double A.d
java.lang.Long A.l

B

interface I3
interface I2
interface I1

*/