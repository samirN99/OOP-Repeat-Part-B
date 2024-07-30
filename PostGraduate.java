public class PostGraduate extends Applicant {
    // its the field that can store the name of the collage from which the applicant origanlly graduated
        private String originalCollege;

        // No-argument constructor
        public PostGraduate() {
            super();
        }

        // Parameterized constructor

        public PostGraduate(int caoNumber, String name, String college, int leavingCertPoints, String originalCollege) {         // initializes the postgrad obj with given values
            super(caoNumber, name, college, leavingCertPoints);             // Calls the parameterized constructor of the applicant superclass
            this.originalCollege = originalCollege;                                 // set the og collaege of the applicant
        }

        public String getOriginalCollege() {
            return originalCollege;
        }

        public void setOriginalCollege(String originalCollege) {
            this.originalCollege = originalCollege;
        }

        @Override
        public String toString() {
            return super.toString() + ", Original College=" + originalCollege + "]";
        }

        public boolean isFromInside() {
            return getCollege().equalsIgnoreCase(originalCollege);
        }

        // equals() and hashCode() should be inherited from Applicant class
        // because they are based on CAO number and name only
    }


