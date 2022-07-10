
public class ConcatAB {
         String a;
         String b;

        public ConcatAB(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public String getA() {

            return a;
        }

        public String getB() {

            return b;
        }

        @Override
        public String toString() {
            return "-->" + " {a: " + a + " b:"+ b + "}";
        }
    }
