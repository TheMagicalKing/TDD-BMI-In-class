/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 23/09/2019
 */

public class Bmi {

    static double bmiBeregning(double hojde, double vaegt) {

        // Resultat med mange decimaler
        double resultat = vaegt / Math.pow(hojde, 2);
        // Resultat med 2 decimaler
        resultat = Math.round(resultat*10.0)/10.0;
        return resultat;
    }

}
