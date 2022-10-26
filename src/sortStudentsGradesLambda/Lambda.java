package sortStudentsGradesLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lambda {

    static Scanner scanner = new Scanner(System.in);

    public static int questionAnswer(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }


    public static void main(String[] args) {

        //Nombre de matières
        int nbOfSubjects = 3;

        //Nombre d'étudiants
        int nbOfStudents = questionAnswer("Combien d'élèves ?");

        //Création du tableau des étudiants et des matières
        ArrayList<Integer>[][] gradesArray = new ArrayList[nbOfStudents][nbOfSubjects];

        //Remplisage du tableau avec les notes pour chaque élève et chaque matière
        for (int i = 0; i < nbOfStudents; i++) {
            System.out.println("Elève n° : " + (i + 1));
            for (int j = 0; j < nbOfSubjects; j++) {
                int nbOfGrades = questionAnswer("Combien de notes pour la matière " + (j + 1) + " ?");
                gradesArray[i][j] = new ArrayList<Integer>();
                for (int k = 0; k < nbOfGrades; k++) {
                    int grade = questionAnswer("Note N° " + (k + 1));
                    gradesArray[i][j].add(grade);
                }

            }
        }

        //Affichage des notes par élève et par matière. Affichage de la moyenne par matière.
        for (int i = 0; i < nbOfStudents; i++) {
            System.out.println("\n Résultats de l'élève n° " + (i + 1) + " : \n");
            for (int j = 0; j < nbOfSubjects; j++) {
                gradesArray[i][j].sort(Collections.reverseOrder());

                double sum = 0;
                for (Integer mark : gradesArray[i][j]) {
                    sum += mark;
                }

                double average = sum / gradesArray[i][j].size();
                System.out.println( (gradesArray[i][j].size() > 1 ? "Notes " : "Note ") + "de la matière " + (j + 1) + " : " + gradesArray[i][j]);
                System.out.println("Moyenne de la matière " + (j + 1) + " : "  + average);

            }
        }
    }
}
