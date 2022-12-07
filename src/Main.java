public class Main {
    public static void main(String[] args) {

        System.out.println("First example: ");
        sumaxvalor1();

        System.out.println("Second example: ");
        sumaxvalor2();

        System.out.println("Third example: "); // con clases y sin parámetros
        sumaPuntero();


        System.out.println("four example: "); // con clases y sin parámetros puertas de carro
        addiPuerta();

        System.out.println("********");


        // BUCLES
        System.out.println("Ejercicios de BUCLES "); // con clases y sin parámetros puertas de carro
        correBucles();
        System.out.println("********");
        // SWICH
        System.out.println("Ejercicios de SWICH "); // con clases y sin parámetros puertas de carro
        correStwich();
        System.out.println("********");


        System.out.println("by GP");

    }

    public static void sumaxvalor1() {
        System.out.println("Suma paso variables por valor al pasarlas se duplicán");


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


    public static void sumaPuntero() {

        Potato ejePotato = new Potato(); // se declara y crea una estancia de la clase
        System.out.print("Comienza con los siguientes brazos: ");
        System.out.println(ejePotato.brazos);
        ejePotato.QuitarBrazo(); // se resta una vez
        ejePotato.QuitarBrazo(); // se vuelve a restar
        System.out.print("Termina con : ");
        System.out.println(ejePotato.brazos);
        System.out.println("********");
    }

    public static void addiPuerta(){
        Carro miCarro = new Carro();
            System.out.print("Puertas iniciales : ");
            System.out.println(miCarro.puertas);

            miCarro.sumaPuertas();
            System.out.print("Puertas finales : ");
            System.out.println(miCarro.puertas);
        System.out.println("********");
        }


    public static void correBucles(){
        System.out.println("BUCLES While: "); // con clases y parámetros
        Bucles ejeBucles = new Bucles();
        ejeBucles.bucleWhile(0); // NO imprime porque primero valida para ejcutar

        System.out.println("BUCLES DOWhile: "); // con clases y parámetros
        ejeBucles.bucleDoWhile(0); // imprime cero porque primero ejecuta y luego valida

        System.out.println("BUCLES FOR: "); // con clases y sin parámetros
        ejeBucles.bucleFor();

        System.out.println("BUCLES FOR ARRAY: "); // con clases y sin parámetros
        ejeBucles.bucleForArray();

    }

    public static void correStwich(){
        System.out.println("Case: "); // con clases y parámetros
        Swich ejeSwitch = new Swich();
        //String estacion = "INVIERNO";
        //String estacion = "VERANO";
        //String estacion = "OTOÑO";
        String estacion = "PRIMAVERA";
        //String estacion = "A";
        ejeSwitch.SwitchCase(estacion); // SOLO DBE IMPRIMIR LA ESTACIÓN x el BREAK

        System.out.println("********");
        String dia = "SABADO";
        ejeSwitch.SwitchCasesinBrake(dia); // Sin usar el BREAK
        System.out.println("********");

    }




    }
