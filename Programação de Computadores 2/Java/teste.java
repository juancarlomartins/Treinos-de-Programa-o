//Aluno: Juan Carlo Teles Martins - 202504940038

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sistema de detecção de intrusos.\n");
        
        System.out.print("Digite o número de andares do prédio: ");
        int numeroAndares = scanner.nextInt();
        
        int[] sensoresLigadosPorAndar = new int[numeroAndares];
        
        for (int andar = 1; andar <= numeroAndares; andar++) {
            System.out.println("\n ANDAR " + andar + ".");
            
            System.out.print("Quantos sensores existem no " + andar + "º andar? ");
            int quantidadeSensores = scanner.nextInt();
            
            int contadorLigados = 0;
            boolean temIntruso = false;
            
            for (int sensor = 1; sensor <= quantidadeSensores; sensor++) {
                System.out.print("Sensor " + sensor + " - Está ligado? (1 - Sim / 0 - Não): ");
                int estado = scanner.nextInt();
                
                if (estado == 1) {
                    contadorLigados++;
                    temIntruso = true;
                    System.out.println("Alerta! Movimento no Sensor " + sensor);
                }
            }
            
            sensoresLigadosPorAndar[andar - 1] = contadorLigados;
            
            System.out.println("\n→ No " + andar + "º andar: " + contadorLigados + " sensor(es) ligado(s)");
            
            if (temIntruso) {
                System.out.println("Intruso detectado neste andar!");
            } else {
                System.out.println("Nenhum intruso neste andar.");
            }
        }
        
        System.out.println("RESULTADO FINAL");
        
        System.out.println("\nQuantidade de sensores ligados por andar:");
        for (int i = 0; i < numeroAndares; i++) {
            System.out.println("Andar " + (i + 1) + ": " + sensoresLigadosPorAndar[i] + " sensores ligados");
        }
        
        int totalLigados = 0;
        for (int i = 0; i < numeroAndares; i++) {
            totalLigados += sensoresLigadosPorAndar[i];
        }
        
        if (totalLigados > 0) {
            System.out.println("\n\nAlerta, " + totalLigados + " sensores detectaram intruso!");
        } else {
            System.out.println("Seguro, Nenhum intruso detectado.");
        }
        
        scanner.close();
    }
}