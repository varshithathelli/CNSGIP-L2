public class mobilephone implements telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean ispoweron;

    public mobilephone(String myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void poweron() {
          ispoweron=true;
          System.out.println("powered on");
    }

    @Override
    public void dial(String phonenumber) {
        System.out.println("New ringing"+phonenumber+"on desktop");
    }

    @Override
    public void answer() {
        if(isRinging && ispoweron){
            System.out.println("Answering the phone");
            isRinging=false;
        }else{
            System.out.println("not ringing");
        }
    }

    @Override
    public boolean callphone(String phonenumber) {
        if(phonenumber==myNumber &&ispoweron){
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
