/*
— Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
comprado por uma pessao em real.
— Informe quantos reais a pessoa vai pagar pelos dólares,
considerando ainda que a pessao terá que pagar 6% de IOF sobre o valor em dólar.
— Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
 */

package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calculateConvertion(double dollarPrice, double dollarQuantity){
        return dollarQuantity * dollarPrice;
    }

    public static double calculateIOF(double dollarConverted){
        return dollarConverted * IOF;
    }
}
