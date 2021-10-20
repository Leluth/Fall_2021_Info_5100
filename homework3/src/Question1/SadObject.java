package Question1;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question1.SadObject
 * @date 2021/10/19 18:43
 */
public class SadObject extends MoodyObject {
    /**
     * returns string indicating sad
     */
    @Override
    public String getMood() {
        return "sad";
    }

    /**
     * print crying string “‘waah’  ‘boo hoo’  ‘weep’ ‘sob’”
     */
    @Override
    public void expressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }

    /**
     * returns message about self : “Subject cries a lot”
     */
    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
