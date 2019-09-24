/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 23/09/2019
 */

public class Bmi {


    /** Denne metode returnerer BMI for indtastet højde og vægt
     *  -- Vægt skal være i kg
     *  -- Højde skal være i meter
     *  -- Hvis ugyldige parametre indtastes, så vil denne metode returne -1
     */
    static double bmiBeregning(double hojde, double vaegt) {

        final double MIN_HOJDE = 0.01;
        final double MAX_HOJDE = 3.0;
        final double MIN_vaegt = 20.0;
        final double MAX_vaegt = 750.0;


        // Resultat med mange decimaler
        double resultat = vaegt / Math.pow(hojde, 2);
        // Vi runder resultatet ned til 2 decimaler (tak, Emil)
        resultat = Math.round(resultat * 10.0) / 10.0;

        if (hojde > MAX_HOJDE || hojde < MIN_HOJDE || vaegt > MAX_vaegt || vaegt < MIN_vaegt) {
            return -1;
        }
        if (resultat < 18.5) {
            System.out.println("Din BMI siger du er Undervægtig");
        } else if (18.5 <= resultat && resultat < 25) {
            System.out.println("Din BMI siger du er Normalvægtig");
        }else if (25<=resultat && resultat<30){
            System.out.println("Din BMI siger du er Overvægtig");
    }else if (30<=resultat && resultat<40){
            System.out.println("Din BMI siger du er Svært Overvægtig");
        }else{
            System.out.println("Din BMI siger du er Ekstremt Overvægtig");
        }
        return resultat;

        }
    }


