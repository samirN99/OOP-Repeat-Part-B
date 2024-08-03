public class Applicant {


    private int caoNumber;
   private String name;
    private String college;
    private int leavingCertPoints;

    public  Applicant() {           // default constructor
    }

    public Applicant(int caoNumber, String name, String college, int leavingCertPoints){            //constructor with parameters
            this.caoNumber = caoNumber;                                                             //assign parameter values to class field
            this.name = name;
            this.college = college;
            this.leavingCertPoints = leavingCertPoints;
        }

        public int getCaoNumber() {                                                 //getters and setters for each variable
            return caoNumber;
        }

        public void setCaoNumber(int caoNumber) {
            this.caoNumber = caoNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCollege() {
            return college;
        }

        public void setCollege(String college) {
            this.college = college;
        }

        public int getLeavingCertPoints() {
            return leavingCertPoints;
        }

        public void setLeavingCertPoints(int leavingCertPoints) {
            this.leavingCertPoints = leavingCertPoints;
        }
        @Override
        public String toString() {                          //override toString method to provide string representation of the object
            return "Applicant [CAO Number=" + caoNumber + ", Name=" + name + ", College=" + college
                    + ", Leaving Cert Points=" + leavingCertPoints + "]";
        }

        @Override
        public boolean equals(Object obj) {                  // Overriding equals method to compare two Applicant objects
            if (this == obj) return true;                   //check if the compared obj is from the same instance
            if (obj == null || getClass() != obj.getClass()) return false;          // check if the compared obj is null or not from the same class
            Applicant that = (Applicant) obj;                                          // cast the onj to applicat
            return caoNumber == that.caoNumber && name.equals(that.name);               // compare fields
        }

        @Override
        public int hashCode() {
            int result = Integer.hashCode(caoNumber);
            result = 31 * result + name.hashCode();
            return result;
        }
    }



