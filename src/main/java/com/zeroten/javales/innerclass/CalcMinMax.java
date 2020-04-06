package com.zeroten.javales.innerclass;

public class CalcMinMax {
    public static int[] calc(int... numbs) {
        Integer min = null;
        Integer max = null;
        for (int num : numbs) {
            if (min == null || min > num) {
                min = num;
            }
            if (max == null || max < num) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    public static Pair calc2(int... numbs) {
        Integer min = null;
        Integer max = null;
        for (int num : numbs) {
            if (min == null | min > num) {
                min = num;
            }
            if (max == null | max < num) {
                max = num;
            }
        }
        return new Pair(min, max);
    }

    protected static class Pair {
        private int minValues;
        private int maxValues;

        public Pair(int minValues, int maxValues) {
            this.minValues = minValues;
            this.maxValues = maxValues;
        }

        public int getMinValues() {
            return minValues;
        }

        public int getMaxValues() {
            return maxValues;
        }
    }
}
