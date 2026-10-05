public class CoinsAdventure implements Quest{

        @Override
        public String getName() {
            return "Searching coins...";
        }

        @Override
        public void complete(Character character) {
            int reward = 50;

            character.addCoins(reward);

            System.out.println(
                    "You find " + reward + " coins."
            );
        }
    }
