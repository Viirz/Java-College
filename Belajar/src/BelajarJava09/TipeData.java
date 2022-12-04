package BelajarJava09;

public class TipeData {
    public static void main(String[] args) {

        // Ini adalah tipe data di Java
        // integer, byte, short, long, double, float, char, boolean

        //byte (satuan)
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.printf("%s %d%n", "Nilai byte", b);
        System.out.printf("%s %d%n", "Nilai max", Byte.MAX_VALUE);
        System.out.printf("%s %d%n", "Nilai min", Byte.MIN_VALUE);
        System.out.printf("%s %d %s%n", "Besar byte", Byte.BYTES, "bytes");
        System.out.printf("%s %d%n", "Besar byte", Byte.SIZE, "bit");

        //short (satuan)
        short s = 10;
        System.out.println("======SHORT======");
        System.out.printf("%s %d%n", "Nilai short", s);
        System.out.printf("%s %d%n", "Nilai max", Short.MAX_VALUE);
        System.out.printf("%s %d%n", "Nilai min", Short.MIN_VALUE);
        System.out.printf("%s %d %s%n", "Besar short", Short.BYTES, "bytes");
        System.out.printf("%s %d %s%n", "Besar short", Short.SIZE, "bit");

        //interger (satuan)
        int i = 10;
        System.out.println("======INTEGER======");
        System.out.printf("%s %d%n", "Nilai integer", i);
        System.out.printf("%s %d%n", "Nilai max", Integer.MAX_VALUE);
        System.out.printf("%s %d%n", "Nilai min", Integer.MIN_VALUE);
        System.out.printf("%s %d %s%n", "Besar integer", Integer.BYTES, "bytes");
        System.out.printf("%s %d %s%n", "Besar integer", Integer.SIZE, "bit");

        //long (satuan)
        long l = 14l;
        System.out.println("======LONG======");
        System.out.printf("%s %d%n", "Nilai long", l);
        System.out.printf("%s %d%n", "Nilai max", Long.MAX_VALUE);
        System.out.printf("%s %d%n", "Nilai min", Long.MIN_VALUE);
        System.out.printf("%s %d %s%n", "Besar long", Long.BYTES, "bytes");
        System.out.printf("%s %d %s%n", "Besar long", Long.SIZE, "bit");

        //float (koma, bilangan real)
        float f = 10.5f;
        System.out.println("======FLOAT======");
        System.out.println("Nilai float " + f);
        System.out.println("Nilai max " + Float.MAX_VALUE);
        System.out.println("Nilai min " + Float.MIN_VALUE);
        System.out.println("Besar float " + Float.BYTES + " bytes");
        System.out.println("Besar float " + Float.SIZE + " bit");

        //double (koma, bilangan real)
        double d = 10.7d;
        System.out.println("======DOUBLE======");
        System.out.println("Nilai double " + d);
        System.out.println("Nilai max " + Double.MAX_VALUE);
        System.out.println("Nilai min " + Double.MIN_VALUE);
        System.out.println("Besar double " + Double.BYTES + " bytes");
        System.out.println("Besar double " + Double.SIZE + " bit");

        //char (karakter)
        char c = 't';
        System.out.println("======CHAR======");
        System.out.println("Nilai char " + c);
        System.out.println("Nilai max " + Character.MAX_VALUE);
        System.out.println("Nilai min " + Character.MIN_VALUE);
        System.out.println("Besar char " + Character.BYTES + " bytes");
        System.out.println("Besar char " + Character.SIZE + " bit");

        //boolean (nilai true/false)
        boolean val = true ;
        System.out.println("======BOOLEAN======");
        System.out.println("Nilai boolean " + val);
        System.out.println("Nilai max " + Boolean.TRUE);
        System.out.println("Nilai min " + Boolean.FALSE);


    }
}
