import java.util.List;
public class FakultatInUniversitat {
        private String name;
        List<Studenten> studenten;

        public FakultatInUniversitat(String name, List<Studenten> studenten) {
            this.name = name;
            this.studenten = studenten;
        }

        public String getName() {
            return name;
        }

        public List<Studenten> getStudenten() {
            return studenten;
        }

        @Override
        public String toString() {
            return "FakultatInUniversitat: " + name + " " + studenten;
        }
    }

