package first_semester_eksamen;

import impl.Time;

public interface Sample extends Comparable<Sample> {
    public String getDate();
    public Time getTime();
    public int getAmplitude();
    
}
