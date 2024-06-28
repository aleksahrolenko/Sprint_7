package order;

import java.util.ArrayList;

public class CreateOrderGenerator
{

    static String[] colors;


    public static CreateOrder getDefault()
    {
        return new CreateOrder(
                "Alex",
                "Khrolenko",
                "Stasova, street",
                5,
                "+79123121212",
                12,
                "20-10-2002",
                "Test comment",
                colors);
    }
}
