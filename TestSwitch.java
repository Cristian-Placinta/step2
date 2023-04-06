public class TestSwitch {
    public static void main(String[] args) {
        String language;
        int option = 3;
        switch(option) {
            case 1: 
                language = "RO"; break;
            case 2: 
                language = "RU"; break;
            case 3: 
                language = "EN"; break;
            default: 
                language = "Error";
        }

        System.out.println(language);
    }
}