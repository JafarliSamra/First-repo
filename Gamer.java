public class Gamer {
    public String full_name = "Qonaq oyuncu";
    public int score = 0;
    public int heart =3;

    public Gamer(String full_name){
        this.full_name = full_name;

        System.out.println(this.full_name + " xos geldin");

    }

    void setScore(int score) {
     this.score=score;

     System.out.println("tebrikler "+ full_name + "xaliniz ugurla yenilendi");
    }

    void setHeart(int heart){
    this.heart=heart;
    System.out.println("tebrikler "+full_name + "caniniz ugurla yenilendi");
    }

    void gameOver( String message){
        System.out.println("--------");
        System.out.println(message + " " +this.full_name);
        System.out.println("oyunu bitirdiniz");
        System.out.println("xal: " + this.score);
        System.out.println("can: " + this.heart);
        System.out.println("--------");
    }
     void correctAnswer(int score){
        System.out.println("tebrikler dogru cavab verdiniz");
        this.score+= score;

     }
     void wrongtAnswer(){
        System.out.println("teesufler yanlis verdiniz");
        this.heart--;
        if(this.heart <= 0) this.gameOver("teesufler");

        
     }
}
