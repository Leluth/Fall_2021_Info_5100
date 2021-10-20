package Question1;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Question1.HappyObject
 * @date 2021/10/19 18:47
 */
public class HappyObject extends MoodyObject {
    /**
     * returns string indicating happy
     */
    @Override
    String getMood() {
        return "happy";
    }

    /**
     * print laughter string “heeehee....hahahah...HAHAHA!!”
     */
    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    /**
     * returns message about self : “Subject laughs a lot”
     */
    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
