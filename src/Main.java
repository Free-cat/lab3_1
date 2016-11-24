import com.sun.istack.internal.NotNull;

public class Main {

    public static void main(String[] args) {

        int j= 0,k = 0;
        excellent[] excellents = new excellent[20];
        Good[] Goods = new Good[20];
        for(int i = 0; i < 20; i++) {
            int randomYspev = 1 + (int)(Math.random() * 5); // Случайная успеваемость от 1 до 5
            int randomSummary = 10 + (int)(Math.random() * 20); // Случайная общая успеваемость от 10

            if (randomSummary > 20) {
                excellents[j] = new excellent(randomYspev, "Student"+i, randomSummary);
                j++;
            }

            if (randomSummary < 20 && randomSummary > 16) {
                Goods[k] = new Good(randomYspev, "Student"+i, randomSummary);
                k++;
            }
        }

        System.out.println("Отличники");
        for (int i=0; i<j; i++)
        {
            System.out.println(excellents[i].GetStudent() + " Успеваемость: " +  excellents[i].GetUspev());
        }

        System.out.println("Хорошисты");
        for (int i=0; i<k; i++)
        {
            System.out.println(Goods[i].GetStudent() + " Успеваемость: " +  Goods[i].GetUspev());
        }

    }
}
