public class StringDemo {


        public static void main(String[] args) {
            // Stringler aslında dizidir
            String mesaj = "  Bugün hava baya güzel   ";
            System.out.println("Eleman sayısı:" + mesaj.length());
            System.out.println("4. Eleman:" + mesaj.charAt(3));
            System.out.println(mesaj.concat(" hey"));
            System.out.println(mesaj.startsWith("B"));
            System.out.println(mesaj.endsWith("k"));
            char[] karakterler = new char[5];
            mesaj.getChars(0, 5, karakterler, 0);
            System.out.println(karakterler);
            System.out.println(mesaj.indexOf("a"));
            System.out.println(mesaj.lastIndexOf("a"));
            System.out.println(mesaj.replace(" ", "-"));
            String yeniMesaj = mesaj.replace("a", "e");
            System.out.println(yeniMesaj);
            System.out.println(mesaj.substring(3));
            System.out.println(mesaj.substring(3, 9));
            for (String kelime : mesaj.split(" ")) {
                System.out.println(kelime);

            }
            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());
            System.out.println(mesaj.trim());


        }
    }
