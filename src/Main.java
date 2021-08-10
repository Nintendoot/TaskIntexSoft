import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static String twoMaxNumbers(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        Integer firstMaxNumber = list.get(0);
        Integer secondMaxNumber = null;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > firstMaxNumber) {
                secondMaxNumber = firstMaxNumber;
                firstMaxNumber = list.get(i);
            } else {
                if (secondMaxNumber == null || secondMaxNumber < list.get(i))
                    secondMaxNumber = list.get(i);
            }
        }
        return stringBuilder.append("The first maximum number: ").append(firstMaxNumber).append(",the second largest number: ").append(secondMaxNumber).toString();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(56, 33, 3, 33, 2, 76, -5, 99,233));
        System.out.println(twoMaxNumbers(list));
    }
}
