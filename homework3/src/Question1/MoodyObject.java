package Question1;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question1.MoodyObject
 * @date 2021/10/19 18:39
 */
public abstract class MoodyObject {
    /**
     * Return the mood : sad or happy – depending on which object sends the message
     */
    abstract String getMood();
    /**
     * Each Object expresses a different motion
     */
    abstract void expressFeelings();

    /**
     * an object responds according to how it feels, print ”I feel Question1.HappyObject(or Question1.SadObject) today!!”
     */
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today!");
    }
}
