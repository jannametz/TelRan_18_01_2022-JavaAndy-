public class Student {

        private String fName;
        private String lName;
        private Double rate;

        public Student(String fName, String lName, Double rate) {
            this.fName = fName;
            this.lName = lName;
            this.rate = rate;
        }

        public String getFName() {
            return fName;
        }

        public String getLName() {
            return lName;
        }

        public Double getRate() {
            return rate;
        }


        @Override
        public String toString() {
            return  fName + " " + lName + " " + rate;
        }
    }

