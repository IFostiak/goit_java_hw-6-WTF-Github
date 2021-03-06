class NameParser {
    public String parse(String[] names) {
        int count = names.length;
        int cnt = 0;
        StringBuilder preResult = new StringBuilder();
        for (String oneName : names
        ) {
            preResult.append(oneName.split(" ")[0]);
            if (cnt < count - 1) {
                preResult.append(", ");
            }
            cnt++;

        }
        return preResult.toString();

    }
}
class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}