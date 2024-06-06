public class DESKPHONE implements telephone {
    private String myNumber;
    private boolean isRinging;

    public DESKPHONE(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void poweron() {
        System.out.println("Desk Phone is always powered on");
    }

    @Override
    public void dial(String phonenumber) {
        System.out.println("New ringing"+phonenumber+"on desktop");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the phone");
            isRinging=false;
        }else{
            System.out.println("not ringing");
        }
    }

    @Override
    public boolean callphone(String phonenumber) {
        if(phonenumber==myNumber){
            isRinging=true;
            System.out.println("phone ringing");
        }else{
           // System.out.println("");
           isRinging=false;
        }
        return isRinging();
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
