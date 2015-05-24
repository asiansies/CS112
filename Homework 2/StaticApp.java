class StaticApp
{
	int i;
    static int j;
	public static void main(String[] args)
	{
		System.out.println("main@0");
		//i = 1;
		j = 1;
		System.out.println("main@1");
		StaticApp st = new StaticApp();
		System.out.println("main@1.1: setting st.i to 1");
		st.i = 1;
		System.out.println("main@1.2: setting st.j to 5");
		st.j = 5;
		System.out.println("main@2");
		StaticApp st1 = new StaticApp();
		st1.i = -3;
		System.out.println("st1.i: " + st1.i);
		System.out.println("main@2.1: setting st1.j to -5");
		st1.j = -5;
		System.out.println("st1.j: " + st1.j);
		System.out.println("main@2.2: st.i is supposed to be +1; is it? " + st.i);
		System.out.println("main@2.2: st.j is supposed to be +5; is it? " + st.j);
		System.out.println("main@3");
		System.out.println("main@3.1: setting StaticApp.j to -9");
		StaticApp.j = -9;
		System.out.println("main@3.2: what happened to st.j? " + st.j);
		System.out.println("main@3.3: and what happened to st1.j? " + st1.j);
		System.out.println("main@4");
		B b = new B();
		b.printStaticJ();
		/*
		 */
	}
}
class B
{
	public void printStaticJ()
	{
		System.out.println("B::printStaticJ@0: StaticApp.j: " + StaticApp.j);
	}
}