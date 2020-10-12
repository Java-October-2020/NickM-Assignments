public class ProjectTest {
    public static void main(String[] args) {
        Project projects = new Project();
        
        // Project projectCar = new Project();
        // projectCar.setName("Fast Cars");
        // projectCar.setDescription("We're gonna make some fast cars!");
        // System.out.println(projectCar.pitchElevator());
       
        Project projectCar = new Project("Fast Cars" , "We're gonna make some fast cars!");
        System.out.println(projectCar.pitchElevator());
    }
}
