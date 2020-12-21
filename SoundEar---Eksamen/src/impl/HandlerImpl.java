package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.Sample;
import first_semester_eksamen.TimeFormatException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HandlerImpl implements Handler {

    public static final String FILENAME = "Samples.csv";

    @Override
    public String readFile(String filename) throws IOException {
//        throw new UnsupportedOperationException("Not supported yet.");

        Scanner scanner = new Scanner(new File("Samples.csv"));
        StringBuilder builder = new StringBuilder();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            builder.append(line);
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }

    @Override
    public ArrayList<Sample> getSamples(String data) throws TimeFormatException {
//        throw new UnsupportedOperationException("Not supported yet.");

        ArrayList<Sample> s = new ArrayList<>();
        for (String line : data.split(System.lineSeparator())) {
            String[] values = line.split(",");

//            date
            String date = values[0].trim();

//            time
            String _time = values[1].trim();
            Time time;
            try {
                time = new Time(_time);
            } catch (IllegalArgumentException ex) {
                throw new TimeFormatException(ex.getMessage());
            }

//            amp
            String _amp = values[2].trim();
            int amp = Integer.parseInt(_amp);

//            peak
            if (values.length == 4) {
                String _peak = values[3].trim();
                int peak = Integer.parseInt(_peak);
//                instantiate slowSample and add to list
                s.add(new SlowSampleImpl(date, time, amp, peak));
            } else {
//                instantiate sample and add to list
                s.add(new SampleImpl(date, time, amp));
            }
        }
        return s;

//        ArrayList<Sample> dataInPut = new ArrayList<>();
//        
//        for (String line : data.split("\n")) {
//            
////            Date
//            String date = line.split(",")[0].trim();
//            
////            Time
//            String _time = line.split(",")[1].trim();
//            Time time = new Time(_time);
//            
////            amp
//            String _amp = line.split(",")[2].trim();
//            int amp = Integer.parseInt(_amp);
//            
//            SampleImpl samples = new SampleImpl(date, time, amp);
//            dataInPut.add(samples);
//            
//            
//        }
//        return dataInPut;
    }

    @Override
    public Sample getHighestAmplitude(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        Sample highest = samples.get(0);
        for (int i = 0; i < samples.size(); i++) {
            Sample s = samples.get(i);
            if (s.getAmplitude() > highest.getAmplitude()) {
                highest = s;
            }
        }
        return highest;

    }

    @Override
    public Sample getBiggestRise(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        int bigggestRise = 0;
        Sample biggestRiseSample = samples.get(0);
        for (int i = 1; i < samples.size(); i++) {
            Sample current = samples.get(i);
            Sample prev = samples.get(i - 1);
            int rise = current.getAmplitude() - prev.getAmplitude();
            if (rise > bigggestRise) {
                bigggestRise = rise;
                biggestRiseSample = current;
            }
        }
        return biggestRiseSample;
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        for (Sample s : samples) {
            if (s.getAmplitude() > limit) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortByTime(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

//        Metode 1
//        Collections.sort(samples, Comparator.comparing(Sample::getAmplitude));
//        Metode 2
//        Collections.sort(samples);
//
//        Collections.sort(samples, (s1, s2) -> {
//            return s1.getTime().compareTo(s2.getTime());
//        });
    }

    @Override
    public void sortByAmplitude(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        Collections.sort(samples);

        Collections.sort(samples, (s1, s2) -> {
            return s2.getAmplitude() - s1.getAmplitude();
        });
    }

    @Override
    public ArrayList<Sample> getLoudSamples(int limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<Sample> l = new ArrayList<>();
        for (Sample sample : samples) {
            if (sample.getAmplitude() > limit) {
                l.add(sample);
            }
        }
        return l;
    }

    @Override
    public ArrayList<Sample> getSamplesBefore(Time limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        ArrayList<Sample> l = new ArrayList<>();
        for (Sample s : samples) {
            if (s.getTime().compareTo(limit) < 0) {
                l.add(s);
            }
        }
        return l;
    }
}
