public class Karam implements People{
    public String updateMood(String herMood){
        System.out.println();
        String x;
        System.out.println(herMood);
        x = switch (herMood) {
            case "period 😭" -> "\"Today's mood is: \"" + herMood +
                    "\nMimi: \"I'm on my period baby :((\"" +
                    "\n Roomi: awwww honey come here (> '.')> " +
                    "\n *Starts preparing some mate and a warm pack*" + "\033[33m";
            case "happy 🥺 (her family aren't being dickheads)" -> "Today's mood is: \"" + herMood +
                    "\nimi: \"get dressed daddy we're going for a picnic :3\"" +
                    "Roomi: \"Let's go then my love I'll be ready in a minute :)\"";
            case "feeling angry 😡 (uni people and studies are really getting on her nerve)" ->
                    "Mimi: \"BRO FUCK THIS UNI BRO, FUCK THESE NIGGAS UGHHHHH\"" +
                            "\nRoomi: \"ahh sit down and talk to me about it habibi 🥺\"";
            case "feeling super cute and sexy 💅🏻" -> "Mimi: \"goddamn this shirt looks good on me 📸\"" +
                    "\nRoomi: \"*in my head* she's the most beautiful woman I've ever seen 🥺\"";
            case "feeling horny 😈" -> "Mimi: \"get your sexy ass over here daddy 🫦💋🛏️👉🏻👌🏻\"" +
                    "\nRoomi: \"*already butt naked*\"";
            case "feeling smart ☝️🤓 (she has 2 months of studying to catch up to in 5 days)" ->
                    "Mimi: \"Yalla it's time to comeback 💪🏻 I have 69 midterms next week with only his dick on my mind\"" +
                            "\nRoomi: \"send me your material sweetie I'll help you out 🥺❤️\"";
            default -> "idk what she's feeling bro";
        };
        return x;
    }
}
