/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfitclient;

import java.util.Scanner;

/**
 *
 * @author entrar
 */
public class BodyFitClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca su peso en kilogramos(p.e 50):");
        float peso = reader.nextFloat();
        System.out.println("Introduzca su altura en metros(p.e 1,92):");
        float altura = reader.nextFloat();
        float imc = calculoIMC(altura,peso);
        System.out.println("Su IMC es de: " + imc + " que corresponde con un perfil de: " + clasificacionIMC(imc));
    }

    private static Float calculoIMC(float altura, float peso) {
        bodyfitclient.BodyFitWS_Service service = new bodyfitclient.BodyFitWS_Service();
        bodyfitclient.BodyFitWS port = service.getBodyFitWSPort();
        return port.calculoIMC(altura, peso);
    }

    private static String clasificacionIMC(float imc) {
        bodyfitclient.BodyFitWS_Service service = new bodyfitclient.BodyFitWS_Service();
        bodyfitclient.BodyFitWS port = service.getBodyFitWSPort();
        return port.clasificacionIMC(imc);
    }
    
}
