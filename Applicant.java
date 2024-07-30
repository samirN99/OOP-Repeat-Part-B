public class Applicant {


    public int caoNumber;
    public String name;
    public String college;
    public int leavingCertPoints;

    public  Applicant() {
    }

    public Applicant(int caoNumber, String name, String college, int leavingCertPoints){
            this.caoNumber = caoNumber;
            this.name = name;
            this.college = college;
            this.leavingCertPoints = leavingCertPoints;
        }

        public int getCaoNumber() {
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
        public String toString() {
            return "Applicant [CAO Number=" + caoNumber + ", Name=" + name + ", College=" + college
                    + ", Leaving Cert Points=" + leavingCertPoints + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Applicant that = (Applicant) obj;
            return caoNumber == that.caoNumber && name.equals(that.name);
        }

        @Override
        public int hashCode() {
            int result = Integer.hashCode(caoNumber);
            result = 31 * result + name.hashCode();
            return result;
        }
    }
}


