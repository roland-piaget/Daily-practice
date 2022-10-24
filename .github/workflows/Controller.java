public class Controller {

    int number01;
    String ss01;



    public Controller(int number01,String ss01) {
        this.number01 = number01;
        this.ss01 = ss01;
    }

    /**
     * 练习各种循环
     */
    public int forPro(int x01) {

        for (int i = 1; i < 8; i++) {
            System.out.println("我必须输出"+i);

        }

        int y01 = x01;

        System.out.println("x01是几?"+x01);
        System.out.println("y01是几?"+y01);

        System.out.println("number01是几?"+number01);
        System.out.println("ss01是几?"+ss01);

        return y01;
    }
}
