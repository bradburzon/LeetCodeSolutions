public class CelsiusToKelvinFahrenheit {

    public double[] convertTemperature(double celsius) {
        double[] conversion = new double[2];
        conversion[0] = celsius + 273.15;
        conversion[1] = celsius * 1.8 + 32.00;
        return conversion;
    }
}
