package book.ChapterFive;

public class ChapterFive22 {

    private static final int NUMBER_OF_DISTRICT = 64;
    private static final int NUMBER_OF_DAYS = 365;

    public static void main(String[] args) {
        // তাপমাত্রার তথ্য সংরক্ষণ করার জন্য একটি দ্বি-মাত্রিক অ্যারে তৈরি করি
        // বাংলাদেশের ৬৪টি জেলার এক বছরের জন্য (৩৬৫ দিন)
        double[][] temperatures
                = new double[NUMBER_OF_DISTRICT][NUMBER_OF_DAYS];

        // কিছু তাপমাত্রার তথ্য দিয়ে অ্যারে ইনিশিয়ালাইজ করি
        for (int i = 0; i < NUMBER_OF_DISTRICT; i++) {
            for (int j = 0; j < NUMBER_OF_DAYS; j++) {
                temperatures[i][j] = Math.random() * 40;
            }
        }

        // প্রতিটি জেলার গড় তাপমাত্রা গণনা করি
        double[] districtAverages = new double[NUMBER_OF_DISTRICT];
        for (int i = 0; i < NUMBER_OF_DISTRICT; i++) {
            districtAverages[i] = average(temperatures[i]);
        }

        // সারা বছরের জন্য সামগ্রিক গড় তাপমাত্রা গণনা করি
        double overallAverage = average(districtAverages);
        System.out.println("Overall average temperature: " + overallAverage);

        // প্রতিটি জেলার জন্য সর্বোচ্চ তাপমাত্রা গণনা করি
        double[] districtMaxes = new double[NUMBER_OF_DISTRICT];
        for (int i = 0; i < NUMBER_OF_DISTRICT; i++) {
            districtMaxes[i] = max(temperatures[i]);
        }

        // সারা বছরের জন্য সামগ্রিক সর্বোচ্চ তাপমাত্রা গণনা করি
        double overallMax = max(districtMaxes);
        System.out.println("Overall maximum temperature: " + overallMax);

        // প্রতিটি জেলার জন্য সর্বনিম্ন তাপমাত্রা গণনা করি
        double[] districtMins = new double[NUMBER_OF_DISTRICT];
        for (int i = 0; i < NUMBER_OF_DISTRICT; i++) {
            districtMins[i] = min(temperatures[i]);
        }

        // সারা বছরের জন্য সর্বনিম্ন তাপমাত্রা গণনা করি
        double overallMin = min(districtMins);
        System.out.println("Overall minimum temperature: " + overallMin);
    }

    //এই মেথড অ্যারের মানগুলির গড় রিটার্ন করে
    public static double average(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    //এই মেথড অ‍্যারে থেকে সর্বোচ্চ মান রিটার্ন করে
    public static double max(double[] values) {
        boolean seen = false;
        double best = 0;
        for (double value : values) {
            if (!seen || Double.compare(value, best) > 0) {
                seen = true;
                best = value;
            }
        }
        return seen ? best : Double.NaN;
    }

    //এই মেথড অ‍্যারে থেকে সর্বনিম্ন মান রিটার্ন করে
    public static double min(double[] values) {
        boolean seen = false;
        double best = 0;
        for (double value : values) {
            if (!seen || Double.compare(value, best) < 0) {
                seen = true;
                best = value;
            }
        }
        return seen ? best : Double.NaN;
    }
}


