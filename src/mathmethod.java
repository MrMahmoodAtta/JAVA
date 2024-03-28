public class mathmethod {
    public static void main(String[] args) {
        //System.out.println(Math.sin(Math.PI/6));
        // ceil makes round up
        //System.out.println(Math.ceil(-2.1));

        //floor makes round down
        //System.out.println(Math.floor(2.1));
        //System.out.println(Math.floor(-2.1));

        //  makes round up or round down
//        System.out.println(Math.max(2,3));
//        System.out.println(Math.min(2,3));
//        System.out.println(Math.abs(-5));

        //random
        // from 0 to 1
        //System.out.println(Math.random());

        // from o to 39
        //System.out.println(Math.random()*40);

        // from 30 to 60
        //System.out.println(30+Math.random()*31);

        // generating random characters
        System.out.println((char)('c'+Math.random()*('q'-'a'+1)));
    }

}
