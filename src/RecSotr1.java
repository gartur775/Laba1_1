import java.util.Scanner;

class Sotrudnik1{
    String fam1, im1, otch1, doljnost1;
    int kolDet;
    Rebenok[]reb=null;
}

class Rebenok{
    String imaR;
    int vozrast;
}

public class RecSotr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in, "cp1251");
        System.out.println("Введите количество сотрудников: ");
        int kol=sc.nextInt();
        sc.nextLine();

        Sotrudnik1[]sotr1=new Sotrudnik1[kol];
        System.out.println("Введите информацию о каждом сотруднике: ");
        for(int i=0; i< sotr1.length;i++){
            sotr1[i]=new Sotrudnik1();
            System.out.print("Введите фамилию "+(i + 1)+" сотрудника: ");
            sotr1[i].fam1=sc.nextLine();

            System.out.print("Введите его имя: ");
            sotr1[i].im1=sc.nextLine();

            System.out.print("Введите его отчество: ");
            sotr1[i].otch1=sc.nextLine();

            System.out.print("Введите его должность: ");
            sotr1[i].doljnost1=sc.nextLine();

            System.out.print("Введите количество детей: ");
            sotr1[i].kolDet=sc.nextInt();
            sc.nextLine();

            if (sotr1[i].kolDet!=0){
                sotr1[i].reb=new Rebenok[sotr1[i].kolDet];
                System.out.println("Дети: ");
                for(int j=0; j<sotr1[i].reb.length; j++){
                    sotr1[i].reb[j]=new Rebenok();

                    System.out.print("Введите имя " + (i + 1) + " ребенка: ");
                    sotr1[i].reb[j].imaR = sc.nextLine();

                    System.out.print("Введите его возраст: ");
                    sotr1[i].reb[j].vozrast = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\nСотрудники фирмы: \n фамилия \t имя \t отчество \t должность");
        for(Sotrudnik1 s : sotr1) {
            System.out.print(s.fam1 + "\t" + s.im1 + "\t" + s.otch1 + "\t" + s.doljnost1);
            System.out.println("\n Дети: ");
            for(Rebenok r : s.reb){
                System.out.println("\t\t\t" + r.imaR + "\t\t" + r.vozrast);
                System.out.println("\n");
            }
        }
    }
}
