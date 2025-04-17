package lists;

public class Priority {
    public static final int normal = 0;
    public static final int urgent = 1;

    public static String toString(int priority) {
        return priority == 0 ? "N" : "U";
    }
}

