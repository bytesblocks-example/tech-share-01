package xyz.bytesblocks.tech;

public class StatsUtil {

    public static double yearOnYear(double current, double last) {
        return (current - last) / last;
    }
    
}
