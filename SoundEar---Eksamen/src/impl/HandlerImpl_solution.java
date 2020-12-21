package impl;

import first_semester_eksamen.Handler;
import first_semester_eksamen.Sample;
import first_semester_eksamen.TimeFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HandlerImpl_solution implements Handler {

    @Override
    public String readFile(String filename) throws IOException {
        Scanner scanner = new Scanner(new File(filename));
        StringBuilder builder = new StringBuilder();
        scanner.nextLine();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            builder.append(line);
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }

    @Override
    public ArrayList<Sample> getSamples(String data) throws TimeFormatException {
        ArrayList<Sample> l = new ArrayList<>();
        for(String line : data.split(System.lineSeparator())){
            String[] values = line.split(",");
            
            //date
            String date = values[0].trim();
            
            //time
            String _time = values[1].trim();
            Time time;
            try{
                time = new Time(_time);
            }catch(IllegalArgumentException e){
                throw new TimeFormatException(e.getMessage());
            }
            
            //amp
            String _amp = values[2].trim();
            int amp = Integer.parseInt(_amp);
            
            //peak
            if(values.length == 4){
                String _peak = values[3].trim();
                int peak = Integer.parseInt(_peak);
                //instantiate SlowSample and add to list
                l.add(new SlowSampleImpl(date, time, amp, peak));
            } else {
                //instantiate Sample and add to list
                l.add(new SampleImpl(data, time, amp));
            }
        }
        return l;
    }

    @Override
    public Sample getHighestAmplitude(ArrayList<Sample> samples) {
        Sample highest = samples.get(0);
        for (int i = 1; i < samples.size(); i++) {
            Sample s = samples.get(i);
            if(s.getAmplitude() > highest.getAmplitude())
                highest = s;
        }
        return highest;
    }

    @Override
    public Sample getBiggestRise(ArrayList<Sample> samples) {
        int biggestRise = 0;
        Sample biggestRiseSample = samples.get(0);
        for (int i = 1; i < samples.size(); i++) {
            Sample current = samples.get(i);
            Sample prev = samples.get(i-1);
            int rise = current.getAmplitude() - prev.getAmplitude();
            if(rise > biggestRise){
                biggestRise = rise;
                biggestRiseSample = current;
            }
        }
        return biggestRiseSample;
    }

    @Override
    public boolean isTooLoud(int limit, ArrayList<Sample> samples) {
        for (Sample s : samples) {
            if(s.getAmplitude() > limit) return true;
        }
        return false;
    }

    @Override
    public void sortByTime(ArrayList<Sample> samples) {
        Collections.sort(samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample t, Sample t1) {
                return t.getTime().compareTo(t1.getTime());
            }
        });

    }

    @Override
    public void sortByAmplitude(ArrayList<Sample> samples) {
        Collections.sort(samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample t, Sample t1) {
                return t.getAmplitude() - t1.getAmplitude();
            }
        });
        Collections.reverse(samples);
    }

    @Override
    public ArrayList<Sample> getLoudSamples(int limit, ArrayList<Sample> samples) {
        ArrayList<Sample> l = new ArrayList<>();
        for (Sample s : samples) {
            if(s.getAmplitude() >= limit)
                l.add(s);
        }
        return l;
    }

    @Override
    public ArrayList<Sample> getSamplesBefore(Time limit, ArrayList<Sample> samples) {
        ArrayList<Sample> l = new ArrayList<>();
        for (Sample s : samples) {
            if(s.getTime().compareTo(limit) < 0)
                l.add(s);
        }
        return l;
    }

}
