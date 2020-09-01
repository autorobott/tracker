package ru.job4j.lambda;

import jdk.jfr.StackTrace;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class MyFunc {
  public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
      List<Double> result = new ArrayList();
      for (int step = start; step <= end; step++) {
          result.add(func.apply((double) step));
      }
      return result;
  }
}