package transport;

public enum Size {
    XS (0, 10),
    S (11, 24),
    M (25, 49),
    L (50, 79),
    XL (80, 120);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public static Size getValue (int value) {
        for (Size i : Size.values()){
            if (value >= i.getMin() && value <= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Вместимость: " +
                "от " + min +
                " до " + max;
    }
}
