*package GalToLit;

import java.util.Scanner;

public class GalToLit {
public static void main(String[] args) {
// declare as variáveis
double gallons=10;
double liters=0;
Scanner in = new Scanner(System.in);
//solicite a entrada do usuário
System.out.println("Enter a number of gallons: ");
//adicione o cálculo aqui
gallons=in.nextDouble();
liters=gallons*3.785;
// exiba o resultado para o usuário
System.out.println(gallons+" gallons equals "+liters+" liters");

}

}


