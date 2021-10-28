package CarShopProject;

public class JobApplication {
    String name;
    double experience;
    String position;
    String education;


    public JobApplication(String name, double experience, String position, String education) {
        this.name = name;
        this.experience = experience;
        this.position = position;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public String getPosition() {
        return position;
    }

    public String getEducation() {
        return education;
    }

    public boolean requirements(double experience, String education, String position) {
        if (experience >= 2 && education.equals("higher") && position.equals("manager")) {
            return true;
        } else if (experience >= 1 && (education.equals("primary") || education.equals("higher") && (position.equals("seller") || position.equals("secretary")))) {
            return true;
        }else {
            return false;
        }
    }
}
