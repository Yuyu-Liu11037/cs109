import java.util.Scanner;

public class englishExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        int[] answers = new int[T];

        for(int i = 0; i < T ; i++){

            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();

            String[] l1 = line1.split(" ");
            int[] scores = new int[l1.length];
            for(int j = 0 ; j < scores.length; j++){
                scores[j] = Integer.parseInt(l1[j]);
            }

            String[] l2 = line2.split(" ");
            int[] days = new int[l2.length];
            for(int j = 0 ; j < days.length; j++){
                days[j] = Integer.parseInt(l2[j]);
            }

            int total = scores[0]+scores[1]+scores[2]+scores[3];
            if(total >= 100){
                System.out.println("0");
            } else
            {
                int neededScores = 100 - total;
                int daysRequired = 0;
                int[][] pair = {
                        {30 - scores[0], 30 - scores[1], 30 - scores[2], 30 - scores[3]},
                        {days[0],days[1],days[2],days[3]}
                };


                int index = 0;
                int min = pair[1][index];
                for (int k = 0; k < pair[1].length; k++){
                    if (pair[1][k] < min){
                        min = pair[1][k];
                        index = k;
                    }
                }

                if(neededScores <= pair[0][index]){
                    daysRequired += neededScores * pair[1][index];
                } else {
                    daysRequired += pair[0][index] * pair[1][index];
                    neededScores -= pair[0][index];

                    int index1 = 0;
                    int min1 = pair[1][index1];
                    for (int k = 0; k < pair[1].length; k++){
                        if (pair[1][k] < min1){
                            if(k != index){
                                min1 = pair[1][k];
                                index1 = k;
                            }
                        }
                    }

                    if(neededScores <= pair[0][index1]){
                        daysRequired += neededScores * pair[1][index1];
                    } else {
                        daysRequired += pair[0][index1] * pair[1][index1];
                        neededScores -= pair[0][index1];

                        int index2 = 0;
                        int min2 = pair[1][index2];
                        for (int k = 0; k < pair[1].length; k++){
                            if (pair[1][k] < min2){
                                if(k != index && k != index1){
                                    min2 = pair[1][k];
                                    index2 = k;
                                }
                            }
                        }

                        if(neededScores <= pair[0][index2]){
                            daysRequired += neededScores * pair[1][index2];
                        } else {
                            daysRequired += pair[0][index2] * pair[1][index2];

                            int index3 = 0;
                            int max = pair[1][index3];
                            for (int k = 0; k < pair[1].length; k++){
                                if (pair[1][k] >= max){
                                    max = pair[1][k];
                                    index3 = k;
                                }
                            }
                            daysRequired += pair[0][index3] * pair[1][index3];
                        }
                    }
                }
                answers[i] = daysRequired;
            }
        }

        for(int i : answers){
            System.out.println(i);
        }
        scanner.close();
    }
}

