package lesson10.taskNuber1;

public class Document {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Document(String number) {
        this.number = number;
    }

    public static boolean verificationNumber(String string) {
        String format = "[1-9]{4}-[a-zA-Z}]{3}-[1-9]{4}-[a-zA-Z]{3}-[1-9][a-zA-Z][1-9][a-zA-Z]";
        return string.matches(format);
    }

    public static void firstTwoBlocks(String string) {
        String[] blocks = string.split("-");
        System.out.println(blocks[0] + "-" + blocks[2]);
    }

    public static void numberWithStars(String string) {
        String[] block = string.split("-");
        block[1] = block[3] = "***";
        string = String.join("-", block);
        System.out.println(string);
    }
    public static void lowerCaseLetters(String string) {
        string = string.toLowerCase();
        String[] block = string.split("-");
        string = block[1] + "/" + block[3] + "/" + block[4].charAt(1) + "/" + block[4].charAt(3);
        System.out.println(string);
    }
    public static void upperCaseLetters(String string) {
        string = string.toUpperCase();
        String[] block = string.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Letters:").append(block[1]).append("/").append(block[3]).append("/").append(block[4].charAt(1)).append("/").append(block[4].charAt(3));
        System.out.println(stringBuilder);
    }
    public static void containsABC(String string) {
        string = string.toLowerCase();
        if(string.contains(string) == true)
            System.out.println("The document number contains the sequence abc");
        else
            System.out.println("The document number does not contain the sequence abc");
    }
    public static void numberStartsAt555(String string) {
        if(string.startsWith("555") == true)
            System.out.println("document number begins with the sequence 555");
        else
            System.out.println("document number does not start with the sequence 555");
    }
    public static void numberEndsWith1a2b(String string)
    {
        if(string.endsWith("1a2b") == true)
            System.out.println("document number ends with the sequence 1a2b");
        else
            System.out.println("document number does not end with the sequence 1a2b");
    }
}
