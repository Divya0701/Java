public class DataTypes {
    public void practice(){
        //module operation performed
        System.out.println("Hello world!");
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);
        //type conversion
        float bb = 3.5f;
        int aa = (int)bb;
        System.out.println(aa);

        //type promotions [byte multiply by byte will give byte
        //300>257, so it will happen to be an error and then it will store in int
        byte da = 10;
        byte db = 30;
        int result = da*db;
        System.out.println(result);

        char checka = 97;
        System.out.println(checka);
    }
}
