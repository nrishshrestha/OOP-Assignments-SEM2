public class SimpleInterest {
    private float principle;
    private float time;
    private float rate;
    public float simpleInterest;

    public SimpleInterest(float principle,float time,float rate){
        this.principle=principle;
        this.time=time;
        this.rate=rate;
        simpleInterest = (principle*time*rate)/100;
    }

    public void setPrinciple(float principle){
        this.principle=principle;
    }
    public float getPrinciple(){
        return principle;
    }

    public void setTime(float time){
        this.time=time;
    }
    public float getTime(){
        return time;
    }

    public void setRate(float rate){
        this.rate=rate;
    }
    public float getRate(){
        return rate;
    }
}

class SimpleInteresta{
    public static void main(String[] args) {
        SimpleInterest simpleInterestOne = new SimpleInterest(1000,2,5);
        System.out.println(simpleInterestOne.simpleInterest);
    }
}
