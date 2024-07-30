public class Applicant {


    private int caoNumber;
    private String name;
    private String college;
    private int leavingCertPoints;

    public Applicant() {

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

    }
}

