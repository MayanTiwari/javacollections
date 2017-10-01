package roughWork;

import java.util.Comparator;

/**
 * Created by mayan on 15/9/17.
 */
public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(final Customer customer, final Category category)
    {
        this.customer = customer;
        this.category = category;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Category getCategory()
    {
        return category;
    }

    public String toString()
    {
        return "roughWork.Enquiry{" +
                "customer='" + customer + '\'' +
                ", category=" + category +
                '}';
    }
}
