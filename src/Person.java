public class Person {
        String name;
        static int lifeSpan = 60;
        static double ageFactor = 1.0;

        public Person () {

            name = "";
        }

        public Person (String aName) {

            name = aName;
        }

        public String getname () { return name;}
        public void setName (String aName) { name = aName;}
        public String toString () {
            return ("Hello, my name is " + name);
        }

        public String talk () {
            return ("I have nothing to say.");
        }

        public String walk () {
            return ("I have nwhere to go.");
        }

        public static double lifeSpan () {
            return(lifeSpan * ageFactor);
        }

    }

