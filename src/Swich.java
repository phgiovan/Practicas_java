public class Swich {


    public void SwitchCase(String estacion){
        String station = estacion;

        switch(station){
            case "INVIERNO":
                System.out.println("Es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("Es PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("Es VERANO");
                break;
            case "OTOÑO":
                System.out.println("Es OTOÑO");
                break;
            default:
                System.out.println("NO se que estación es!");
        }
    }

    public void SwitchCasesinBrake(String estacion){
        String station = estacion;

        switch(station){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Es día LABORAL");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("no Es día LABORAL");
                break;
            default:
                System.out.println("NO se que ddí es!");
        }
    }



}
