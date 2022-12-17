package structures;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import interfaces.Iterator;

public class Lab {
    public static void main(String[] args) {
        Lab lab = new Lab();
        lab.iterationExperiment();
    }

    public void iterationExperiment() {
        MyBag ds = new MyBag();
        List sample = new ArrayList(Arrays.asList(10, 20, 30, 40));
        ds.addAll(sample);
        Iterator iter = ds.toIterator();
        while (iter.hasNext())
            out.println(iter.next());
//        ds.display ();
    }

}
