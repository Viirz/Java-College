package nyoba;

import java.util.Scanner;

public class Weather {
    static final int MAX_DAYS = 10;
    static final int MAX_HOURS = 24;
    static final int MAX_TYPE = 2;

    static double data[][][] = new double[MAX_DAYS][MAX_HOURS][MAX_TYPE];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i=0;i<MAX_DAYS*MAX_HOURS;i++){
            int day = input.nextInt();
            int hours = input.nextInt();
            double tempetarature = input.nextDouble();
            double humidity = input.nextDouble();
            data[day-1][hours-1][0] = tempetarature;
            data[day-1][hours-1][1] = humidity;
        }
        for (int j=0;j<MAX_DAYS;j++){
            double dailyTemperatureTotal = 0; double dailyHumidityTotal = 0;
            for (int k=0;k<MAX_HOURS;k++){
                dailyTemperatureTotal=data[j][k][0];
                dailyHumidityTotal=data[j][k][1];
            }
            double avgDailyTemperatureTotal = dailyTemperatureTotal/MAX_HOURS;
            double avgDailyHudimityTotal = dailyHumidityTotal/MAX_HOURS;

            System.out.println("Day" + j + "avg tempetature is " + (avgDailyTemperatureTotal));
            System.out.println("Day" + j + "avg humidity is " + (avgDailyHudimityTotal));
        }

    }
}
