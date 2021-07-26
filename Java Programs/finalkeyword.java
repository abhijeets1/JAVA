final class class1
{
	final int num1 = 10; //cannot be changed
	int num2 = 100;      //can be changed
};
/*class class2 extends class1  //Error
{
	can not extend final class
};*/
class finalkeyword
{
	final public static void main(String args[])
	{
		final int num = 1010;
		//num = 2020;     //Error
		System.out.println(num);

		class1 obj = new class1();
		//obj.num = 10;   //Error
		obj.num2 = 1000;
		System.out.println(obj.num2);
	}
}