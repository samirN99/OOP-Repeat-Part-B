import java.util.ArrayList;
import java.util.List;

public class App {
    public static void displayAllApplicants(List<Applicant> list) {             //display all applicants in the list
        for (Applicant applicant : list) {
            System.out.println(applicant);
        }
    }

    public static List<Applicant> getApplicantsPointsAboveCollege(List<Applicant> list, int boundary, String college) {     // get the applicants points who are above the boundary
        List<Applicant> filteredList = new ArrayList<>();
        for (Applicant applicant : list) {
            if (applicant.getLeavingCertPoints() > boundary && applicant.getCollege().equalsIgnoreCase(college)) {      // check if points above boundary and if they attend that collage
                filteredList.add(applicant);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Applicant> applicants = new ArrayList<>();
      //  applicants.add(new Applicant(caoNumber, "name", "collage", points));
        applicants.add(new Applicant(1001, "Alice", "University A", 450));
        applicants.add(new Applicant(1002, "Bob", "University B", 430));
        applicants.add(new Applicant(1003, "Charlie", "University A", 470));
        applicants.add(new PostGraduate(2001, "David", "University A", 500, "University A"));
        applicants.add(new PostGraduate(2002, "Eve", "University B", 520, "University C"));
        applicants.add(new PostGraduate(2003, "Frank", "University A", 540, "University B"));

        System.out.println("All Applicants:");
        displayAllApplicants(applicants);

        List<Applicant> filteredApplicants = getApplicantsPointsAboveCollege(applicants, 440, "University A");

        System.out.println("\nFiltered Applicants:");
        displayAllApplicants(filteredApplicants);


        System.out.println("\nPostGraduate Applicants Applying to the Same College as Original:");
        for (Applicant applicant : applicants) {
            if (applicant instanceof PostGraduate) {
                PostGraduate pg = (PostGraduate) applicant;
                if (pg.isFromInside()) {
                    System.out.println(pg);
                }
            }
        }
    }
}