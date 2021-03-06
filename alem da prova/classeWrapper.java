class classeWrapper {
    public static void main(String[] args){

        Double d1 = new Double(22.5);  
        Double d2 = new Double("22.5");
        Double d2 = new Double("abc"); //throws NumberFormatException

        Character c = new Character('d');

        Boolean b1 = new Boolean(true);   // true
        Boolean b2 = new Boolean("true"); // true
        Boolean b3 = new Boolean("TrUe"); // true
        Boolean b4 = new Boolean("T");    // false

        Long l = new Long("123");

        byte b = l.byteValue();
        double d = l.doubleValue();
        int i = l.intValue();
        short s = l.shortValue();

        double d = Double.parseDouble("23.4");
        long l = Long.parseLong("23");
        int i = Integer.parseInt("444");

        short i1 = Short.parseShort("11",10); // 11  Decimal
        int i2 = Integer.parseInt("11",16);   // 17  HexaDecimal
        byte i3 = Byte.parseByte("11",8);     // 9   Octal
        int i4 = Integer.parseInt("11",2);    // 3   Binary
        int i5 = Integer.parseInt("A",16);    // 10  HexaDecimal
        int i6 = Integer.parseInt("FF",16);   // 255 HexaDecimal

        Double d = Double.valueOf("23.4");
        Long l = Long.valueOf("23");
        Integer i1 = Integer.valueOf("444");        
        Integer i2 = Integer.valueOf("5AF", 16);

        String d = Double.toString(23.5);
        String s = Short.toString((short)23);
        String i = Integer.toString(23);
        String l = Long.toString(20, 16);

    }
}