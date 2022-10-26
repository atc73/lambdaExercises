package sortNamesLambdaExo2;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amandine");
        names.add("Caroline");
        names.add("Céline");
        names.add("Carole");
        names.add("Brice");
        names.add("Baptiste");
        names.add("Ange");
        names.add("Bénédicte");
        names.add("Amadou");
        names.add("Annie");
        names.add("Cyril");
        names.add("Bastien");

        ArrayList<String> aNames = new ArrayList<>();
        ArrayList<String> bNames = new ArrayList<>();
        ArrayList<String> cNames = new ArrayList<>();

        names.forEach(name -> {
            if (name.startsWith("A")) {
                aNames.add(name);
            } else if (name.startsWith("B")) {
                bNames.add(name);
            } else {
                cNames.add(name);
            }
        });

        System.out.println(aNames);
        System.out.println(bNames);
        System.out.println(cNames);

    }
}
