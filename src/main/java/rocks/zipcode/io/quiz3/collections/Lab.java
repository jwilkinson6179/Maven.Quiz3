package rocks.zipcode.io.quiz3.collections;

import static rocks.zipcode.io.quiz3.collections.LabStatus.*;

/**
 * @author leon on 10/12/2018.
 */
public class Lab
{
    String labName;
    LabStatus labStatus;

    public Lab()
    {
        this(null);
    }

    public Lab(String labName)
    {
        this.labName = labName;
        this.labStatus = PENDING;
    }

    public String getName()
    {
        return labName;
    }

    public void setStatus(LabStatus labStatus)
    {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
