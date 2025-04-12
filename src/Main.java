import java.util.Scanner; /*importo la biblioteca para usar el scanner*/

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); /*Defino clase para capturar valores por teclado*/
        String nombreEmpleado="", documentoEmpleado = "";
        double salarioBruto, salarioNeto, valorHora = 0, cantidadHoras= 0, deduccionSalud = 0,deduccionPension= 0;
        double horasExtras= 0, valorHorasExtras= 0, bonificacion= 0, fondoSolidarioPensional= 0, valorRetencionFuente= 0;
        double auxilioTransporte= 0,salarioMinimo = 0;


        System.out.println("Ingrese nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese valor de la hora: ");
        valorHora = sc.nextDouble();

        System.out.println("Ingrese cantidad de las horas: ");
        cantidadHoras = sc.nextDouble();
        System.out.println("Ingrese el valor del salario minimo actua: ");
        salarioMinimo = sc.nextDouble();

                if(cantidadHoras >= 24){
                    System.out.println("Se le puede pagar al empleado");
                    salarioBruto = valorHora * cantidadHoras;
                    deduccionPension = salarioBruto * 0.04;
                    deduccionSalud = salarioBruto * 0.04;
                    if(salarioBruto <= (salarioMinimo * 2)){
                        auxilioTransporte = 200000;
                        bonificacion = salarioBruto * 0.1;
                    }
                    else{
                        auxilioTransporte = 0;
                        bonificacion = 0;
                    }
                    if (cantidadHoras > 96){
                        horasExtras = cantidadHoras -96;
                        valorHorasExtras = (valorHora * 0.25) * horasExtras;
                    }
                    System.out.println("detalle de pago" + nombreEmpleado);
                    System.out.println("El salario del empleado: " + nombreEmpleado +" es de $: " + salarioBruto);
                    System.out.println("La deducción por salud es: " + deduccionSalud);
                    System.out.println("La deducción por pensión es: " + deduccionPension);
                    System.out.println("El auxilio de transporte es: " + auxilioTransporte);
                    System.out.println("La bonificación es: " + bonificacion);
                    System.out.println("El pago por horas extras es de: " + valorHorasExtras);
                    System.out.println("El salario neto es de: " + (salarioBruto - deduccionPension - deduccionSalud +auxilioTransporte + bonificacion + valorHorasExtras));

                }
                else{
                    System.out.println("Le faltan: " + (24- cantidadHoras) + "horas de trabajo");
        }
    }
}