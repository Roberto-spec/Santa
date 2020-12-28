import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Поиск в ширину – Сначала текущая, все смежные, переходим к наследникам.
//        Поиск в глубину – Сначала текущая, дальше до смежной и вниз, потом вверх.


//  НОМЕР БИЛЕТА 18 ВАСЕВ РОСТИСЛАВ ИВАНОВИЧ
public class Main {
    public static void main(String[] args) {
        Queue<Jelanie> Santa = new LinkedList<>();

        Scanner scanner=new Scanner(System.in);
        int y;
        //Добавление желаний мин 1
        do{
            Types s= new Types();

            System.out.println("Выберите вид желания:");
            for (int i=0;i<s.getType().length;i++){
                System.out.println("["+i+"] "+s.getType()[i]);
            }

            int a;
            do {
                a=scanner.nextInt();
            }while(a<0&&a>s.getType().length);

            Jelanie p=new Jelanie(s.getType()[a]);

            Santa.offer(p);
            System.out.println("Добавить еще желаний в список санты?");
            System.out.println("[1] Да");
            System.out.println("[2] Нет");
            y=scanner.nextInt();

        }while(y!=2);
        //В моей версии санта приказывает эльфам выполнить н количество желаний
        System.out.println("Введите кол-во желаний, которые исполнят эльфы:");
        do {
            y = scanner.nextInt();
        }while (y>Santa.size()&y>0);
        Types s=new Types();
        int[] stat=new int[s.getType().length];
        for (int i=0;i<stat.length;i++) stat[i]=0;
        //Эльфы исполняют желания и собирают статистику
        for (int i=0;i<y;i++){

            for (int n=0;n<stat.length;n++) {
                if(Santa.peek().getJelanie()==s.getType()[n])stat[n]+=1;
            }
            Santa.poll();
        }
        //Итог проделанной работы эльфов
        System.out.println("Итог");
        for (int i=0;i<stat.length;i++){
            System.out.println("Было "+stat[i]+" "+s.getType()[i]);
        }





    }



}