public class Main {
    public static void main(String[] args) {
        int time = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (isSymmetric(hour, minute)) {
                    time++;
                }
            }
        }

        System.out.println("Кількість співпадінь симетричних комбінацій: " + time);
    }

    public static boolean isSymmetric(int hour, int minute) {
        int reversedMinute = (minute % 10) * 10 + minute / 10;
        return hour / 10 == reversedMinute % 10 && hour % 10 == reversedMinute / 10;
    }
}