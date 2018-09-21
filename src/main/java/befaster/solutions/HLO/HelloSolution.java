package befaster.solutions.HLO;

public class HelloSolution {
    public String hello(String friendName) {
        String message = "world";
        if (friendName == "John") {
            message = friendName;
        }
        return "Hello, " + message + "!";
    }
}