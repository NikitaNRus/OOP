package Homeworks.HW3_1;

import java.util.ArrayList;
import java.util.List;

public interface Finder<T> {
    String findByName(Integer i, List<Corgi> corgiList);
}
