public class SwitchCaseTest {
    public static void main(String[] args) {

        SwitchCase years = SwitchCase.lk;
        switch (years){
            case ak -> {
                System.out.println("this is my name");
                break;
            }
            case lk -> {
                System.out.println("ak");
                break;
            }
            default -> {
                System.out.println("invalid name");
            }
        }

    }
}
