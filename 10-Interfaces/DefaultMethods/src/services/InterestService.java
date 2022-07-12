package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    // Promovendo implementação padrão para métodos, de modo a evitar repetição de código e de classes abstratas.
    default double payment(double amount, int months) { // Método Concretos a partir do Java 8.
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.00, months);
    }
}
