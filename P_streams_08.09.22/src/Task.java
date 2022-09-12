public class Task {
        private int Number;
        private String description;
        private String status;
        private int daysInProcess;

        public Task(int number, String description, String status, int daysInProcess) {
            Number = number;
            this.description = description;
            this.status = status;
            this.daysInProcess = daysInProcess;
        }

        public int getNumber() {
            return Number;
        }

        public String getDescription() {
            return description;
        }

        public String getStatus() {
            return status;
        }

        public int getDaysInProcess() {
            return daysInProcess;
        }

        @Override
        public String toString() {
            return (Number + "->" + " " +  description + " " + status + " " + daysInProcess);
        }
    }

