package arrayList;

public class Pair<X , Y> {
    X a;
    Y b;
    //Pair(){}
    Pair(X a , Y b){
        this.a = a;
        this.b = b;
    }
    void getPair(){
        System.out.println(a + " : " + b);
    }
}
