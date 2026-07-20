public class class1 {

    public static void main(String args[]){
        Student s = new Student("minseong",4);
        System.out.println("name: "+s.getName());
        System.out.println("score: "+s.getScore());
        // s.score=3;
        s.setName("peter");
        s.setScore(200);
        s.print();




    }
}


class Student{
    private String name;
    private int score;

    Student(String name, int score){
        this.name=name;
        this.score=score;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        if (score>=0 && score<=100) this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    void print(){
        System.out.println("이름 : "+this.name);
        System.out.println("점수 : "+this.score);
    }
}