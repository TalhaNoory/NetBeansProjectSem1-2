package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.Sample;
import first_semester_eksamen.TimeFormatException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HandlerImpl implements Handler {

    public static final String FILENAME = "Samples.csv";

    @Override
    public String readFile(String filename) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Sample> getSamples(String data) throws TimeFormatException {
//        throw new UnsupportedOperationException("Not supported yet.");
        ArrayList<Sample> dataInPut = new ArrayList();

        for (String line : data.split("\n")) {

            //Date
            String date = line.split(",")[0].trim();

            //Time
            String _time = line.split(",")[1].trim();
            Time time = new Time(_time);

            //Amp
            String _amp = line.split(",")[2].trim();
            int amp = Integer.parseInt(_amp);

            SampleImpl s = new SampleImpl(date, time, amp);
            dataInPut.add(s);

        }
        return dataInPut;

    }

    @Override
    public Sample getHighestAmplitude(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        Sample high = samples.get(0);
        for (Sample sample : samples) {
            if (sample.getAmplitude() > high.getAmplitude()) {
                high = sample;
            }
        }
        return high;
    }

    @Override
    public Sample getBiggestRise(ArrayList<Sample> samples) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        for (Sample sample : samples) {
            if (sample.getAmplitude() > limit) {
                return true;
            }
        }
        return false;

    }

    @Override
    public void sortByTime(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

//      Fik denne her kode fra TrialExam AKA Resturant-Eksamen fra Ronnie!
        Collections.sort(samples, Comparator.comparing(Sample::getTime));

    }

    @Override
    public void sortByAmplitude(ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

//        Denne kode fungere fint!
//        Comparator comp = new Comparator<Sample>() {
//            
//            @Override
//            public int compare(Sample s1, Sample s2) {
//                
//                return s2.getAmplitude() - s1.getAmplitude();
//            }
//        };
////        Collections.reverseOrder().compare(samples, comp);
//        Collections.sort(samples, comp);
//      Denne kode fungere også fint!
        Collections.sort(samples);

        Collections.sort(samples, (s1, s2) -> {
            return s2.getAmplitude() - s1.getAmplitude();
        });

    }

    @Override
    public ArrayList<Sample> getLoudSamples(int limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        ArrayList<Sample> loudSample = new ArrayList<>();

        for (int i = 0; i < loudSample.size(); i++) {
            if (loudSample.size() == limit) {

            }
        }
        return loudSample;
    }

    @Override
    public ArrayList<Sample> getSamplesBefore(Time limit, ArrayList<Sample> samples) {
//        throw new UnsupportedOperationException("Not supported yet.");

        //laver en ny array
        ArrayList<Sample> sb = new ArrayList<>();

        //nulstiller tiden, altså til ingenting
        Time time = null;
        for (Sample sample : sb) {

        }
        return null;

    }

}
