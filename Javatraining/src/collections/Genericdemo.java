package collections;

public class Genericdemo {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<Integer>();
        g.setData(201);
        g.setData(202);
        System.out.println(g.getData());

        Generics<String> g1 = new Generics<String>();
        g1.setData("TNS");
        System.out.println(g1.getData());
    }
}
