package za.ac.cput.factory.user;

import za.ac.cput.entity.user.Auditor;

public class AuditorFactory {
    public static Auditor buildAuditor(
            String auditorID,
            String auditorFirstName,
            String auditorSurname,
            String cellphone)
    {

        return new Auditor.Builder()
                .auditorID(auditorID)
                .auditorFirstName(auditorFirstName)
                .auditorSurname(auditorSurname)
                .cellphone(cellphone)
                .build();
    }
}
