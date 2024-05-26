package lesson9.taskNumber1;

public enum UserAnimalChoise {
    CAT(0),
    DOG(1),
    FISH(2);
    private final int userChoice;
    UserAnimalChoise(int userChoice){
        this.userChoice = userChoice;
    }
    public static UserAnimalChoise valueOf(int userChoice){
        UserAnimalChoise[] values = values();
        for (UserAnimalChoise value: values){
            if(value.userChoice == userChoice)
                return value;
        }
        return null;
    }

}
