class StringApp
{
    public static void main(String[] args)
    {
        Record r = new Record();
        System.out.println(r);
        Record r1 = new Record();
        System.out.println(r1);
        String s = "xyz";
        System.out.println("s:" + s);
        System.out.format("s@%x\n", System.identityHashCode(s));
        r.s = "xyz";
        System.out.format("r.s@%x\n", System.identityHashCode(r.s));
        r1.s = "xyz";
        System.out.format("r1.s@%x\n", System.identityHashCode(r1.s));
        s = s + "1";
        System.out.println("s: " + s);
        System.out.println("r.s: " + r.s);
        System.out.format("s@%x\n", System.identityHashCode(s));
        System.out.format("r.s@%x\n", System.identityHashCode(r.s));
    }
}

class Record
{
    int i;
    boolean b;
    double x;
    String s;
}
