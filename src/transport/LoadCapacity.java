package transport;

public enum LoadCapacity {
    N1 (0f, 3.5f),
    N2 (3.6f, 12f),
    N3 (12.1f, 450f);

    private float min;
    private float max;

    LoadCapacity(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public static LoadCapacity getValue (int value) {
        for (LoadCapacity i : LoadCapacity.values()){
            if (value >= i.getMin() && value <= i.getMax()) {
                return i;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Грузоподъемность " +
                "min = " + min +
                ", max = " + max;
    }
}
