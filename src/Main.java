public class Main {
    public static void main(String[] args) {

        System.out.println("First example: ");
        sumaxvalor1();

        System.out.println("Second example: ");
        sumaxvalor2();
        System.out.println("by GP");
    }

    public static void sumaxvalor1() {
        System.out.println("Suma paso variables por valor");


        int param1 =10; // first parameter 4bytes
        int param2 =30; // Second parameter 4bytes

        suma(param1, param2);

        System.out.println("********");
    }


    public static void suma(int a, int b){
        System.out.println("La suma de:  ");
        System.out.print(a);
        System.out.print(" + ");
        System.out.println(b);
        System.out.print("es : ");
        System.out.println(a+b);

    }


    public static void sumaxvalor2() {
        System.out.println("Suma paso variables por valor");


        int param1 =20; // first parameter 4bytes
        int param2 =40; // Second parameter 4bytes

        var valor  = suma2(param1, param2);

        System.out.println(valor);
        System.out.println("********");
    }


    public static int suma2(int a, int b){
        return a + b;

    }


}