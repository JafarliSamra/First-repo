public class Question {
    public String text;
    public String variantA;
    public String variantB;
    public String variantC;
    public int score ;
    public String correctAnswer;
    

    Question( String text, String variantA, String variantB, String variantC, int score, String correctAnswer){
        this.text=text;
        this.variantA=variantA;
        this.variantB=variantB;
        this.variantC=variantC;
        this.correctAnswer=correctAnswer;
        this.score=score;
        


    }
   
    
    void show(int no){
        System.out.println("----------");
        System.out.println(no+ " sual:");
        System.out.println(this.text);
        System.out.println("A) " + this.variantA);
        System.out.println("B) " + this.variantB);
        System.out.println("C) " + this.variantC);
        System.out.println("----------");
    }

    boolean isTrue(String answer){
        return this.correctAnswer.equals(answer);
    }
}
