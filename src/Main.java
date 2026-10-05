//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.naming.directory.InvalidAttributeValueException;
import java.util.Scanner;
void main() {

//    //Classes your_class;
//    Registration person = new Registration();
//    System.out.println("Please enter you nickname first and you gamer class call second");
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("===========NickName=============");
//    String nickname = scanner.nextLine();
//    person.SetName(nickname);
//    System.out.println("===========GamerClass=============");
// //   try{
//        String gc = scanner.nextLine();
//
//        switch (gc){
//            case "Archer":
//                person.SetClass(gc);
//                break;
//            case "Warrior":
//                person.SetClass(gc);
//                break;
//            case "Wizard":
//                person.SetClass(gc);
//                break;
//            default: System.out.println("Choose one of three classes (Warrior, Wizard, Archer)");
//            System.exit(1);
//            break;
//        }
////    } catch (RuntimeException e) {
////        throw new RuntimeException("Run")
////    }
//    person.GetStats(nickname, gc);
//
//    System.out.println("Do you want go to jorney? y/n");
//
//    String line = scanner.nextLine();
//
//    switch (line){
//        case "n":
//            System.out.println("Ok");
//            System.exit(0); // можно удалить System32
//        case "y":
//            StartJorney();
//        default: System.out.println("Choose y or n");
//        System.exit(1);
//        break;
//    }
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter nickname: ");
//    String nickname = scanner.nextLine();
//
//    System.out.print("Choose class: ");
//    String gameClass = scanner.nextLine();
//
//    Character character =
//            CharacterFactory.create(gameClass);
//
//    character.printStats(nickname);
//
//    character.reduceHp(20);
//    character.addCoins(50);
//
//    System.out.println();
//    System.out.println("After adventure:");
//
//    character.printStats(nickname);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter nickname: ");
    String nickname = scanner.nextLine();

    System.out.println("Choose class:");
    System.out.println("1 - Warrior");
    System.out.println("2 - Wizard");
    System.out.println("3 - Archer");
    System.out.print("> ");

    String choice = scanner.nextLine();

    String gameClass = switch (choice) {
        case "1" -> "Warrior";
        case "2" -> "Wizard";
        case "3" -> "Archer";
        default -> throw new IllegalArgumentException(
                "Chosen invalid class"
        );
    };

    Character character =
            CharacterFactory.create(gameClass);

    character.printStats(nickname);

    Adventure adventure =
            new Adventure(character, nickname);

    adventure.start();
}
