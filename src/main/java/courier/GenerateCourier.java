package courier;

import courier.Courier;

public class GenerateCourier
{
    public static Courier getOrderListCourier() {
        return new Courier("nehochyspat", "642908", "alex90");
    }

    public static Courier getDefault() {
        return new Courier(Generator.generateNew(), "642908", "alex90");
    }

    public static Courier existedLogin() {
        return new Courier("test828", "3333", "alex1");
    }

    public static Courier existedLogin1() {
        return new Courier("test828", "34444", "alex2");
    }

    public static Courier createWithoutPassword() {
        return new Courier("you90", "alex3");
    }

}

