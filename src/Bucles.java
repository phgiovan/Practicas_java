public class Bucles {


        public void bucleWhile(int valor){
            int valorhere=valor;
            while (valorhere > 0) {
                System.out.println(valorhere);
                valorhere--;
            }
        }

    public void bucleDoWhile(int valor){
        int valorhere=valor;
        do {
            System.out.println(valorhere);
            valorhere--;
        }while (valorhere > 0);
    }

    public void bucleFor(){

        for  (int i=5; i>0; i--){

            System.out.println(i);
        }

    }
    public void bucleForArray(){

            int arreglo[]= {10,20,30,40};
        for  (int i=0; i < arreglo.length; i++){

            System.out.println(arreglo[i]);
        }

    }
}
