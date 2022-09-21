public class Studenten {
        private String name;
        private String geschlecht;
        private int age;
        private int kurs;
        private double note;

        public Studenten(String name, String geschlecht, int age, int kurs, double note) {
            this.name = name;
            this.geschlecht = geschlecht;
            this.age = age;
            this.kurs = kurs;
            this.note = note;
        }

        public String getName() {
            return name;
        }

        public String getGeschlecht() {
            return geschlecht;
        }

        public int getAge() {
            return age;
        }

        public int getCourse() {
            return kurs;
        }

        public double getNote() {
            return note;
        }

        @Override
        public String toString() {
            return  name + ": " + geschlecht + ", " + "age=" + age + ", kurs=" + kurs + ", note=" + note;
        }
    }

