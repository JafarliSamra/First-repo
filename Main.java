import java.util.Scanner;
public class Main{
        public static final Scanner input =new Scanner(System.in);
        public Gamer user ;
        public int index =0;
        public final Question[] questions = {
            new Question("2+2=?", "3", "7", "4", 1, "4"),
            new Question("4-2=?", "3", "2", "2", 1, "2"),
            new Question("2+2=?", "6", "7", "6", 2, "6"),
            new Question("12:3=?", "3", "7", "4", 2, "4"),
            new Question("2*(2+2)=?", "3", "8", "8", 3, "8")
        };
       

        public static void main(String[] args) {
        System.out.println("salam sual cavab oyununa xos geldiniz");
        Menu();

        }
        static void Menu() {
            System.out.println("********");
            System.out.println("1-daxil ol");
            System.out.println("2-oyuna basla");
            System.out.println("0-cixis");
            System.out.println("*********");
            System.out.print("secim edin");
            int menu=input.nextInt();


            switch(menu){
                case 1: Login(); break;
                case 2: StartGame(); break;
                default: Exit();
            }
        }
        static void Login(){

        }

        static void StartGame(){

        }
        static void Exit(){

        }

}