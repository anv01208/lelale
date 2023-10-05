
public class Papa {
    private static Papa instance;

    private Papa() {
        Integer age = 72;
        String carrier = "32 years";
    }

    public static Papa getInstance() {
        if (instance == null) {
            synchronized (Papa.class) {
                if (instance == null){
            instance = new Papa();
        }
    }
}
    return instance;
}
public String cheers(){
    return "Papa cheered you";
}


}


