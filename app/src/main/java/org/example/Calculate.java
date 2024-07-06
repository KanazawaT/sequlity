package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sigma(int x, int y) {
    return y * (x + y) / 2;
  }

  public int odd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int even(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

}
