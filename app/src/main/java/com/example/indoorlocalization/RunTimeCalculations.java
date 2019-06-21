package com.example.indoorlocalization;

import java.util.List;

public class RunTimeCalculations {


    // method to find mean
    public float findAverage (List<Float> dataXYZ){
        float mean = 0;
        if(!dataXYZ.isEmpty()) {
            for (float xyz : dataXYZ) {
                mean += xyz;
            }
            return mean / dataXYZ.size();
        }
        return mean;
    }

    //method to find variance
    public float findVariance (List<Float> dataXYZ, float mean){
        float variance = 0;
        for (float xyz : dataXYZ) {
            variance += (float) Math.pow((double)xyz - (double) mean,2);
        }
        return variance / dataXYZ.size();
    }

    //method to find SD
    public static float findStandardDeviation (float variance){
        return (float) Math.sqrt(variance);
    }
}

