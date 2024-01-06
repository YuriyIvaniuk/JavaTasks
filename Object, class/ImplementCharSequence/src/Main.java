public class Main{
    public static void main(String[] args){
        TestClass tenceClass=new TestClass("Interface and");
        System.out.println((tenceClass.charAt(0)));
        System.out.println(tenceClass.length());
        System.out.println(tenceClass.subSequence(0,13));
        System.out.println(tenceClass.isEmpty());
        System.out.println(tenceClass.toString());
    }
}