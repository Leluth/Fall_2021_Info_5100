package Question1;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question1.Psychiatrist
 * @date 2021/10/19 18:51
 */
public class Psychiatrist {
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();

        MoodyObject happyObject = new HappyObject();
        psychiatrist.examine(happyObject);
        System.out.println();
        psychiatrist.observe(happyObject);
        System.out.println();

        MoodyObject sadObject = new SadObject();
        psychiatrist.examine(sadObject);
        System.out.println();
        psychiatrist.observe(sadObject);
    }

    /**
     * asks moody object about its mood
     */
    public void examine(MoodyObject moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    /**
     * a moodyObject is observed to either laugh or cry
     */
    public void observe(MoodyObject moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: " + moodyObject);
    }

    /**
     * returns message about self : “Subject laughs a lot”
     */
    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
